 /*7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив.*/
package homework_Girinskaya.Lesson_3;

 import java.util.Random;

 public class number_7 {
     public static void main(String[] args) {

         int[] array=new int[12];
         int max =0;
         int a =0;
         //int[] array={1,2,3,4}; // срого возрастающая
         for (int i = 0; i < 12; i++) {
             Random random = new Random();
             array[i] = random.nextInt(16);// возвращает случайное значение типа int
             System.out.print(array[i]+" ");
             }
         System.out.println();

         for(int i=0;i<array.length;i++){
                 if (array[i] >= max) {
                     max=array[i];
                    a=i;
             }
         }
         System.out.println("Максимальный элемент массива равен "+ max);
         System.out.println("Индекс максимального элемент массива  ["+ a+"].");
         }
     }



