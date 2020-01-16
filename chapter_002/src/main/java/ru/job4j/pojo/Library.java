package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book lord = new Book("Lord of the rings", 2000);
        Book clean = new Book("Clean code", 700);
        Book ctulhu = new Book("Call of Ctulhu", 400);
        Book three = new Book("The three-body problem", 600);

        Book[] fantasy = new Book[4];
        fantasy[0] = lord;
        fantasy[1] = clean;
        fantasy[2] = ctulhu;
        fantasy[3] = three;

        System.out.println("We have " + fantasy.length + " books.");
        for (int index = 0; index < fantasy.length; index++) {
            Book fan = fantasy[index];
            System.out.println(fan.getName() + " : " + fan.getPage() + " pages");
        }

        System.out.println('\n' + "Swap books on positions 0 and 3.");
        Book temp = fantasy[0];
        fantasy[0] = fantasy[3];
        fantasy[3] = temp;
        for (int index = 0; index < fantasy.length; index++) {
            Book fan = fantasy[index];
            System.out.println(fan.getName() + " : " + fan.getPage() + " pages");
        }

        System.out.println('\n' + "Books named Clean code.");
        for (int index = 0; index < fantasy.length; index++) {
            Book fan = fantasy[index];
            if (fan.getName() == "Clean code") {
                System.out.println(fan.getName() + " : " + fan.getPage() + " pages");
            }
        }
    }
}
