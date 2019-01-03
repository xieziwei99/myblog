package test_Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        
        days = dayNames.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
        
        for (int i = 0; i < dayNames.size(); ++i) {
            System.out.print(dayNames.get(i) + " ");
        }
        System.out.println();
    }

}
