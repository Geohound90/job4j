package ru.job4j.stragery;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        String enter = System.lineSeparator();
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("*******")
                                .append(enter)
                                .append("*     *")
                                .append(enter)
                                .append("*     *")
                                .append(enter)
                                .append("*******")
                                .append(enter)
                                .toString()
                )
        );
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        String enter = System.lineSeparator();
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("   *")
                                .append(enter)
                                .append("  * *")
                                .append(enter)
                                .append(" *   *")
                                .append(enter)
                                .append("*******")
                                .append(enter)
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}
