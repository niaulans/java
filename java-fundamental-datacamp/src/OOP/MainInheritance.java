package OOP;

public class MainInheritance {
    
    static class Car {
        public String color;
        public String model;
        public int year;
        private int vehicleNumber;

        public Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
            this.vehicleNumber = 101189;
        }

        private void deployAirbags() {
            System.out.println("airbags deployed");
        }

        public void turnEngineOn() {
            System.out.println("engine is on");
        }

        public int calculateMPG(int milesDriven, int gallonsUsed) {
            return milesDriven / gallonsUsed;
        }
    }

    static class Toyota extends Car {
        public Toyota(String color, String model, int year) {
            super(color, model, year);
        }
    }

    public static void main(String[] args) {
        Toyota myToyota = new Toyota("black", "yaris", 2014);
        System.out.println(myToyota.model);
    }

}
