public class Node {
    public int x;
    public int y;
    public int g; // Cost from start to current node
    public int h; // Heuristic (estimated cost from current node to goal)
    public int f; // Total cost (g + h)
    public Node parent; // Parent node

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getF() {
        return f;
    }
}
