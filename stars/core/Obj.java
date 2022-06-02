package stars.core;

//Class
public class Obj {

    // properties, members
    String colour;
    String make;
    Integer engineCapacity;
    Boolean started = false;

    // behaviour
    public void start() {
        if (this.started) {
            System.out.println("your car is running");
        } else {
            System.out.println("Vroom....");
            {
                this.started = true;
            }
        }
    }

    public void stop() {
        if (!this.started) {
            System.out.println("your car is not running");
        } else {
            System.out.println("Splutter...");
            {
                this.started = false;
            }
        }
    }

}
