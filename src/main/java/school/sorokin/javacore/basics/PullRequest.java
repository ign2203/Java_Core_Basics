package school.sorokin.javacore.basics;

import java.util.Scanner;


public class PullRequest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] names = new String[100];
        String[] phoneNumbers = new String[100];
        int contact = 0;
        boolean exit = false;
        while (true) {
            System.out.println("Пункты меню:");
            System.out.println("1 - Добавить контакт");
            System.out.println("2 - Просмотреть контакты");
            System.out.println("3 - Найти контакт");
            System.out.println("4 - Удалить контакт");
            System.out.println("5 - Выйти");
            if (!console.hasNextInt()) {
                console.next();
                System.out.println("Требуется ввести число от 1 до 5. Ваше значение некорректное!");
                continue;
            }
            int choice = console.nextInt();
            console.nextLine();


            switch (choice) {
                case 1:
                    if (contact < names.length) {
                        System.out.println("Введите Ваше имя:");
                        names[contact] = console.nextLine();
                        System.out.println("Введите Ваш номер телефона:");
                        phoneNumbers[contact] = console.nextLine();
                        System.out.println("Имя пользователя: " + names[contact]);
                        System.out.println("Номер телефона: " + phoneNumbers[contact]);
                        System.out.println("Вы успешно добавили контакт");
                        contact = contact + 1;
                    } else {
                        System.out.println("Заполнена память! Удалите существующий контакт");
                    }
                    break;
                case 2:
                    if (contact == 0) {
                        System.out.println("Список контактов отсутствует");
                        continue;
                    } else {
                        for (int i = 0; i < contact; i++) {
                            System.out.println("Имя " + names[i] + " Номер: " + phoneNumbers[i]);
                        }
                        break;
                    }
                case 3:
                    if (contact == 0) {
                        System.out.println("Список контактов отсутствует");
                        continue;
                    } else {
                        System.out.println("Введите имя для поиска");
                        String search = console.nextLine();
                        boolean name_not = false;  // имя не найдено
                        for (int i = 0; i < contact; i++) {
                            if (names[i].equalsIgnoreCase(search)) {
                                System.out.println("Вы успешно нашли контакт");
                                System.out.println("Имя " + names[i] + " Номер: " + phoneNumbers[i]);
                                name_not = true;
                                break;
                            }
                        }
                        if (!name_not) {
                            System.out.println(search + "Имя не найдено");
                            break;
                        }
                        break;
                    }
                case 4:
                    if (contact == 0) {
                        System.out.println("Список контактов отсутствует");
                        continue;
                    } else {
                        System.out.println("Введите имя для удаления");
                        String search_del = console.nextLine();
                        boolean name_del = false;
                        for (int i = 0; i < contact; i++) {
                            if (names[i].equalsIgnoreCase(search_del)) { // создаем поиск требуемого контакта
                                for (int j = i; j < contact - 1; j++) { // мы создаем повторный цикл,
                                    // где говорим что j=i (по факту ничего не значит, мы просто создаем цикл,
                                    // где условия работа с контактами должны на один меньше так как последний элемент мы будем удалять
                                    names[j] = names[j + 1];// здесь мо говорим, что все значение слева тебе равно значение справа до предпоследнего элемента массива
                                    phoneNumbers[j] = phoneNumbers[j + 1];// с номерами аналогично
                                }
                                names[i] = null;// как здесь я понял мы говорим что последний контакт мы обнуляем
                                phoneNumbers[i] = null;// как здесь я понял мы говорим что последний контакт мы обнуляем
                                contact--;// здесь мы удаляем контакт, но не понимаю почему он удаляет последний
                                System.out.println("Вы успешно удалили контакт!");//понятно
                                name_del = true;// понятно
                                break;
                            }
                        }
                        if (!name_del) {
                            System.out.println("Имя не найдено");
                            break;
                        }
                        break;
                    }
                default:
                    System.out.println("Неверный выбор, попробуйте снова. Требуется ввести число от 1 до 5.");
                    break;
                case 5:

                    System.out.println("До свидания!");
                    break;
            }
                if (choice == 5)
                    break;
            }
        }
    }

