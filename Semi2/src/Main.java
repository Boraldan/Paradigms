public class Main {
    public static void main(String[] args) {

        // Структурный вариант решения.

        int[][] mat = new int[3][3];

        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[1].length; j++) {
                mat[i][j] = i + j;
            }
        }

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) sum += mat[i][j];
            }
        }

        System.out.println(mat.length);
        System.out.println(sum);
    }

    // Структурный вариант решения.

    public static int[][] creat(int a) {
        int[][] mat = new int[a][a];
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[1].length; j++) {
                mat[i][j] = i + j;
            }
        }
        return mat;
    }

    public static int sum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) sum += mat[i][j];
            }
        }
        return sum;
    }
}