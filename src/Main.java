import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int MIN_RANDOM = -50;
    public static final int MAX_RANDOM = 50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть висоту матриці (до 20): ");
        int h = sc.nextInt();

        System.out.print("Введіть ширину матриці (до 20): ");
        int w = sc.nextInt();

        if (h > 20 || w > 20) {
            System.out.println("Помилка: максимальний розмір 20x20.");
            return;
        }

        System.out.println("Оберіть спосіб створення матриці:");
        System.out.println("1 — ручне введення");
        System.out.println("2 — рандомне створення");

        int type = sc.nextInt();

        int[][] matrix;

        if (type == 1) {
            matrix = createManual(sc, h, w);
        } else {
            matrix = createRandom(h, w);
        }

        int min = findMin(matrix);
        int max = findMax(matrix);
        double avg = findAverage(matrix);
        double geo = findGeometric(matrix);

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + avg);
        System.out.println("Середнє геометричне: " + geo);
    }

    public static int[][] createManual(Scanner sc, int h, int w) {
        int[][] m = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    public static int[][] createRandom(int h, int w) {
        Random r = new Random();
        int[][] m = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                m[i][j] = r.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
            }
        }
        return m;
    }

    public static int findMin(int[][] m) {
        int min = m[0][0];
        for (int[] row : m) {
            for (int v : row) {
                if (v < min) min = v;
            }
        }
        return min;
    }

    public static int findMax(int[][] m) {
        int max = m[0][0];
        for (int[] row : m) {
            for (int v : row) {
                if (v > max) max = v;
            }
        }
        return max;
    }

    public static double findAverage(int[][] m) {
        double sum = 0;
        int count = 0;
        for (int[] row : m) {
            for (int v : row) {
                sum += v;
                count++;
            }
        }
        return sum / count;
    }

    public static double findGeometric(int[][] m) {
        double p = 1;
        int count = 0;
        for (int[] row : m) {
            for (int v : row) {
                p *= Math.abs(v == 0 ? 1 : v);
                count++;
            }
        }
        return Math.pow(p, 1.0 / count);
    }
}

