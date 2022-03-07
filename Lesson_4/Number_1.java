/*Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
1) Почитать сумму четных элементов стоящих на главной диагонали.*/
package homework.Lesson_4;
import java.util.Random;
import java.util.Scanner;

public class Number_1 {
    public static void main(String[] args) {
        System.out.println("Введите размер квадратной матрицы");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] array=new int[num][num];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j< array[0].length;j++) {
                array[i][j] = random.nextInt(51);
                System.out.printf("%2d  ", array[i][j]);
                if (i==j && array[i][j]%2==0) sum = sum + array[i][j];
            }
            System.out.println();
        }
        System.out.print("Сумма четных элементов главной диагонали " +sum);
    }
}

