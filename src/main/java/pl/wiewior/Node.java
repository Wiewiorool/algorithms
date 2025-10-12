package pl.wiewior;


public class Node {
    int id;
    Node left;
    Node right;

    private static void dfs(Node node) {
        if (node == null) return;

        System.out.println(node.id);
        dfs(node.left);
        dfs(node.right);
    }
}
