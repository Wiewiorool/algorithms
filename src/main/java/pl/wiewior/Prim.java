package pl.wiewior;

import java.util.LinkedList;
import java.util.List;

public class Prim {
    //Analizujemy wszystkie krawędzie ochodzące od odwiedzonych wierzchołków, które prowadza do nieodwiedzonych.

    public static int[][] prim(int[][] graph) {
        int length = graph.length;
        int start = 0;
        List<Integer> unVisited = new LinkedList<>();
        List<Edge> edges = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            unVisited.add(i);
        }
        for (int j = 0; j < graph.length; j++) { //Sprawdzamy wszystkie wierzcholki od startowego wierzcholka w tym przyadku 0
            if (graph[start][j] != 0) {
                Edge newEdge = new Edge(start, j, graph[start][j]);
                edges.add(newEdge);
            }
        }
        while (!unVisited.isEmpty()) {
            int nextVertex = findSmallestCost(edges, unVisited);
            unVisited.remove(Integer.valueOf(nextVertex)); // do ogarnięcia

            for (int j = 0; j < graph.length; j++) { // Sprawdzamy wszystkie wierzcholki od wierzchloka z najmniejszym kosztem od wierzcholka 0
                if (graph[nextVertex][j] != 0) {
                    Edge newEdge = new Edge(nextVertex, j, graph[nextVertex][j]);
                    edges.add(newEdge);
                }
            }
        }
        return null;
    }

    private static int findSmallestCost(List<Edge> edges, List<Integer> unVisited) {
        int minCost = Integer.MAX_VALUE;
        Edge edgeMin = null;

        for (int i = 0; i < edges.size(); i++) {
            Edge edge = edges.get(i);
            if (edge.getWeight() < minCost && unVisited.contains(edge.getEnd())) {
                minCost = edge.getWeight();
                edgeMin = edge;
            }

        }
        System.out.println(edgeMin.getStart() + " -> " + edgeMin.getEnd() + " cost: " + edgeMin.getWeight());
        return edgeMin.getEnd();
    }
}


