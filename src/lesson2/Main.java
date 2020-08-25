package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        //static void pop () {
            int[] A = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println("начальный массив А: " + Arrays.toString(A));
            for (int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    A[i] = 1;
                } else {
                    A[i] = 0;
                }
            }
        //}
        System.out.println("измененный массив A: " + Arrays.toString(A));
        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] B = new int[8];
        for (int i = 0; i < B.length; i++) {
            B[i] = i * 3;
        }
        System.out.println("заполненный массив B: " + Arrays.toString(B));
        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] C = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("начальный массив C: " + Arrays.toString(C));
        for (int i = 0; i < C.length; i++) {
            if (C[i] < 6) {
                C[i] *= 2;
            }
        }
        System.out.println("начальный массив C: " + Arrays.toString(C));
        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] G = new int[20][20];
        System.out.print("двумерный массив G:\n");
        for (int i = 0; i < G.length; i++) {
            for (int j = 0; j < G.length; j++) {
                if (G[i] == G[j]) {
                    G[i][j] = 1;
                }
                System.out.print(G[i][j] + " ");
            }
            System.out.println();
        }
        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] F = {7, 5, 3, 2, 11, 4, 45, 2, 4, 8, 9, 4, 23};
        //хотел заполнить массив через рандом, но не получилось решить задачу (заполнить массив, найти min и max)
        // в рамках одного цикла. минимум два отдельных цикла выходит. Поэтому остановился на предварительно
        // заполненном массиве.
        int max = F[0];
        int min = F[0];
        for (int i = 0; i < F.length; i++) {
            if (F[i] >= max) {
                max = F[i];
            }
            if (F[i] <= min) {
                min = F[i];
            }
        }
        System.out.println("заполненный массив F: " + Arrays.toString(F));
        System.out.println("максимально значение массива F: " + max);
        System.out.println("минимальное значение массива F: " + min);

        System.out.println(TrueFalse(F));
    }
    // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
    // части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    // эти символы в массив не входят.
    static boolean TrueFalse(int[] mass) {
        System.out.println(Arrays.toString(mass));
        int right = 0;
        int left = 0;
        for (int i = 0; i < mass.length + 1; i++) { //mass.length + 1 это решение подсмотрел в google
            for (int j = 0; j < i; j++) {
                left = left + mass[j];
            }
            for (int j = i; j < mass.length; j++) {
                right = right + mass[j];
            }
            if (left == right) return true;
        }
        return false;
    }
    // 7. **** не выполнил. сложно для быстрого исоплнения, боюсь потеряю время и не закроюсь в срок.
    // для себя попробую в теченеии времени.
}

