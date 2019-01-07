package bean;

public class Hero {
    private int id;
    public String name;
    public float hp;
    public int damage;
    
    public Hero() {
        this(0, null, 0L, 0);
    }
    public Hero(int id, String name, float hp, int damage) {
        super();
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + "]";
	}
    
}
