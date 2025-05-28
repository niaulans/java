package DataTypeAndException;

import java.util.LinkedList;

public class ShoppingLinkedList {
    public static void main(String[] args) {
        LinkedList<String> shopList = new LinkedList<String>();

        shopList.addLast("milk");
        shopList.addLast("eggs");
        shopList.addLast("bread");
        shopList.addFirst("milk");
        shopList.set(3, "rye-bread");
        shopList.remove("milk");
        System.out.println(shopList);
		System.out.println(shopList.size());
    }
}
