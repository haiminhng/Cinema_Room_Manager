import java.util.Scanner;
class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // put your code here
        int n = 0;
        int m = 0;
        n = input.nextInt();
        m = input.nextInt();
        int[][] arr = new int[n][m];
        int[][] result = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = arr[n - 1 - j][i];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
