package com.company;

public class Main {

    public static void main(String[] args) {
        int amount = 13676;
        int miles = 1;
        int ruble = 20;
        int bonus = amount * miles / ruble;
        System.out.println("Итоговая сумма начисления:" + bonus);
    }
}
