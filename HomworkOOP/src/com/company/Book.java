package com.company;

import com.sun.javaws.IconUtil;

class Book1 {
    String nameTheBook;
    String awtore;
    String ganr;
    int jaerOfPublik;

    public Book1(String nameTheBook, String awtore, String ganr, int jaerOfPublik) {
        this.nameTheBook = nameTheBook;
        this.awtore = awtore;
        this.ganr = ganr;
        this.jaerOfPublik = jaerOfPublik;

    }

    public boolean srawnit(Book1 book1) {
        return (this.jaerOfPublik > book1.jaerOfPublik);
    }

    public int srawgod(Book1 book1) {
        if (this.jaerOfPublik > book1.jaerOfPublik) return -1;
        if (this.jaerOfPublik < book1.jaerOfPublik) return 1;
        return 0;

    }

    public void printRawGod(Book1[] book1s, int jaerOfPublik) {
        Book1[] arry new Book1[book1s.length];
        for (int i = 0; i < arry.length; i++) {
            for (int j=0; j<arry[i];j++)
            if (arry[i].jaerOfPublik == jaerOfPublik)
                System.out.println(arry[i]);
        }

    }
        public String toString () {
            return "Book: " + nameTheBook + " - Vrom Autor - " + awtore + " - " + " Ganra " + ganr + " [" + jaerOfPublik + "] god Publikazii ";

        }

        }

