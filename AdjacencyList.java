package com.mycompany.adjacencylist;

import java.util.*;

public class AdjacencyList {

    static void add(ArrayList<ArrayList<Integer>> graph, char a, char b) {

        graph.get(a - 'A').add(b - 'A');
        graph.get(b - 'A').add(a - 'A');
    }

    static void printGraph(ArrayList<ArrayList<Integer>> graph) {

        for (int i = 0; i < graph.size(); i++) {

            System.out.print((char) (i + 'A') + " -> [");

            Collections.sort(graph.get(i));

            for (int j = 0; j < graph.get(i).size(); j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print((char) (graph.get(i).get(j) + 'A'));
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(7);
        for (int i = 0; i < 7; i++) {
            graph.add(new ArrayList<>());
        }

        add(graph, 'A', 'B');
        add(graph, 'B', 'C');
        add(graph, 'C', 'D');
        add(graph, 'C', 'E');
        add(graph, 'D', 'E');
        add(graph, 'E', 'F');
        add(graph, 'D', 'F');
        add(graph, 'D', 'G');

        printGraph(graph);
    }
}
