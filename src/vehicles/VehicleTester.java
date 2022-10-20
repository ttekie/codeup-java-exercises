package vehicles;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setName("Ford");
        System.out.print(car.getName() + " goes ");
        car.makeNoise();
        Truck bandito = new Truck();
        bandito.setName("Rambo");
        System.out.print(bandito.getName() + " goes ");
        bandito.makeNoise();
    }
}
