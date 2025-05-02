package school.sorokin.javacore.exceptions.ModulException;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Library {
    private static final Logger logger = Logger.getLogger(Library.class.getName());
    List<Book> catalog = new ArrayList();

    public Library() {
    }

    public void addBook(Book books) {
        if (books == null) {
            System.out.println("Попытка добавить книгу с нулевым значением.");
            logger.severe("Попытка добавить книгу с нулевым значением");
            throw new IllegalStateException("Нельзя добавить книгу с null значением");
        } else {
            logger.info("успешное добавление книги в библиотеку");
            this.catalog.add(books);
            System.out.println("Успешное добавлении книги в библиотеку!");
            System.out.println(books);
        }
    }

    public void listBook() {
        try {
            this.checkCatalogIsEmpty();
            logger.info("Выводим все книги в библиотеке в консоли");

            for(Book books : this.catalog) {
                System.out.println(books);
            }
        } catch (IllegalStateException var3) {
            logger.info("Попытка вывести пустой каталог");
            System.out.println("Каталог пуст, Добавьте книги перед выводом");
        }

    }

    public void returnBook(String title) {
        try {
            this.checkCatalogIsEmpty();
            boolean retBook = false;

            for(int i = 0; i < this.catalog.size(); ++i) {
                Book pub = (Book)this.catalog.get(i);
                if (pub.getTitle().equalsIgnoreCase(title)) {
                    logger.info("Возврат книги прошел успешно");
                    System.out.println("Книга была успешно возвращена в библиотеку. Количество копий увеличилось на 1");
                    pub.setAvailableCopies(pub.getAvailableCopies() + 1);
                    retBook = true;
                    break;
                }
            }

            if (!retBook) {
                System.out.println("Ошибка при поиске книги в библиотеке ");
                logger.warning("Исключение: книга не найдена – " + title);
                throw new ItemNotFoundException("Ошибка при поиске книги в библиотеке ");
            }
        } catch (IllegalStateException var51) {
            logger.info("Попытка вывести пустой каталог");
            System.out.println("Каталог пуст, Добавьте книги перед выводом");
        }

    }

    public void takeBook(String title) {
        try {
            this.checkCatalogIsEmpty();
            boolean takenBook = false;

            for(int i = 0; i < this.catalog.size(); ++i) {
                Book pub = (Book)this.catalog.get(i);
                if (pub.getTitle().equalsIgnoreCase(title)) {
                    if (pub.getAvailableCopies() <= 0) {
                        System.out.println("Для книги " + title + " нет доступных копий.");
                        logger.severe("Нет доступных копий для книги " + title);
                        takenBook = true;
                        return;
                    }

                    System.out.println("Книга с названием: " + pub.getTitle() + " успешна выдана! Количество копий уменьшилось на 1");
                    logger.info("Книга с названием: " + pub.getTitle() + " успешна выдана!");
                    pub.setAvailableCopies(pub.getAvailableCopies() - 1);
                    takenBook = true;
                    break;
                }
            }

            if (!takenBook) {
                System.out.println("Ошибка при поиске книги в библиотеке " + title);
                logger.severe("Пользователь ввел в консоли книгу, которой нет в библиотеке");
                throw new ItemNotFoundException("Книга с названием " + title + " не найдена в библиотеке");
            }
        } catch (IllegalStateException var51) {
            logger.info("Попытка вывести пустой каталог");
            System.out.println("Каталог пуст, Добавьте книги перед выводом");
        }

    }

    public void checkCatalogIsEmpty() {
        if (this.catalog.isEmpty()) {
            System.out.println("catalog не был инициализирован");
            logger.severe("Пользователь пытается выполнить операцию с пустым каталогом");
            throw new IllegalStateException("catalog не был инициализирован");
        }
    }
}
