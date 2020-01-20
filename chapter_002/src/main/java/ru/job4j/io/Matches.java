package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру 11.");
        System.out.println("Игроки по очереди вытаскивают от 1 до 3 спичек.");
        System.out.println("Кто заберёт последние спички - победил.");
        int match = 11;
        boolean win = false;
        while (!win) {
            System.out.print("Сколько спичек берет первый игрок? ");
            int pickup = Integer.valueOf(input.nextLine());
            if (pickup < 4 && pickup > 0) {
                match = match - pickup;
                if (match <= 0) {
                    win = true;
                    System.out.println("Первый игрок победил.");
                } else {
                    System.out.println("Осталось " + match + " спичек.");
                    System.out.print("Сколько спичек берет второй игрок? ");
                    pickup = Integer.valueOf(input.nextLine());
                    match = match - pickup;
                    if (match <= 0) {
                        win = true;
                        System.out.println("Второй игрок победил.");
                    } else {
                        System.out.println("Осталось " + match + " спичек.");
                    }
                }
            } else {
                System.out.println("Введено некорректное число! Повторите ввод!");
            }
        }
    }
}
