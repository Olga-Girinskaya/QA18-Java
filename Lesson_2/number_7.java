/*7)Напишите программу, определяющую сумму всех нечетных чисел от 1
до 99*/

package homework_Girinskaya.Lesson_2;

public class number_7 {
    public  static void main (String[] args){
        for(int i = 1; i <=99; i++)
        {
              if(i%2!=0)  System.out.print(i+ "  " );
        }
    }
}
