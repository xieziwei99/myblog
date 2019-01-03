package test_BitSet;

import java.util.BitSet;

public class BitSetDemo {

    public static void main(String[] args) {
        BitSet set1 = new BitSet();
        BitSet set2 = new BitSet();
        
        for (int i = 0; i < 16; i++) {
            if (0 == i % 2) set1.set(i);
            if (0 == i % 5) set2.set(i);
        }
        System.out.println("Initial pattern in set1: ");
        System.out.println(set1);
        System.out.println("\nInitial pattern in set2: ");
        System.out.println(set2);
        
        set2.and(set1);
        System.out.println("\nset2 AND set1: ");
        System.out.println(set2);
    
        set2.or(set1);
        System.out.println("\nset2 OR set1: ");
        System.out.println(set2);
    

        set2.xor(set1);
        System.out.println("\nset2 XOR set1: ");
        System.out.println(set2);
    }

}
