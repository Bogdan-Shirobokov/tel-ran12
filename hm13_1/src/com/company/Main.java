package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person("Bogdan","Shirobokov");
        Account account = new Account("DE45678901234",person,7777);
        System.out.println(account);
        System.out.println(account.kakToString());
    }

}
