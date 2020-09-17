package me.devwckd.graph.impl;

import me.devwckd.graph.Graph;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashGraphTests {

    private Graph<String> hashGraph;

    @BeforeEach
    private void beforeEach() {
        hashGraph = new HashGraph<>();
        hashGraph.addVertex("Olivia", "John", "Diana");
        hashGraph.addVertex("John", "Phillip");
        hashGraph.addVertex("Annika", "Olivia");
    }

    @Test
    private void shouldPrintCorrectly() {
        assertEquals(
                "HashGraph { \"Olivia\": { \"Diana\", \"John\" }, \"Annika\": { \"Olivia\" }, \"John\": { \"Phillip\" } }",
                hashGraph.toString()
        );
    }

    @Test
    private void shouldRemoveAndPrintCorrectly() {
        hashGraph.removeVertex("John");
        assertEquals(
                "HashGraph { \"Olivia\": { \"Diana\", \"John\" }, \"Annika\": { \"Olivia\" } }",
                hashGraph.toString()
        );
    }

    @Test
    private void shouldReturnCorrectSetOnDepthFirstTraversal() {
        Set<String> expected = new LinkedHashSet<>();
        expected.add("Olivia");
        expected.add("John");
        expected.add("Phillip");
        expected.add("Diana");

        assertEquals(
                expected,
                hashGraph.depthFirstTraversal("Olivia")
        );
    }

    @Test
    private void shouldReturnCorrectSetOnBreadthFirstTraversal() {
        Set<String> expected = new LinkedHashSet<>();
        expected.add("Diana");
        expected.add("Olivia");
        expected.add("John");
        expected.add("Phillip");

        assertEquals(
                expected,
                hashGraph.breadthFirstTraversal("Olivia")
        );
    }

}
