package com.itAcademy;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        GuessTheNumber();
    }
    public static void GuessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        int a, b = (int) (1 + Math.random() * 9);
        System.out.println("Угадайте число от 0 до 9. У вас есть три попытки.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ": ");
            a = scanner.nextInt();
            if (a < b) {
                System.out.println("Загаданное число больше.");
            }
            if (a > b) {
                System.out.println("Загаданное число меньше.");
            }
            if (a == b) {
                System.out.println("Вы угадали! Наше число: " + b + "!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

                a = scanner.nextInt();
                if (a == 1) {
                    GuessTheNumber();
                } else {
                    System.out.println("Спасибо за игру!");
                    break;
                }
            }
        }
        System.out.println("Попытки исчерпаны. Загаданное число: " + b + ".");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        a = scanner.nextInt();
        if (a == 1) GuessTheNumber();
        else {
            System.out.println("Спасибо за игру!");
        }
    }
}