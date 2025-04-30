package school.sorokin.javacore.oop.lesson4;

public class Canvas {
    public static void main(String[] args) {
        Shape[] массив = {new Circle(), new Square()};
        for (Shape элемент : массив) {
            элемент.draw();
        }
        Shape krug = new Circle();
        krug.a = 5;
        System.out.println();
        krug.calculateArea();
        Shape kvdr = new Square();
        kvdr.a = 3;
        System.out.println();
        kvdr.calculateArea();


    }
}
