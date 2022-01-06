package ru.job4j.chess.firuges.black;

import static org.hamcrest.MatcherAssert.*;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionIsC1() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = Cell.C1;
        Cell result = bishopBlack.position();
        assertEquals(expected, result);
    }

    @Test
    public void whenCopyC1ToD2ThanD2() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Figure copyFigure = bishopBlack.copy(Cell.D2);
        Cell expected = Cell.D2;
        assertEquals(expected, copyFigure.position());
    }

    @Test
    public void whenC1ToG5ThanWayIsD2E3F4G5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = bishopBlack.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, rsl);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenC1ToG6ThanWayIsImpossible() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G6);
    }
}