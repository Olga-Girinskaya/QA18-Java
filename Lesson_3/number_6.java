 /*6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.*/
package homework_Girinskaya.Lesson_3;

 import java.util.Random;

 public class number_6 {
     public static void main(String[] args) {

         int[] array=new int[4];
         //int[] array={1,2,3,4}; // срого возрастающая
         for (int i = 0; i < 4; i++) {
             Random random = new Random();
             array[i] = random.nextInt(11);// возвращает случайное значение типа int
             System.out.print(array[i]+" ");
             }
         System.out.println();

         for(int i=0;i<array.length;i++){
             if(i>0) {
                 if (array[i - 1] >= array[i]) {
                     System.out.println("Массив НЕ является строго возрастающей последовательностью");
                     break;
                 }
             }
             if(i==array.length-1)
                 System.out.println("Массив является строго возрастающей последовательностью");
         }
         }
     }



