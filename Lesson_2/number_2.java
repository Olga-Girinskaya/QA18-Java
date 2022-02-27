/*2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

package homework_Girinskaya.Lesson_2;

public class number_2 {

    public static void main(String[] args) {
        int a =1;;
        for(int i=3; i<25; i+=3)
        {
                a = (a * 2);
            }
        System.out.println("Количество клеток " + a);
    }
}
