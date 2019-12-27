package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell != board.length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int cell) {
        boolean result = true;
        for (int row = 0; row != board.length; row++) {
            if (board[row][cell] != 'X') {
                result = false;
            }
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row != board.length; row++) {
            for (int cell = 0; cell != board.length; cell++) {
                if (board[row][cell] == 'X') {
                    if (monoHorizontal(board, row) || monoVertical(board, cell)) {
                        result = true;
                        break;
                    }
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}
