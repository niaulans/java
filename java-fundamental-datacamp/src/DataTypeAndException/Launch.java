package DataTypeAndException;

import java.math.BigDecimal;

public class Launch {
    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        rocket.setName("Saturn");
        rocket.setThrust(new BigDecimal("7770000"));
        rocket.setManned(true);
        fire(rocket);
    }

    public static void fire(Rocket r) {
        BigDecimal newtons = r.getThrust().divide(new BigDecimal(224));
        System.out.println("We have liftoff: " + r.getName());
        System.out.println("Thrust is: " + newtons + " newtons of energy");

    }
}
