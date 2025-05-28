package DataTypeAndException;

import java.util.*;

public class AllTheCities {
    public static void main(String[] args) {
        String[] euCapitals = {"Paris", "London", "Prague"};

        ArrayList<String> capitals = new ArrayList<String>();
        Collections.addAll(capitals, "Lima", "Bogota", "Santiago");

        List<String> euCapitalsList = Arrays.asList(euCapitals);
        Collections.sort(capitals);
        Collections.reverse(capitals);

        System.out.println(capitals);
		System.out.println(euCapitalsList);
		System.out.println(euCapitals);
    }
}
