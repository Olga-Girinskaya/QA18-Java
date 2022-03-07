/*Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.)*/
package homework.Lesson_4;
import java.util.Random;
import java.util.Scanner;

public class Number_5 {
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
        System.out.println("Матрица транспонирована");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%2d  ", array[j][i]);
            }
            System.out.println();
        }
        }
    }

