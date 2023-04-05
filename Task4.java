package tasks_massives;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] array = {{1,-9,6},{2,6,-5,9},{7,-1,-8}};
//        int[][] array = new int[r.nextInt(3,7)][r.nextInt(3,7)];
        int maxI = array[0][0];
        int min = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = r.nextInt(10);
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (maxI < array[i][j]) {
                    maxI = array[i][j];
                }
                System.out.print(array[i][j] + " ");
            } System.out.println();
        }
        System.out.print("\nМинимальное значение в стоблцах - " + min);
        System.out.print("\nМаксимальное значение в строках - " + maxI);
    }
}
