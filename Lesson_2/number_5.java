/*5)Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/

package homework_Girinskaya.Lesson_2;

public class number_5 {
    public  static void main (String[] args){
        double b=2.54;
        double a;
        System.out.println("дюйм "+" см.");
        for(int i = 1; i <= 20; i++)
        {
            a=b*i;
            System.out.println(i + "    "+ a );
        }


    }
}
