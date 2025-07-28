import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            board[i] = line.toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int re = re(board, i, j);
                min = Math.min(min, re);
            }
        }

        System.out.println(min);
    }

    static int re(char[][] board, int row, int col) {
        int repaintW = 0;
        int repaintB = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B';
                char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W';

                if (board[row + i][col + j] != expectedW) repaintW++;
                if (board[row + i][col + j] != expectedB) repaintB++;
            }
        }
        return Math.min(repaintW, repaintB);
    }
}