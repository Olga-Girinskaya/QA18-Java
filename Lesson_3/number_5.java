 /*5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).*/
package homework_Girinskaya.Lesson_3;
import java.util.*;

 public class number_5 {
     public static void main(String[] args) {
         int i;
         double avrArayOne=0;
         double avrArayTwo=0;
         int[] arrayOne = new int[5];
         int[] arrayTwo = new int[5];
         for (i = 0; i < 5; i++) {
             Random random = new Random();
             arrayOne[i] = random.nextInt(16);// возвращает случайное значение типа int
             System.out.print(arrayOne[i]+" ");
             avrArayOne+=(double)arrayOne[i]/arrayOne.length;
             }
         System.out.println();
      //System.out.println(avrArayOne); // Среднее арифметическое первого массива
         for (i = 0; i < 5; i++) {
             Random random = new Random();
             arrayTwo[i] = random.nextInt(16);// возвращает случайное значение типа int
             System.out.print(arrayTwo[i]+" ");
             avrArayTwo+=(double)arrayTwo[i]/arrayTwo.length;
         }
         System.out.println();
       // System.out.println(avrArayTwo); Среднее арифметическое второго массива

         if(avrArayOne==avrArayTwo){
             System.out.println("Среднее арифметическое значений элементов двух массивов равно");}
             else {if (avrArayOne>avrArayTwo)
                  {  System.out.println("Среднее арифметическое значений элементов первого массива больше");}
             else System.out.println("Среднее арифметическое значений элементов второго массива больше");}
         }
     }



