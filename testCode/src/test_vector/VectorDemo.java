package test_vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Vector v = new Vector(3, 2);        // 3为初始容量，2为向量超出容量时的容量增量
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.addElement(1);
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));       // 添加4时，容量超出，故容量增长2，变成5
        System.out.println("Capacity after four additions: " + v.capacity());
        
        v.addElement(new Double(5.45));
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + (Integer)v.lastElement());
        if(v.contains(new Integer(3)))
           System.out.println("Vector contains 3.");
        
        @SuppressWarnings("rawtypes")
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");
        while(vEnum.hasMoreElements())
           System.out.print(vEnum.nextElement() + " ");
        System.out.println();
        
        for (int i = 0; i < v.size(); ++i) {
            System.out.print(v.get(i) + " ");
        }
        System.out.println();
    }

}
