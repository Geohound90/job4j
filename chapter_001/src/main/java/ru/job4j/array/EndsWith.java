package ru.job4j.array;

public class EndsWith {
    public static boolean endsWithBack(char[] word, char[] post) {
        boolean result = false;
        for (int index = word.length - 1; index != (word.length - post.length - 1); index--) {
            if (word[index] == post[index - (word.length - post.length)]) {
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
        for (int index = (word.length - post.length + 1); index != word.length; index++) {
            if (word[index] == post[index - (word.length - post.length)]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
