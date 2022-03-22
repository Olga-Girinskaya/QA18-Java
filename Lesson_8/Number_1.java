/*Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней,
а также длину.Для вывода результат используйте StringBuilder*/
package homework.Lesson_8;
import java.util.Scanner;

public class Number_1 {

    public static void main(String[] args) {
        System.out.println("Введите кол-во строк");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        String[] arrayStr = new String[size];
        for (int i = 0; i < size; i++) {
            arrayStr[i] = scan.next();
        }

        int sumLength = 0;
        for (int i = 0; i < size; i++) {
            sumLength = sumLength + arrayStr[i].length();
        }

        // System.out.println(sumLength);
        int strAverage = sumLength / size;
         System.out.println("Средняя длина строк = "+ strAverage + " символов.");
        System.out.println();

        StringBuilder strBuilder = new StringBuilder("Вывод строк с длиной больше средней\n");
        for (int i = 0; i < size; i++) {
            if (arrayStr[i].length() > strAverage) {
                strBuilder.append("'").append(arrayStr[i]).append("'")
                        .append(" - длина этой строки равна ").append(arrayStr[i].length())
                        .append(" символов \n");
            }
        }
        System.out.println(strBuilder);
    }
}