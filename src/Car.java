public class Car extends Vehicle {
    private int doors;
    private String fuelType;
    public Car(String brand,int year, Driver d,int doors,String fuelType) {
        super(brand,year,d);
        this.doors = doors;
        this.fuelType=fuelType;
    }
    @Override
    public void startEngine(){
        System.out.println(brand + " - завелась");
    }
    @Override
    public void stopEngine() {
        System.out.println(brand + " - остановили двигатель");
    }
}
