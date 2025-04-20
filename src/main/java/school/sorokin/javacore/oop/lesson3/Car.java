package school.sorokin.javacore.oop.lesson3;

public class Car {
    private String brand;
    private String model;
    private int year;


    // getter для brand
    public String getBrand() {
        return brand;
    }

    // создаем setter для brand
    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            System.out.println("Напишите марку автомобиля. Она не может быть пустой!");
            return;
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    // создаем setter Для model
    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            return;
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1866) {
            System.out.println("Первый автомобиль появился в 1866 году. Введите корректный возраст автомобиля");
            return;
        }
        this.year = year;
    }

    public String toString() {
        return "Брэнд " + brand + " Марка " + model + " год выпуска " + year;
    }
}
