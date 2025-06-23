import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for(int x = 1; x < N + 1; x++) {
            arr[x] = x; 
        }

        int M = sc.nextInt();
        for(int y = 0; y < M; y++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
        }

        for(int r = 1; r < N + 1; r++) {
            System.out.print(arr[r] + " ");
        }
    }
}