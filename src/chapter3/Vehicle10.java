public class Vehicle10 {
    int passengers, burnup;
    private int wheels, maxspeed;

    Vehicle10(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels (wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup ;
    }

    double distance (double interval) {
        double val = this.maxspeed * interval;
        return val;
    }

    int getMaxSpeed() {
        return this.maxspeed;
    }

    int getWheels() {
        return this.wheels;
    }

    void setWheels (int wheels) {
        if ((wheels<1) || (wheels>24)) {
            System.out.println("Неверно указано число колес.");
            return;
        }
        this.wheels = wheels;
    }
    Vehicle10() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup =13;
    }
}

class Auto10 extends Vehicle10 {
    boolean sunroof;
}

class NewVehicle10 extends Vehicle10 {
    public static void main(String[] args) {
        Auto10 bmw = new Auto10();
        bmw.sunroof = true;

        System.out.println("Путь, пройденный за 1.5 часа: " +bmw.distance(1.5) + " км");
        System.out.println("Max.скорость: " +bmw.getMaxSpeed() + " км/ч");
        System.out.println("Наличие люка: " +bmw.sunroof);

    }
}
