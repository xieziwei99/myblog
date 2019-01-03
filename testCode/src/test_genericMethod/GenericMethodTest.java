package test_genericMethod;

public class GenericMethodTest {
    
    public static <T> void printArray(T[] inputArray) {     // 有一个类型参数声明部分 <T>, 该类型参数声明部分在方法返回类型之前
        for (T t : inputArray) {                            // 返回值类型也可以是类型参数 <T>
            System.out.print(t + " ");
        }
        System.out.println();
    }
    
    public static <T> void printNum(T inputNum) {
        System.out.println(inputNum);
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
//        int[] a = { 1, 2, 3, 4, 5 };
        
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
        
        printNum(2);
        printNum(3.9);
        printNum("Hello");
        
        int aa = 9;     // 正确
        printNum(aa);
//        printArray(a);        ERROR : 类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。
    }

}
