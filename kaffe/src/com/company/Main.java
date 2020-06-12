package com.company;

public class Main {

    public static void main(String[] args) {
String coffee=choice(2);
print(coffee);


        System.out.println("------------");

        coffee = choice(5);
        print(coffee);



	// write your code here
    }
    public static String choice(int coffeType){
        String rez="error";
        switch (coffeType){

            case 1: //espreso
                rez = (coffeeMarker(1, 1, false)) ? rez ="espredo" : rez;
                break;
            case 2: // Latte
                rez = (coffeeMarker(3,2,true)) ? rez ="Latte" : rez;
                break;
            case 3: //milkkaffe
                rez = (coffeeMarker(0,2,true)) ? rez ="Milkkaffee" : rez;
                break;

                        }
        return rez;

    }
public static boolean coffeeMarker(int water,  int coffee, boolean  milk){

            //makke caffeee
    return true;
}

public static void print(String coffeeString){
        if (coffeeString!="error"){
            System.out.println("Wasch " + coffeeString + " Gotow");
        } else {
            System.out.println("Nepoluchilos");
        }

}
}
