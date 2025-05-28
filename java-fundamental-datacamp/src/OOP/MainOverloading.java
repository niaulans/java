package OOP;

public class MainOverloading {

    static class Tesla {
        public void drive() {
            System.out.println("drive normally");
        }

        public void drive(boolean isDrivingBackward) {
            System.out.println("driving backward");
        }
    }

    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.drive(true);
    }
    
}
