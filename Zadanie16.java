package com.company;

import java.util.Arrays;
import java.util.Random;

/*Задание 16
Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями..*/
public class Main {
    public static void main(String[] args) {
        int array[] = {200,100,33,21,24,26,5,4};
        int max = array[0];
        int indexMax =0;
        int min = array[0];
        int indexMin=0;
        int sum = 0;
        int sum1 = indexMin;
        int sum2 = indexMax;
        for(int i = 0; i < array.length; i++) {
            if (array[i] < min) {

                min = array[i];
                indexMin = i;
            }
            if(array[i] > max){
                max = array[i];
                indexMax = i;
            }
            sum += array[i];// Сумма массива!!!!
            sum1 += array[sum2];//sum2;//array[indexMin] + array[indexMax];ПОКА НЕ РАЗОБРАЛСЯ!!!!!!!

        }
        System.out.println("Минимальное число " +min + " номер в цикле " +indexMin);
        System.out.println();
        System.out.println("Максимальное число " +max + " номер в цикле " +indexMax);
        System.out.println();
        System.out.println("Сумма цифр между min и max " +sum1 +" Сумма всего массива " + sum);
    }
}








