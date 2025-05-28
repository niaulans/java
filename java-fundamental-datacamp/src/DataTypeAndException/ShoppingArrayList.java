package DataTypeAndException;

import java.util.ArrayList;

public class ShoppingArrayList {
    public static void main(String[] args) {

        ArrayList<String> shopList = new ArrayList<String>();

        shopList.add("milk");
        shopList.add("eggs");
        shopList.add("bread");
        shopList.add("milk");
        shopList.set(2, "rye-bread");
        shopList.remove("milk");
        System.out.println(shopList);
        System.out.println(shopList.size());
    }
}
