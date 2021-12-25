package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        int[] arrayHorizontal = new int[board.length];
        int[] arrayVertical = new int[board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                arrayHorizontal[j] = board[i][j];
                arrayVertical[j] = board[j][i];
            }
            if (checkRowLine(arrayHorizontal) || checkRowLine(arrayVertical)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkRowLine(int[] rowLine) {
        boolean rsl = true;
        for (int i = 0; i < rowLine.length; i++) {
            if (rowLine[i] == 0) {
                rsl = false;
            }
        }
        return rsl;
    }
}
