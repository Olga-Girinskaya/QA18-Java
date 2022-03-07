/*Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)*/
package homework.Lesson_4;
import java.util.Random;
import java.util.Scanner;

public class Number_4 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Введите размер квадратной матрицы");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] array = new int[num][num];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(51);
                System.out.printf("%2d  ", array[i][j]);
                if (j> array.length-i-1 && array[i][j]%2==0)
                    sum=sum + array[i][j];
            }
            System.out.println();
        }
        System.out.println("Cумма четных элементов, стоящих над побочной диагональю (не включительно) "+ sum);
        }
    }

