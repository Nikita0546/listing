public class Vehicle3 {
    int passengers, wheels, maxspeed, burnup;
}

class MoreVehicleDemo {
    public static void main(String[] args) {
        Vehicle3 car1 = new Vehicle3();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        Vehicle3 bus1 = new Vehicle3();
        car1.passengers = 45;
        car1.wheels = 4;
        car1.maxspeed = 100;
        car1.burnup = 45;

        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;

        System.out.print("car1 может проехать за 1 час 15 мин" +
                "расстояние в ");
        System.out.print(distanceCar + "км с" + car1.passengers);
        System.out.print("пассажирами.");
        System.out.print("bus1 может проехать за 1 час 15 мин. расстояние в");
        System.out.print(distanceBus + "км с" + bus1.passengers);
        System.out.println("пассажирами.");
    }
}
