public class Driver {
    private String name;
    private String lic;
    public Driver(String name,String lic){
        this.name=name;
        this.lic=lic;
    }
    public void displayDriverInfo(){
        System.out.println("Водитель - "+name+" | "+lic);
    }
}
