package com.ekids.week1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {

    private final PrintStream originalOut = System.out;
    private final java.io.InputStream originalIn = System.in;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void programPrintsTrueForEvenInput() {
        // When a student implements the if/else, running with input 4 should print "even"
        System.setIn(new ByteArrayInputStream("4\n".getBytes()));
        EvenChecker.main(new String[0]);
        String output = outContent.toString();
        assertTrue(output.contains("even"), "Expected output to contain 'even' for input 4.\nActual output:\n" + output);
    }

    @Test
    void programPrintsFalseForOddInput() {
        // When implemented, input 3 should print "odd"
        outContent.reset();
        System.setIn(new ByteArrayInputStream("3\n".getBytes()));
        EvenChecker.main(new String[0]);
        String output = outContent.toString();
        assertTrue(output.contains("odd"), "Expected output to contain 'odd' for input 3.\nActual output:\n" + output);
    }
}

