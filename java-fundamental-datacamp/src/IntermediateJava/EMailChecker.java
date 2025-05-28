package IntermediateJava;

public class EMailChecker {
    public static void main(String[] args) {

        String address = "martin.doeb@datacamp.com";
        int addLen = address.length();

        if (address.contains("@") && address.charAt(addLen - 4) == '.') {
            System.out.println("Send that email!");
        } else {
            System.out.println("That's not a valid email");
        }
    }    
}
