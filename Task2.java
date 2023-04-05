package tasks_massives;

import java.util.Random;
import static java.util.Arrays.deepToString;

public class Task2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите 10 чисел");
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-10,10);
        }
        System.out.println(deepToString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
            System.out.println();

            for (int i = 0; i<array.length; i++){
                if (array[i] < 0){
                    System.out.print(array[i] + " ");
                }
            }
        }
    }

