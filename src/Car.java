public class Car {
    public static void main(String[] args) {

        Machine car=new Machine();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);

        car.startCar();
        car.stopCar();

    }
}


