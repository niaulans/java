package OOP;

public class MainInterface {
    
    interface ElectricCar {

        void activateSelfDriving();
    }

    static class Tesla implements ElectricCar{

        public void activateSelfDriving() {
            System.out.println("self driving is on");
        }
    }

    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.activateSelfDriving();
    }
}
