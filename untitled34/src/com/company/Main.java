package com.company;

public class Main {

    public static void main(String[] args) {
        int n=7;
        // write your code here
        int[] arr = {21, 2, 5, 44, 25, 6};
                System.out.println(sumaRawna(arr));

        int[] arr1 = {21, 22, 5, 44, 25, 6};
        System.out.println(sumaRawna(arr1));
    }

    public static boolean sumaRawna(int[] array) {
        int n = 7;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    return true;
                } else {

                }
            }
        }return false;

    }
    }