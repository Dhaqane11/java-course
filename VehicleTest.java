import  com.vehicle.car;
class VehicleTest {
    public static void main(String [] args){


        car c = new car();
        c.setSpeed(204.0);
        c.setFuelLevel(875.5f);
        c.drive(5879);

        c.display();

        System.out.println(" ");

        electricCars electric = new electricCars();

        electric.setSpeed(124.0);
        electric.setSpeed(438.0);
        electric.setBatteryLevel(453.0);
        electric.drive(2040);


        electric.display();
    }
}
