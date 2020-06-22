package com.company;

public class Main {
    public static void main(String[] args) {
        int[] intArra = {16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19,2};
        System.out.println("===========НЕ СОРТИРОВАНЫЙ================");
        print(intArra);
        System.out.println();
        System.out.println("========================");


        Puzir bs = new Puzir();
        int[] arr = bs.sort();
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Число подходов"+"["+i + 1+"]" + ": " + arr[i]);
            System.out.println("========================");
        }
        System.out.println("===========НЕ СОРТИРОВАНЫЙ================");
        print(intArra);

        System.out.println();
        System.out.println("===========СОРТИРОВАНЫЙ====================");
        print(arr);

    }



    public static void print(int[] intArr ) {
        for (int i = 0; i < intArr.length; i++)
            System.out.print(intArr[i] +" ");
}
}