/* Create interfaces Vehicle and FourWheeler with default methods. Implement in Car class.*/

interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {
    @Override
    public void message() {
        Vehicle.super.message();
        FourWheeler.super.message();
    }
}

public class Solution1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.message();
    }
}
