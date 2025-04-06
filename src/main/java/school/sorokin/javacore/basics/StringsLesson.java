package school.sorokin.javacore.basics;

import java.util.Scanner;

/*
Считывает строку с клавиатуры (например, "Hello, Java World!").
Выводит длину этой строки.
Выводит её в верхнем регистре.
Проверяет, содержится ли в строке слово "Java".
Если да — выводит индекс первого вхождения, если нет — пишет, что не найдено.
Делит строку на слова (разделитель — пробел) и выводит все слова по одному в консоль.
*/
public class StringsLesson {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);//Считывает строку с клавиатуры (например, "Hello, Java World!").
        String messege = console.nextLine();

        System.out.println(messege.length());//Выводит длину этой строки.
        System.out.println(messege.toUpperCase());//Выводит её в верхнем регистре.
        boolean containsJAVA = messege.contains("java");
        if (containsJAVA) { //Проверяет, содержится ли в строке слово "Java".
            int index = messege.indexOf("java"); //Если да — выводит индекс первого вхождения,
            System.out.println("Индекс первого вхождения " + index);
        } else { //  если нет — пишет, что не найдено.
            System.out.println("Ничего не найдено!");
        }
        String[] words = messege.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

