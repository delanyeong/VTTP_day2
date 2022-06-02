package stars.core;

public class Main {
    public static void main(String[] args) {
        // Instantiate a car
        Obj myObj = new Obj();
        myObj.colour = "red";
        myObj.make = "toyota";
        myObj.engineCapacity = 2000;

        myObj.start();

        // Instantiate another Obj
        Obj myObj2 = new Obj();
        myObj2.colour = "blue";
        myObj2.make = "honda";
        myObj2.engineCapacity = 2500;

        myObj2.stop();
    }
}
