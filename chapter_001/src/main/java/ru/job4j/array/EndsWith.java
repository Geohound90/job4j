package ru.job4j.array;

public class EndsWith {

    public static boolean endsWithBack(char[] word, char[] post) {
        boolean result = false;
        int size = word.length - post.length;
        for (int index = word.length - 1; index != (size - 1); index--) {
            if (word[index] == post[index - size]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean endsWithForward(char[] word, char[] post) {
        boolean result = false;
        int size = word.length - post.length;
        for (int index = (size + 1); index != word.length; index++) {
            if (word[index] == post[index - size]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
