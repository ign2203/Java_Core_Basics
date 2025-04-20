package school.sorokin.javacore.oop.lesson4;

public class Shape {

    protected  int a;
    protected  int b;
    protected  int h;


    public void draw() {
        System.out.println("Drawing a generic shape");
    }
    public void calculateArea() {
        System.out.println("Площадь фигуры равна S = " + (a * b) + "м2");
    }
}
