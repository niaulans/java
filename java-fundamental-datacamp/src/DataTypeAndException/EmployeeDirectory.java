package DataTypeAndException;

import java.util.HashMap;

public class EmployeeDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> directory = new HashMap<Integer, String>();

        directory.put(23, "Joye");
        directory.put(31, "Marcia");
        directory.put(45, "Davy");
        System.out.println(directory);

        String name = directory.get(31);
        System.out.println(name);

        directory.remove(45);
        System.out.println(directory);
    }
}
