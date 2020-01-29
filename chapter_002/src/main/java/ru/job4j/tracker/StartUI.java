package ru.job4j.tracker;

public class StartUI {
    public static void showItems(Item[] item, int number) {
        for (int index = 0; index < number; index++) {
            System.out.println("Item #" + index);
            System.out.println("Id: " + item[index].getId());
            System.out.println("Name: " + item[index].getName());
        }
    }


    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if ((select >= actions.length) || (select < 0)) {
                run = false;
            } else {
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            }
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAction(),
                new EditAction(),
                new DeleteAction(),
                new IdAction(),
                new NameAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
