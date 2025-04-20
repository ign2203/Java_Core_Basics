package school.sorokin.javacore.oop.lesson3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Тойота");
        car1.setModel("rav 4");
        car1.setYear(1994);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setBrand("mazda");
        car2.setModel("6");
        car2.setYear(1750);
        System.out.println(car2);
    }
}
