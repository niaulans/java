package DataTypeAndException;

import java.util.LinkedList;

public class Averaging {

    public static void main(String[] args) {

        LinkedList<Double> prices = new LinkedList<Double>();
        
        prices.add(5.60);
        prices.addLast(9.65);
        prices.add(3.40);
        prices.addFirst(1.35);
        System.out.println(prices);

        Double total = 0.0;

        for (Double price: prices) {
            total += price;
        }
        System.out.println("Average price: " + total/ prices.size());

    }
}