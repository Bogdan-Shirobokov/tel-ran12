package com.company;

public class Account {
    private String IBAN;
    private Person client;
    private double ballance;

    public Account( String IBAN, Person client, double ballance){
        this.IBAN=IBAN;
        this.client=client;
        this.ballance=ballance;

    }
    public String toString(){
        return "Ноиер счёта: "+IBAN+" Клиент: "+client+"Баланс :"+ballance;
    }
    public  String kakToString() {

        return "Ноиер счёта: " + codIBAN() + " Клиент: " + client + "Баланс :" + ballance;
    }

    public void getIBAN(){

    }
    public Person getClient(){
        return  client;
    }
    public double getBallance(){
        return ballance;
    }
    private String codIBAN () {
        String str = "";                              // ДУМАЮ КАК СДЕЛАТЬ
        for (int i = 3; i < IBAN.length(); i++) {
            if (IBAN.charAt(i) == '*') {

            }
            str += IBAN.charAt(i);
        }
        return str;

    }
}
