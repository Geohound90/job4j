package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            int index = 0;
            String[] splited = value.split("/");
            String start = splited[0];
            for (String el : splited) {
                if (index == 0) {
                    tmp.add(start);
                } else {
                    start += "/" + el;
                    tmp.add(start);
                }
                index++;
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }

    public static void main(String[] args) {
        List<String> input = List.of("K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2");
        List<String> deps = Departments.fillGaps(input);
        System.out.println(deps);
        Departments.sortAsc(deps);
        System.out.println(deps);
        Departments.sortDesc(deps);
        System.out.println(deps);
    }
}
