package test_Enums_random;

import java.util.Random;

public class Enums {
    private static long seed = (long) (Math.random() * 10);
    private static Random random = new Random(seed);

    // 两个 random 方法构成重载
    
    // 返回一个泛型数组的随机一个元素
    public static <T> T random(T[] values) {
        return values[random.nextInt(values.length)];
    }
    
    // <T extends Enum<T>> 限定上界只能是 Enum 或 Enum 的子类
    // Class<T> 代表类型为 T 的类，即此处 ec 为类型为 T 的一个类
    // ec.getEnumConstants() 返回 Enum 类中 由 成员变量 按顺序组成的一个数组
    public static <T extends Enum<T>> T random(Class<T> ec) {
        // 此处调用上一个 random 函数
        return random(ec.getEnumConstants());
    }
}
