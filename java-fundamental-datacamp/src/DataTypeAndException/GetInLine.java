package DataTypeAndException;

import java.util.concurrent.ArrayBlockingQueue;

public class GetInLine {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> waitList = new ArrayBlockingQueue<String>(3);

        waitList.offer("Sally");
        waitList.offer("Benny");
        waitList.add("Tarah");
        System.out.println(waitList);
        waitList.offer("Letty");
        String first = waitList.poll();
        System.out.println(first);
        waitList.offer("Letty");
        System.out.println(waitList);
    }    
}
