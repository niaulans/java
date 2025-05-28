package IntermediateJava;

public class GreeterParameter {
    
    static void specificGreeter (String name) {
        System.out.println("Nice day to you, " + name + "!");
    }

    public static void main (String[] args) {

        String firstName = "Caleb";
        specificGreeter(firstName);
    }
}
