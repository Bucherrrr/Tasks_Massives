package tasks_massives;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите 12 чисел");

//Заполнить массив из двенадцати элементов 1,2,...12
//        for (int i = 0; i < 12; i++) {
//            array[i] = sc.nextInt();
//        }
//Вывести элементы массива на экран в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
//сумма всех элементов массива;

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("Сумма чисел массива = " + sum);
//произведение всех элементов массива;
        int p = 1;
        for (int j = 0; j < array.length; j++) {
            p *= array[j];

        }
        System.out.println("Произведение всех элементов массива = " + p);
//сумму квадратов всех элементов массива
        double sumSqrt = 0;
        for (int j = 0; j < array.length; j++) {
            sumSqrt = Math.sqrt(sum);
        }
        System.out.println("Сумма квадратов всех элементов массива = " + sumSqrt);

//сумму шести первых элементов массива
        int sumSixElements = 0;
        int[] indexes = {0,1,2,3,4,5};
        for (int i = 0; i < indexes.length; i++){
            int index = indexes[i];
            if (index >= 0 && index < array.length){
                sumSixElements += array[index];
            }
    }
        System.out.println("Сумма элементов с индексами " + Arrays.toString(indexes) + " равна " + sumSixElements);


    }
}
