package IntroductionToJava;

public class HowLong {
    public static void main(String[] args) {
        String bookName = "Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch";

        int bookNameLength = bookName.length();

        int authorNameLength = "Terry Pratchett".length();

        System.out.println("The length of the book title is " + bookNameLength);
        System.out.println("The length of the author's name is " + authorNameLength);
    }
}
