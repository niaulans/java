package IntermediateJava;

public class GraderTwo {
    
    public static void main(String[] args) {
        int grade = 14;
        
        if (grade < 10) {
            System.out.println("Failing grade");
        } else if (grade < 14) {
            System.out.println("Passing grade");
        } else if (grade < 18) {
            System.out.println("With distinction");
        } else {
            System.out.println("With the highest distinction");
        }
    }
}
