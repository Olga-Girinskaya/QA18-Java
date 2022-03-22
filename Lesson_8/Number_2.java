/*Считайте с клавиатуры три строки. А затем:
1. Выведите на экран третью строку в неизменном виде.
2. Выведите на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
3. Выведите на экран первую строку, предварительно преобразовав ее к нижнему регистру.

для вывода результат используйте StringBuilder*/
package homework.Lesson_8;
import java.util.Scanner;

public class Number_2 {

    public static void main(String[] args) {
        System.out.println("Введите 3 строки");
        Scanner scan = new Scanner(System.in);

        String[] arrayStr = new String[3];
        for (int i = 0; i < 3; i++) {
            arrayStr[i] = scan.nextLine();
        }

        String str1="";
        String str2="";
        String str3="";
        for (int i = 0; i < 3; i++) {
           if(i==0) { str1=arrayStr[i].toLowerCase();;}
               if(i==1) { str2=arrayStr[i].toUpperCase();}
                   if(i==2) { str3=arrayStr[i];}
        }

        StringBuilder strBuilder = new StringBuilder("Результат\n");
        strBuilder.append("3 строка: ").append(str3)
                .append("\n2 строка: ").append(str2)
                .append("\n1 строка: ").append(str1);
        System.out.println(strBuilder.toString());
    }
}