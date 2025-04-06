package school.sorokin.javacore.basics;
import java.util.Scanner;
/*
Написать программу, которая помогает пользователю выбрать жанр фильма для просмотра.
Пусть программа:
Предлагает ввести число от 1 до 5
(1 — комедия, 2 — драма, 3 — фантастика, 4 — боевик, 5 — аниме).


В зависимости от введённого числа предлагает несколько
известных фильмов этого жанра (можно ограничиться 1–2 названиями).
Если число не входит в диапазон 1–5, выводит сообщение: «Такого жанра не знаю».
Требования:
Воспользоваться оператором switch.
Продумать, нужно ли вам использовать if-else.
Возможно, перед switch стоит проверить,
что введённое пользователем число вообще корректно.
Программа должна считывать данные из консоли (например, через Scanner)
и выводить результат в консоль.
*/
public class IfElseLesson {
    public static void main(String[] args) {
// Предлагает ввести число от 1 до 5
// Программа должна считывать данные из консоли (например, через Scanner)
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
//Предлагает ввести число от 1 до 5
//(1 — комедия, 2 — драма, 3 — фантастика, 4 — боевик, 5 — аниме).
        System.out.println("1 — комедия");
        System.out.println("2 — драма");
        System.out.println("3 — фантастика");
        System.out.println("4 — боевик");
        System.out.println("5 — аниме");
        ;
        if (console.hasNextInt()) { // нужно проверить, чтобы пользователь вводил цифры
            int a = console.nextInt();

            switch (a) {
                case 1: //1 — комедия
                    System.out.println("Клик с пультом по жизни");
                    System.out.println("Друзья");
                    break;
                case 2: // 2 — драма
                    System.out.println("Гонка");
                    System.out.println("Терминал");
                    break;
                case 3: //3 — фантастика
                    System.out.println("Мстители");
                    System.out.println("Пиксели");
                    break;
                case 4: //4 — боевик
                    System.out.println("Мастер");
                    System.out.println("Форсаж");
                    break;
                case 5: //5 — аниме
                    System.out.println("Покемоны");
                    System.out.println("Шаман Кинг");
                    break;
                default:
                    System.out.println("Такого жанра не знаю");
                    break;
            }
        } else {
            System.out.println("Введите цифры!");
        }
    }
}


