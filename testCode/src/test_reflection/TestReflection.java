package test_reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestReflection {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        try {
            // 使用反射的方式创建对象
            Class class1 = Class.forName("test_reflection.Hero");
            Constructor<Hero> constructor = class1.getConstructor();
            Hero hero = constructor.newInstance();
            hero.setId(1);
            hero.setDamage(10);
            hero.setHp(100);
            hero.setName("ala");
            System.out.println(hero);
            
            // 使用反射机制访问属性
            Field field = hero.getClass().getDeclaredField("name");
            field.set(hero, "aha");
            System.out.println(hero);
            
            // 使用访问属性调用方法
            Method method = hero.getClass().getMethod("setName", String.class);
            method.invoke(hero, "aka");
            System.out.println(hero);
            
            // 用途
            Properties serviceConfig = new Properties();
            serviceConfig.load(new FileInputStream(new File("E:\\eclipse-java\\testCode\\src\\test_reflection\\service.txt")));
            Class clazz = Class.forName((String) serviceConfig.get("class"));
            Method method2 = clazz.getMethod((String)serviceConfig.get("method"));
            Constructor constructor2 = clazz.getConstructor();
            Object service = constructor2.newInstance();
            method2.invoke(service);
            
//            Class class2 = Hero.class;
//            Class class3 = new Hero().getClass(); 
//            System.out.println(class1==class2);
//            System.out.println(class1==class3);
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
