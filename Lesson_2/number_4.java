/*4)Составьте программу, вычисляющую A*B, не пользуясь операцией
умножения.*/
package homework_Girinskaya.Lesson_2;

public class number_4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int s=0;
        while (b >0) {
            s = s+a;
            b--;
        }
        System.out.println("A*B=" + s);
    }
}
