import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        int[][] b = new int[7][2];

        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int y = sc.nextInt();

            b[y][s] = b[y][s] + 1;
        }

        int r = 0;

        for (int y = 0; y < 7; y++) {
            for (int s = 0; s < 2; s++) {
                if (b[y][s] > 0) {
                    r += (b[y][s] + k - 1) / k;
                }
            }
        }

        System.out.println(r);
    }
}