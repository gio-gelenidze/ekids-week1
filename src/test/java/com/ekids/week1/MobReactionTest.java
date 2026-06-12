package com.ekids.week1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MobReactionTest {

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
    void programPrintsRunForCreeper() {
        // When input is "creeper", should print "run"
        System.setIn(new ByteArrayInputStream("creeper\n".getBytes()));
        MobReaction.main(new String[0]);
        String output = outContent.toString();
        assertTrue(output.contains("run"), "Expected output to contain 'run' for input 'creeper'.\nActual output:\n" + output);
    }

    @Test
    void programPrintsAttackForZombie() {
        // When input is "zombie", should print "attack"
        outContent.reset();
        System.setIn(new ByteArrayInputStream("zombie\n".getBytes()));
        MobReaction.main(new String[0]);
        String output = outContent.toString();
        assertTrue(output.contains("attack"), "Expected output to contain 'attack' for input 'zombie'.\nActual output:\n" + output);
    }

    @Test
    void programPrintsStayForOtherMob() {
        // When input is something else, should print "stay"
        outContent.reset();
        System.setIn(new ByteArrayInputStream("skeleton\n".getBytes()));
        MobReaction.main(new String[0]);
        String output = outContent.toString();
        assertTrue(output.contains("stay"), "Expected output to contain 'stay' for input 'skeleton'.\nActual output:\n" + output);
    }
}

