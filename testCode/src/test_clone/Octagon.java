package test_clone;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    
    private double side;
    
    public Octagon() {
        this(1);
    }

    public Octagon(double side) {
        super();
        this.side = side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * this.side * this.side;
    }
    
    public double getPerimeter() {
        return 8 * this.side;
    }

    @Override
    public int compareTo(Octagon o) {
        return (int) (this.side - o.side);
    }
    
    @Override
    public Octagon clone() {
        Octagon octagon = new Octagon();
        octagon.setSide(this.side - 1);
        return octagon;
    }
    
    @Override
    public String toString() {
        return "Octagon [side=" + side + "]";
    }

    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);
        System.out.println("octagon : area = " + octagon.getArea() + "\tperimeter = " + octagon.getPerimeter());
        Octagon octagonByClone = null;
        octagonByClone = (Octagon) octagon.clone();
        System.out.println("octagon compared to octagonByClone : " + octagon.compareTo(octagonByClone));
    }
}
