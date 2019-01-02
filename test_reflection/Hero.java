package test_reflection;

public class Hero {
    public String name;
    public float hp;
    public int damage;
    public int id;

    static {
        System.out.println("initial block");
    }
    
    public Hero() {
        this(null, 0L, 0, 0);
    }
    public Hero(String name, float hp, int damage, int id) {
        super();
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + ", id=" + id + "]";
    }
    
}
