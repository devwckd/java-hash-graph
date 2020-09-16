package me.devwckd.graph;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author devwckd
 */
public interface Graph<T> {

    void addVertex(T vertex, T... edges);
    void addEdge(T vertex, T edge);

    void removeVertex(T vertex);
    void removeEdge(T vertex, T edge);

    Set<T> getVertices();
    Set<T> getEdges(T vertex);

    LinkedHashSet<T> depthFirstTraversal(T rootVertex);
    LinkedHashSet<T> breadthFirstTraversal(T rootVertex);

    default void addEdges(T vertex, T... edges) {
        for (T edge : edges) {
            addEdge(vertex, edge);
        }
    }

    default void removeVertices(T... vertices) {
        for (T vertex : vertices) {
            removeVertex(vertex);
        }
    }

    default void removeEdges(T vertex, T... edges) {
        for (T edge : edges) {
            removeEdge(vertex, edge);
        }
    }
}
