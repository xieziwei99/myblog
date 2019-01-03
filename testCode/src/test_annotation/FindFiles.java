package test_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class FindFiles {
    
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface FileTypes{
        FileType[] value();
    }
    
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(FileTypes.class)
    public @interface FileType{
        String value();
    }
    
    @FileType(".java")
    @FileType(".class")
    public void work() {
        try {
            FileType[] fileTypes = this.getClass().getMethod("work").getAnnotationsByType(FileType.class);
            for (FileType fileType : fileTypes) {
                System.out.println(fileType.value());
            }
            System.out.println("查找过程略。。。");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new FindFiles().work();
    }
}
