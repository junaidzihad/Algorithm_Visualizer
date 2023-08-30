import java.util.*;

public class Main {
    private static final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Row and column:");
        int[][] grid;
        int rows;
        int cols;

        rows = scanner.nextInt();
        cols = scanner.nextInt();

        grid = new int[rows][cols];

        System.out.println("Enter grid elements (0 for empty, 1 for obstacle):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter start and end points:");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        int goalX = scanner.nextInt();
        int goalY = scanner.nextInt();

        // Find and visualize the path using A* search
        List<Node> aStarPath = A_Star.findPath(grid, DIRS, startX, startY, goalX, goalY);
        if (!aStarPath.isEmpty()) {
            System.out.println("A* Path:");
            Visualize.visualizePath(aStarPath, grid, rows, cols);
        } else {
            System.out.println("A* Path not found.");
        }
    }
}
