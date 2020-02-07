package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean real = false;
        for (User user:users) {
            if (user.getUsername().equals(login)) {
                real = true;
                return user;
            }
        }
        if (!real) {
            throw new UserNotFoundException("User not found");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && (user.getUsername().length() >= 3)) {
            return true;
        } else {
            throw new UserInvalidException("User not validate");
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Maxim Pavlov", true)
        };
        try {
            User user = findUser(users, "Maxim Pavlov");
            validate(user);
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException nf) {
            nf.printStackTrace();
        }
    }
}
