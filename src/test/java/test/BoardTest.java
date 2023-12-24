package test;

import org.assertj.core.api.Assertions.*;

import org.junit.Test;
import software.Board;

import static org.assertj.core.api.Assertions.assertThat;
import static test.BoardTest.Cases.*;

public class BoardTest {

    @Test
    public void should_be_return_empty3x3_board_given_empty3x3(){
        assertThat(new Board(empty3x3).next().toString()).isEqualTo(empty3x3);
    }

    @Test
    public void should_be_return_empty3x3_board_given_one_cell_alive_3x3_board(){
        assertThat(new Board(oneAliveCell3x3).next().toString()).isEqualTo(empty3x3);
    }

    @Test
    public void should_be_return_square_3x3_board_given_triangle_alive_cell_3x3_board(){
        assertThat(new Board(triangleAliveCell3x3).next().toString()).isEqualTo(squareAliveCell3x3);
    }
    @Test
    public void should_be_return_corners_3x3_board_given_all_alive_cell_3x3_board(){
        assertThat(new Board(allAliveCell3x3).next().toString()).isEqualTo(cornersAliveCell3x3);
    }

    @Test
    public void  should_be_return_empty4x4_board_given_one_cell_alive_4x4_board(){
        assertThat(new Board(oneAliveCell4x4).next().toString()).isEqualTo(empty4x4);
    }

    public static class Cases{
        static final String empty3x3 = """
                ...
                ...
                ...
                """;

        static final String oneAliveCell3x3 = """
                ...
                .X.
                ...
                """;

        static final String triangleAliveCell3x3 = """
                .X.
                .XX
                ...
                """;
        static final String squareAliveCell3x3 = """
                .XX
                .XX
                ...
                """;
        static final String allAliveCell3x3 = """
                XXX
                XXX
                XXX
                """;
        static final String cornersAliveCell3x3 = """
                X.X
                ...
                X.X
                """;
        static final String empty4x4 = """
                ....
                ....
                ....
                ....
                """;
        static final String oneAliveCell4x4 = """
                ....
                ..X.
                ....
                ....
                """;
    }
}


