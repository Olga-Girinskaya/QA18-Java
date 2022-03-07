/*Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
2)Вывести нечетные элементы находящиеся под главной диагональю(включительно).*/
package homework.Lesson_4;
import java.util.Random;
import java.util.Scanner;

public class Number_2 {
    public static void main(String[] args) {
        System.out.println("Введите размер квадратной матрицы");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] array = new int[num][num];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(51);
                System.out.printf("%2d  ", array[i][j]);
            }
            System.out.println();
        }
        /*
        i == j - главная диагонали
        i > j - ниже главной диагонали
        i < j - выше главной диагонали
         */
        System.out.println("Нечетные элементы, находящиеся под главной диагональю(включительно)");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i >= j && array[i][j] % 2 != 0) {
                    System.out.print(array[i][j]+ " ");
                }
            }
        }
    }
}

