package by.it.sc04_evening_tue_thu.tokun.lesson07;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            int a = sc.nextInt();
            array1[i] = a;
        }

        int[] array2 = new int[10];
        int[] array3 = new int[10];
        for (int i = 0; i < 20 ; i++) {
            if(i<10) {
                array2[i] = array1[i];
            } else {
                array3[i-10] = array1[i];
            }
        }
        System.out.println("a=" + Arrays.toString(array2));
        System.out.println("b=" + Arrays.toString(array3));


    }
}
