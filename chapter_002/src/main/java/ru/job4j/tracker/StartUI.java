package ru.job4j.tracker;

import ru.job4j.ex.User;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class StartUI {
    public static void showItems(List<Item> item) {
        int index = 0;
        for (Item list : item) {
            System.out.println("Item #" + index);
            System.out.println("Id: " + list.getId());
            System.out.println("Name: " + list.getName());
            index++;
        }
    }


    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new ShowAction());
        actions.add(new EditAction());
        actions.add(new DeleteAction());
        actions.add(new IdAction());
        actions.add(new NameAction());
        new StartUI().init(validate, tracker, actions);
    }
}
