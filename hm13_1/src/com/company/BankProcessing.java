package com.company;

public class BankProcessing {
   private Account[] bankAccounts;
public BankProcessing(Account bankAccount){
    this.bankAccounts =new Account[]{bankAccount};
}
public  String toString(){
    return "Клиенты Банка : "+bankaccToStr();
}
private  String bankaccToStr(){
    String counter="";
    for (int i=0; i<bankAccounts.length;i++){
        counter+=bankAccounts[i].toString()+" ";
    }
    return  counter;
}
}
