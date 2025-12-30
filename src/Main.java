public class Main {
    public static void main(String[] args){
        Driver a = new Driver("Aidar","L001");
        Driver b = new Driver("Dana","L002");
        Vehicle c = new Car("Toyota",2020,a,4," petrol ");
        Vehicle m  = new Motorcycle("Honda",2019,b,false);
        Vehicle t= new Truck("Volvo",2018,a,20.5,3);
        Vehicle[] v = { c, m, t };
        for(int i=0;i<v.length;i++){
            v[i].startEngine();
            v[i].displayInfo();
            v[i].stopEngine();
            v[i].showDriver();
        }

    }
}
