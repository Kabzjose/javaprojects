public class Machine{
    String make="BMW";
    String model="M4 competition";
    int year=2020;
    Boolean isRunning=false;
    Machine(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    void startCar(){
        isRunning=true;
        System.out.println("Car started");
    }
    void stopCar(){
        isRunning=true;
        System.out.println("Car stopped");
    }
}
