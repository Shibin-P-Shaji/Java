abstract class Appliance {
    private int powerRating; 

    public Appliance(int powerRating) {
        this.powerRating = powerRating;
    }


    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    // Abstract methods
    public abstract void turnOn();
    public abstract void turnOff();
}
class Fan extends Appliance {
    public Fan(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Fan is ON. Power: " + getPowerRating() + "W");
    }

    public void turnOff() {
        System.out.println("Fan is OFF.");
    }
}
class Light extends Appliance {
    public Light(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Light is ON. Power: " + getPowerRating() + "W");
    }

    public void turnOff() {
        System.out.println("Light is OFF.");
    }
}
class AC extends Appliance {
    public AC(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("AC is ON. Power: " + getPowerRating() + "W");
    }

    public void turnOff() {
        System.out.println("AC is OFF.");
    }
}

public class HomeMain {
    public static void main(String[] args) {
        Appliance fan = new Fan(70);
        Appliance light = new Light(15);
        Appliance ac = new AC(1200);

        fan.turnOn();
        light.turnOn();
        ac.turnOn();

        fan.turnOff();
        light.turnOff();
        ac.turnOff();
    }
}



