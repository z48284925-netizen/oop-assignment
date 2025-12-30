public class Truck extends Vehicle {
    double capacity; int axles;
    public Truck(String brand, int year, Driver driver, double cap, int ax) {
        super(brand,year,driver);
        capacity=cap;
        axles=ax;
    }
    @Override
    public void startEngine() {
        System.out.println(brand+" (грузовик) — запуск");
    }
    @Override
    public void stopEngine() {
        System.out.println(brand+" (грузовик) — стоп");
    }
}
