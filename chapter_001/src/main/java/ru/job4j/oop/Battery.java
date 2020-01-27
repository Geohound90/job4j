package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(300);
        Battery second = new Battery(400);
        System.out.println("first battery: " + first.load + ". second battery: " + second.load);
        first.exchange(second);
        System.out.println("first battery: " + first.load + ". second battery: " + second.load);
    }
}
