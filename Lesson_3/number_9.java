 /*9)Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение*/
package homework_Girinskaya.Lesson_3;

 import java.util.Random;
 import java.util.Scanner;

 public class number_9 {
     public static void main(String[] args) {
         int a;
         int countLeft = 0;
         int countRight = 0;

         Scanner con = new Scanner(System.in);
         System.out.print("Введите целое положительное число  ");
         do{
             a=con.nextInt();
             if(a<1)System.out.println("Вы ошиблись, введите повторно целое положительное число!");
         }
         while(a<1);

         int[] array = new int[a];
         for (int i = 0; i < array.length; i++) {
             Random random = new Random();
             array[i] = random.nextInt(10);//возвращает случайное значение типа int
             System.out.print(array[i] + "    ");
            // System.out.println();

             if(i<=array.length/2-1)
             {
                 countLeft+=Math.abs(array[i]);
             }
         else{
                 countRight+=Math.abs(array[i]);
             }

             if(i==array.length-1){
                 System.out.println(" ");
                 if(countLeft>countRight)
                     System.out.println("Сумма модулей первой половины массива больше: "+countLeft);
                 if(countRight>countLeft)
                     System.out.println("Сумма модулей второй половины массива больше: "+countRight);
                 if(countRight==countLeft)
                     System.out.println("Суммы модулей первой и второй половины равны");
             }
         }
     }
 }