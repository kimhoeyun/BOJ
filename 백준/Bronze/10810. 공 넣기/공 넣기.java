import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]); 

        int[] basket = new int[n + 1]; 

        for (int x = 0; x < m; x++) {
            String[] arr = br.readLine().split(" ");
            int i = Integer.parseInt(arr[0]);
            int j = Integer.parseInt(arr[1]);
            int k = Integer.parseInt(arr[2]);

            for (int b = i; b <= j; b++) {
                basket[b] = k;
            }
        }

        for (int y = 1; y <= n; y++) {
            System.out.print(basket[y] + " ");
        }
    }
}