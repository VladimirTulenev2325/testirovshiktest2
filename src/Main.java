public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };

        int n = matrix.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1 && i != j && matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("Минимальный элемент побочной диагонали: " + min);
    }
}