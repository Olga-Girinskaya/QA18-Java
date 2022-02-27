/*3)Вычислить: 1+2+4+8+...+256*/

package homework_Girinskaya.Lesson_2;

public class number_3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 256; i *= 2)
        { sum += i;}
            System.out.println("Сумма последовательности чисел 1+2+4+8+...+256 равна " + sum);
    }
}
