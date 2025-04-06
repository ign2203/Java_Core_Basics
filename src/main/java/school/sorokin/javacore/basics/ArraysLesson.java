package school.sorokin.javacore.basics;

import java.util.Scanner;
/* Создаёт массив из 10 целых чисел (заполните их случайными значениями или вводом с клавиатуры).
Выводит все элементы массива на экран.
Определяет и выводит индекс минимального и максимального элемента (или сами эти элементы).
Сортирует массив по возрастанию (можно любым способом, например, «пузырьком») и выводит результат.
(Опционально) Создаёт двумерный массив размером 2×5, заполняет его и выводит на экран в виде таблицы.
*/

public class ArraysLesson {
    public static void main(String[] args) {
        int[] numb = new int[10]; //Создаёт массив из 10 целых чисел
        for (int i = 0; i < numb.length; i++) {
            Scanner console = new Scanner(System.in);
            numb[i] = console.nextInt();
        }
        int max = numb[0];
        int min = numb[0];
        for (int i = 0; i < numb.length; i++) {
            if (min > numb[i]) {
                min = numb[i];
            }
            if (max < numb[i]) {
                max = numb[i];
            }
        }
        for (int i = 0; i < numb.length; i++) {

            System.out.println("Значение элемента массива " + i + " равен " + numb[i]); // Выводит все элементы массива на экран.
        }
        System.out.println("Минимум: " + min);//Определяет и выводит индекс минимального и максимального элемента (или сами эти элементы).
        System.out.println("Максимум: " + max);
        for (int i = 0; i < numb.length - 1; i++) { //мы делаем на один
            // проход меньше длины массива, потому что последний элемент
            // уже будет отсортирован.
            for (int j = 0; j < numb.length - 1 - i; j++) { //Он проходит по массиву
                // и переставляет соседние элементы,
                // если они стоят неправильно.
                if (j > numb[j + 1]) { //Если левый элемент больше правого
                    int temp = numb[j]; // Запоминаем arr[j]
                    numb[j] = numb[j + 1]; // Меняем местами
                    numb[j + 1] = temp;
                }
            }
        }
        for (int num : numb) {
            System.out.println("Значения массива, по порядку " + num);
        }
        int[][] mass = new int[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                mass[i][j] = j + 1;
            }
        }
        // Выводим таблицу

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.printf("%-3d ", mass[i][j]);
            }
            System.out.println();

        }
    }
}

