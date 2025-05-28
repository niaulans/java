package OOP;

public class MainAbstractMethod {

    static abstract class Car {
        public Car() {

        }

        public abstract void soundHorn();
    }

    static class Toyota extends Car {
        public Toyota() {
            super();
        }

        public void soundHorn() {
            System.out.println("sounds like a toyota");
        } 
    }

    static class Mercedes extends Car {
        public Mercedes() {
            super();
        }

        public void soundHorn() {
            System.out.println("sounds like a mercedes");
        }
    }

    public static void main(String[] args) {
        Toyota myToyota = new Toyota();
        Mercedes myMercedes = new Mercedes();

        myToyota.soundHorn();
        myMercedes.soundHorn();
    }
    
}
