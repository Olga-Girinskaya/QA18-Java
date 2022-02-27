 /*3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.*/
package homework_Girinskaya.Lesson_3;
import java.util.Random;

public class number_3 {
    public static void main(String[] args) {
        int b=0;
        int[] array = new int[15];
        for(int i=0;i<15;i++){
            Random random =new Random();
            array[i]=random.nextInt(100);// возвращает случайное значение типа int (от 0 до 100 не включительно)
            System.out.print(array[i] +" ");
            if(array[i]%2==0)
                b++;

        }
        System.out.println();
        System.out.println("Всего в массиве "+b+" четных чисел");
    }
    }



