package test_clone;

import java.util.Arrays;

public class TestClone {

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        int[] b = a.clone();
        System.out.println(Arrays.toString(b));
        
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = octagon1.clone();
        System.out.println(octagon1.toString());
        System.out.println(octagon2.toString());
        
        Octagon[] octagons1 = new Octagon[3]; 
        for (int i = 0; i < octagons1.length; i++) {
            octagons1[i] = new Octagon(i + 1);
        }
        Octagon[] octagons2 = octagons1.clone();
        System.out.println(Arrays.toString(octagons1));
        System.out.println(Arrays.toString(octagons2));
    }

}
