package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int index = 0;
        for (String find:value) {
            if (find.equals(key)) {
                rsl = index;
            }
            index++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element is not found");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementsAbuseException {
        for (String find:abuses) {
            if (find.equals(value)) {
                throw new ElementsAbuseException("Element " + find + " abused!");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] array = new String[] {
                "Opel",
                "Mazda",
                "Toyota"
        };
        String[] abuse = new String[] {
                "Lada",
                "Opel",
                "Nissan"
        };
        process(array, "Opel", abuse);
    }


}
