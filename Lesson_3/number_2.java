 /*2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 ... 7 5 3 1).*/
package homework_Girinskaya.Lesson_3;

public class number_2 {
    public static void main(String[] args) {
        //рассчитаем размер массива
        int a=0;
        for(int i=1;i<100;i++){
            if(i%2!=0)
                a++;
        }
        // заполнение массива и вывод в строку
        int[] array = new int[a];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                array[b]=i;
                System.out.print(array[b]+" ");
                b++;
            }
        }
        System.out.println();
        //выведем массив в обратном порядке
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}


