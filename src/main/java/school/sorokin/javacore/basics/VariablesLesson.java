package school.sorokin.javacore.basics;



public class VariablesLesson {

    public static void main(String[] args) {
        //напишите тут ваш код
        //Целые числа
        byte temper = 25; // 8-битное целое число Диапазон: от -128 до 127
        short s = 1000; // 16-битное целое число -32,768 до 32,767
        int num = 5000; //32-битное целое число Диапазон: от -2^31 до 2^31-1
        long bigNum = 1000005446; // 64-битное целое число
        int nas = (int) bigNum;


//Числа с плавающей точкой
        float f = 3.56987f;
        double pi = 3.14;
        // Логический тип
        boolean result1 = f > pi; // true


        System.out.println(temper + "\n" + s + "\n" + num + "\n" + bigNum + "\n" + nas + "\n" + f + "\n" + pi);

        if (result1) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
        char symbol = 'A';
        int codeA = (int) symbol;
        int codeB = codeA + 1;
        int codeC = codeB + 1;
        char A = (char) codeA;
        char B = (char) codeB;
        char C = (char) codeC;

        System.out.println(codeA + "\n" + codeB + "\n" + codeC);
    }
}