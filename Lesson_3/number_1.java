/*1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.*/
package homework_Girinskaya.Lesson_3;

public class number_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i = 0;
        int b = 2;
        while (i < 10) {
            array[i] = b;
            b += 2;
            i++;
        }
        //в строку
        for (i = 0; i < 10; i++)
            System.out.print(array[i] + " ");

        System.out.println();

        //в столбик
        System.out.println();
        for (i = 0; i < 10; i++)
            System.out.println(array[i]);
    }
}

