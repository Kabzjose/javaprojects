public class Car {
    public static void main(String[] args) {

        Machine car1 = new Machine("Audi", "AR7", 2026);
        Machine car2 = new Machine("BMW", "M4 Competition", 2022);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);

        car1.startCar();
        car2.stopCar();

    }
}


