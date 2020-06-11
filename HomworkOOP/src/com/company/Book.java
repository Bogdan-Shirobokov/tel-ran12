package com.company;


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

    public void printRawGod(Book1[] book1s) {

            for (int i = 0; i < book1s.length; i++) {
            for (int j=0; j<book1s.length;j++)
            if (book1s[i].jaerOfPublik == jaerOfPublik) {
                System.out.println(book1s[i]);
            }

        }

    }
        public String toString () {
            return "Book: " + nameTheBook + " - Vrom Autor - " + awtore + " - " + " Ganra " + ganr + " [" + jaerOfPublik + "] god Publikazii ";

        }

        }

