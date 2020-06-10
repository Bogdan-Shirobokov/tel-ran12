package com.company;



public class Main {

    public static void main(String[] args) {
        // write your code here


        Book1 book1 = new Book1("Miscka", "Puschkin", "Blokbaster", 1999);
        Book1 book2 = new Book1("Woina i Mir", "N.Tolstoi", "Roman", 1869);
        Book1 book3 = new Book1("bubel", "kot", "manga", 1869);
        Book1 book4 = new Book1("Kot w Sapogah", "ratatui", "schedewr", 1969);
        Book1[] book1sborn = {book1, book2, book3, book4};
        System.out.println("================");

        Book1[] sbor2 = {book1, book2, book3, book4};
        for (int i = 0; i < sbor2.length; i++) {
            System.out.println("[" + (i + 1) + "]" + sbor2[i]);
        }
        System.out.println("================");
        System.out.println(book1.srawnit(book2));
        Book1[] sbor1 = {book1, book2, book3, book4};
        for (int i = 0; i < sbor1.length; i++) {
            System.out.println(sbor1[i].srawnit(book3));
        }
        System.out.println("================");

        Book1[] sbor = {book1, book2, book3, book4};
        for (int i = 0; i < sbor.length; i++) {
            System.out.println("[" + (i + 1) + "]" + sbor[i].toString() + "[" + (i + 1) + "]=" + sbor[i].srawgod(book2));
            System.out.println("================");
        }
        System.out.println();
        System.out.println("================");


        Book1[] sbor5 = {book1, book2, book3, book4};
        for (int i = 0; i < sbor5.length; i++) {
            System.out.println("[" + (i + 1) + "]" + sbor5[i].toString() + "[" + (i + 1) + "]=" + sbor5[i].srawgod(book1));
            System.out.println("================");
        }
    }
        public static void print (Book1[]sbor){
            for (int i = 0; i < sbor.length; i++)
                System.out.println(sbor[i].toString());
        }

    }




