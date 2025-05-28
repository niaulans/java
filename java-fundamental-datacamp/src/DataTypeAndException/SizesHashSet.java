package DataTypeAndException;

import java.util.HashSet;

public class SizesHashSet {
    
    public static void main(String[] args) {
        HashSet<Integer> heights = new HashSet<Integer>();

        heights.add(72);
        heights.add(64);
        heights.add(66);
        heights.remove(64);
        heights.add(null);
        System.out.println(heights);
    }
}
