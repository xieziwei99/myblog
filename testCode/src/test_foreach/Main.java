package test_foreach;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; ++i) {
            a[i] = i;
        }
        System.out.println("for : " + Arrays.toString(a));
        
        // foreach循环并不能改变原数组的值
        for (int i : a) {
            i = 8;
            System.out.print(i + " , ");
        }
        System.out.println("foreach : " + Arrays.toString(a));
    }
    
}
