package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Hero;

public class HeroDAO {
    public HeroDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/hero?serverTimezone=UTC", "xzw", "12345678");
    }
    
    public int getTotal() {
        int total = 0;
        try (Connection connection = getConnection(); Statement statement = connection.createStatement();){
            
            String sql = "select count(*) from hero";
            
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                total = resultSet.getInt(1);
            }
            System.out.println("total : " + total);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }
    
    public void add(Hero hero) {
        String sql = "insert into hero values(null, ?, ?, ?)";
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            
            preparedStatement.setString(1, hero.getName());
            preparedStatement.setFloat(2, hero.getHp());
            preparedStatement.setInt(3, hero.getDamage());
            preparedStatement.execute();
            
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                hero.setId(id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(Hero hero) {
        String sql = "update hero set name= ?, hp = ? , damage = ? where id = ?";
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            
            preparedStatement.setString(1, hero.getName());
            preparedStatement.setFloat(2, hero.getHp());
            preparedStatement.setInt(3, hero.getDamage());
            preparedStatement.setInt(4, hero.getId());
            preparedStatement.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id) {
        try (Connection connection = getConnection(); Statement statement = connection.createStatement();){
            
            String sql = "delete from hero where id = " + id;
            statement.execute(sql);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Hero get(int id) {
        Hero hero = null;
        try (Connection connection = getConnection(); Statement statement = connection.createStatement();){
            String sql = "select * from hero where id = " + id;
            
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                hero = new Hero(id, resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hero;
    }
    
    public List<Hero> list(int start, int count){
        List<Hero> heros = new ArrayList<Hero>();
        String sql = "select * from hero order by id limit ?,?";
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            preparedStatement.setInt(1, start);
            preparedStatement.setInt(2, count);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Hero hero = new Hero(resultSet.getInt(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4));
                heros.add(hero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return heros;
    }
    
    public List<Hero> list() {
        return list(0, Short.MAX_VALUE);
    }
}
