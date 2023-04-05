package tasks_massives;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(4,11)];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100,100);
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int min = array[0];
        int countMax = 1;
        int countMin = 1;
        for (int i = 0; i<array.length; i++){
            if (array[i]> max){
                max = array[i];
                countMax = 1;
            }else if (array[i]==max){
                countMax++;
            }



            if (array[i]<min){
                min = array[i];
                countMin = 1;
            } else if (array[i]==min) {
                countMin++;
            }
        }
        System.out.println("\nMin = " + min);
        System.out.println("Max = " + max);
        System.out.println("Количество Max элементов - " + countMax);
        System.out.println("Количество Max элементов - " + countMin);
    }
}
