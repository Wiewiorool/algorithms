package pl.wiewior;


import java.util.ArrayDeque;
import java.util.Queue;

public class Node {
    int id;
    Node left;
    Node right;

    public Node(Node left, Node right, int id) {
        this.left = left;
        this.right = right;
        this.id = id;
    }

    public static void dfs(Node node) {
        if (node == null) return;

        System.out.println(node.id);
        dfs(node.left);
        dfs(node.right);
    }

    public static void bfs(Node node) {
        Queue<Node> q = new ArrayDeque<>();
        q.offer(node);

        while (!q.isEmpty()) {
            node = q.poll();
            System.out.println("ID " + node.id);
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);

            }
        }
    }
}