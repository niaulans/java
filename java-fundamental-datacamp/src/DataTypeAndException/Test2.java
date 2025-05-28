package DataTypeAndException;

public class Test2 {
    
    public static void main(String[] args) {
        Movie jaws = new Movie();
        jaws.setTitle("Jaws");
        jaws.setDirector("Spielberg");
        jaws.setRating("PG");

        System.out.println(jaws.getRating());
    }
}
