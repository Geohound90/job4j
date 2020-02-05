package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int index = 0;
        for (String find:value) {
            if (find == key) {
                rsl = index;
            }
            index++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element is not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = new String[] {
                "Opel",
                "Mazda",
                "Toyota"
        };
        try {
            System.out.println(indexOf(array, "Lada"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
