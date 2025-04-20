package school.sorokin.javacore.oop.lesson4;

public class Circle extends Shape {
    @Override
    public void draw () {
        System.out.println("Drawing a Circle (Круг)");
    }
    @Override
    public void calculateArea() {
        System.out.println("Площадь круга равна S = " + (3.14 * a * a ));
    }
}
