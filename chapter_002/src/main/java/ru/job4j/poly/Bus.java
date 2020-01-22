package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("Автобус готов к отправке!");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("В автобусе " + quantity + " пассажиров");
    }

    @Override
    public int refuel(int gas) {
        int price = 42;
        int total = price * gas;
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bus bus = new Bus();
        int gas = 0;
        int quantity = 0;
        if (gas == 0) {
            System.out.println("Бак пуст, необходима заправка!");
            System.out.print("Сколько литров вы хотите заправить? ");
            gas = Integer.valueOf(scanner.nextLine());
            bus.refuel(45);
        }
        System.out.println("Производится посадка пассажиров...");
        System.out.print("Сколько пассажиров зашло? ");
        quantity = Integer.valueOf(scanner.nextLine());
        bus.passengers(quantity);
        bus.ride();

    }
}
