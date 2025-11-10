package pl.wiewior;

import java.util.LinkedList;
import java.util.List;

public class Dijkstra {

    public static int[][] dijkstra(int[][] graph) {
        int length = graph.length;

        List<Integer> queue = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            queue.add(i);
        }
        int[][] visited = new int[length][2];

        for (int i = 0; i < length; i++) {
            visited[i][0] = 999;
            visited[i][1] = -1;
        }
        visited[0][0] = 0;
        visited[0][1] = 0;

        while (!queue.isEmpty()) {
            int index = getIndexOfCheapestValue(visited, queue);

            //update cost
            for (int column = 0; column < length; column++) {
                if (graph[0][column] != 0) {
                    int cost = visited[index][0] + graph[index][column];
                    if (cost < visited[column][0]) {
                        visited[column][0] = cost;
                        visited[column][1] = index;
                    }
                }
            }
            queue.remove((Integer) index);

        }
        return visited;
    }

    public static Integer getIndexOfCheapestValue(int[][] helper, List<Integer> q) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (Integer notVisitedVertex : q) {
            if (helper[notVisitedVertex][0] < minValue) {
                minValue = helper[notVisitedVertex][0];
                minIndex = notVisitedVertex;
            }
        }
        return minIndex;
    }
}
