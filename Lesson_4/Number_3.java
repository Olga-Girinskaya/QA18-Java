/*Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
3)Проверить произведение элементов какой диагонали больше.*/
package homework.Lesson_4;
import java.util.Random;
import java.util.Scanner;

public class Number_3 {
    public static void main(String[] args) {
        int number1=1;
        int number2=1;
        System.out.println("Введите размер квадратной матрицы");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] array = new int[num][num];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(50)+1;
                System.out.printf("%2d  ", array[i][j]);
                // побочная диагональ
                if (j== array.length-i-1)
                    number1=number1 * array[i][j];
               //главная диагональ
                if(j==i)
                    number2=number2 * array[i][j];
            }
            System.out.println();
        }
        if (number2> number1)
        System.out.println("Произведение чисел главной диагонали '" + number2+ "' больше побочной '" + number1+"'");
        if (number2< number1)
            System.out.println("Произведение чисел побочной диагонали '" + number1+ "' больше главной '" + number2+"'");
        if (number2== number1)
            System.out.println("Произведение чисел главной диагонали '" + number2+ "' и побочной '" + number1 + "' равны");
    }
    }

