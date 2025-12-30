public class Motorcycle extends Vehicle {
    boolean hasSidecar;
    public Motorcycle(String brand, int year, Driver driver, boolean h) {
        super(brand, year, driver);
        hasSidecar = h;
    }
    public void startEngine() {
        System.out.println(brand + ": мотор работает");
    }
    public void stopEngine(){
        System.out.println(brand+" выключен");
    }
}
