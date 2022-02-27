 /*4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.*/
package homework_Girinskaya.Lesson_3;
import java.util.Random;

 public class number_4 {
     public static void main(String[] args) {
         int[] array = new int[20];
         for(int i=0;i<20;i++){
             Random random =new Random();
             array[i]=random.nextInt(21);// возвращает случайное значение типа int
             System.out.print(array[i] +" ");
         }
         System.out.println();
         for(int i=0;i< array.length;i++) {
            // if (array[i] % 2 != 0) { // каждый нечетный элемент массива
             if (i % 2 != 0) { // каждый элемент с нечётным индексом
                 array[i] = 0;

             }
             System.out.print(array[i] + " ");
         }
     }
     }



