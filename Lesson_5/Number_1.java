package homework.Lesson_5;
import java.util.Random;


public class Number_1 {

    public static void main(String[] args) {
        Student[] array = new Student[14];
        String[] name = {"Петров","Сидоров","Иванов","Семенов","Степанов","Леонтьева","Шпак","Калинина","Егорова","Шматова","Кошельков","Колпаков","Красовский","Леонов"};

        System.out.println("Список отличников");
        for(int i = 0; i < array.length; i++) {
            Student std = new Student(name[i]);
            array[i]=std;
            array[i].displayInfoGreatStudent();
        }

        System.out.println();
        System.out.println("Список хорошистов");
        for(int i = 0; i < array.length; i++) {
            array[i].displayInfoGoodStudent();
        }

        System.out.println();
        System.out.println("Список двоечников");
        for(int i = 0; i < array.length; i++) {
            array[i].displayInfoBadStudent();
        }
    }
}

class Student {
    String name;
    String group;
    int ball;

    //конструктор
    Student(String name) {
        this.name = name;
        this.group = "QA18";

            Random random = new Random();
            this.ball = random.nextInt(10)+1 ;
    }
    //метод вывода списка двоечников
    void displayInfoBadStudent() {
        if(ball>=1 && ball<=3)
            System.out.printf("Name: %10s \tgroup:  %s \tball: %d\n", name, group, ball);
    }
    //метод вывода списка хорошистов
    void displayInfoGoodStudent() {
        if(ball>=4 && ball<=8)
            System.out.printf("Name: %10s \tgroup:  %s \tball: %d\n", name, group, ball);
    }
    //метод вывода списка отличников
    void displayInfoGreatStudent() {
        if(ball>=9 && ball<=10)
            System.out.printf("Name: %10s \tgroup:  %s \tball: %d\n", name, group, ball);
    }
}