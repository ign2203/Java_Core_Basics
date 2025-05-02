package school.sorokin.javacore.exceptions.ModulException;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Приветствую Вас");
        Scanner console = new Scanner(System.in);
        Library library = new Library();
        boolean exit = false;

        while(!exit) {
            System.out.println("1.Вывести каталог.");
            System.out.println("2.Добавить объект.");
            System.out.println("3.Выдать объект.");
            System.out.println("4.Вернуть объект.");
            System.out.println("5.Выйти из приложения.");
            if (!console.hasNextInt()) {
                logger.severe("Ошибка ввода, пользователь пытается ввести число");
                System.out.println("Ошибка ввода");
                System.out.println("Введите число от 1 до 5");
                console.next();
            } else {
                int choice = console.nextInt();
                console.nextLine();
                switch (choice) {
                    case 2:
                        System.out.println("Введите название книги");
                        String title = console.nextLine();
                        System.out.println("Введите автора книги");
                        String author = console.nextLine();
                        System.out.println("Введите количество копий");

                        int availableCopies;
                        try {
                            availableCopies = console.nextInt();
                            console.nextLine();
                        } catch (InputMismatchException var11) {
                            logger.severe("Ошибка ввода пользователь ввел не цифры");
                            System.out.println("Вы ввели не цифры, попробуйте еще раз");
                            console.nextLine();
                            break;
                        }

                        Book book1 = new Book(title, author, availableCopies);
                        library.addBook(book1);
                        break;
                    case 3:
                        System.out.println("Введите название книги которые хотите выдать");
                         title = console.nextLine();

                        try {
                            library.takeBook(title);
                        } catch (ItemNotFoundException e) {
                            logger.warning(e.getMessage());
                            System.out.println("Книга с  названием " + title + " не найдена в библиотеке");
                        }
                        break;
                    case 4:
                        System.out.println("Введите название книги которую хотите вернуть");
                         title = console.nextLine();

                        try {
                            library.returnBook(title);
                        } catch (ItemNotFoundException w) {
                            logger.warning(w.getMessage());
                            System.out.println("Книга с  названием " + title + " не найдена в библиотеке");
                            break;
                        }
                    case 1:
                        System.out.println("Выводим что хранится в библиотеке");
                        library.listBook();
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Выходим из приложения");
                        break;
                    default:
                        System.out.println("Введите значение от 1 до 5");
                }
            }
        }

    }
}
