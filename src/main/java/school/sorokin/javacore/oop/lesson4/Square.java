package school.sorokin.javacore.oop.lesson4;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square (Квадрат)");
    }
    @Override
    public void calculateArea() {
        System.out.println("Площадь квадрата равна S = " +  (a * a));
    }
}
