package ru.job4j.poly;

public interface Transport {
    void ride();

    void passengers(int quantity);

    int refuel(int gas);
}
