package Lab3.second;

enum AirbusModel {
    A200,
    A300,
    A310
}

class Van implements Moveable {
    private String brand;

    Van (String brand) {
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.printf("%s Van is moving\n", brand);
    }
}

class AirBus implements FlyingObject {
    private String model;

    AirBus (String model) {
        this.model = model;
    }

    @Override
    public void move() {
        System.out.printf("%s is speeding up\n", toString());
    }

    @Override
    public void fly(int altitude) {
        System.out.printf("%s is flying on altitude %d\n", toString(), altitude);
    }

    @Override
    public String toString() {
        return String.format("Airbus model %s", model);
    }
}

public class Solution {
    public static void main(String[] args) {
        Moveable MersedesVan = new Van("Mersedes");
        MersedesVan.move();

        FlyingObject AirBusA300 = new AirBus(AirbusModel.A300.name());
        AirBusA300.move();
        AirBusA300.fly(3000);
    }
}