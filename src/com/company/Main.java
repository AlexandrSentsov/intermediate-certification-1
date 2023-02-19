package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //длина надписи
        int inscriptionLength = 346;

        //вводим длинну забора
        System.out.println("Введите длинну забора");
        Scanner scanner = new Scanner(System.in);
        int fenceLength = scanner.nextInt();

        if (fenceLength >= inscriptionLength) {
            System.out.println("Надпись поместится");
        } else {
            System.out.println("Надпись не поместится");
        }
    }
}
