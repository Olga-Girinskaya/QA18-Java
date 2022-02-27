 /*8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.*/
package homework_Girinskaya.Lesson_3;

 import java.util.Random;

 public class number_8 {
     public static void main(String[] args) {
         int[] arrayOne = new int[10];
         int[] arrayTwo = new int[10];
         double[] arrayThree = new double[10];
         int count = 0;
         for (int i = 0; i < 10; i++) {
             Random random = new Random();
             arrayOne[i] = random.nextInt(10);// возвращает случайное значение типа int
             System.out.print(arrayOne[i] + "    ");
         }
         System.out.println();
         //System.out.println(avrArayOne); // Среднее арифметическое первого массива
         for (int i = 0; i < 10; i++) {
             Random random = new Random();
             arrayTwo[i] = random.nextInt(10);// возвращает случайное значение типа int
             System.out.print(arrayTwo[i] + "    ");

             if (arrayTwo[i] > 0) arrayThree[i] = (double) arrayOne[i] / arrayTwo[i];
             else arrayTwo[i] = 0;
         }
         System.out.println();
         for (int i = 0; i < 10; i++) {
             System.out.printf("%.2f ", arrayThree[i]);
             if (arrayThree[i] % (int)arrayThree[i] == 0) {
                 count++;
             }
         }
         System.out.println();
         System.out.printf("Целых чисел в третьем массиве %d", count);
     }}




