/*1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        суммарный путь пробежит спортсмен за 7 дней?*/

package homework_Girinskaya.Lesson_2;

public class number_1 {

    public static void main(String[] args) {
        double distance=10;
        double sum=0;
        int i = 1;
        do{
            sum =sum+distance;
         //  System.out.println("За "+ i +" день спортсмен пробежал " + distance + " км.");
            distance = distance+(distance * 0.1);
            i++;
        }
        while(i< 8);
        System.out.printf("Cуммарный путь за 7 дней составляет %.2f км.", sum);
    }
}
