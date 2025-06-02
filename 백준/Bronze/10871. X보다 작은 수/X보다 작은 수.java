import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int x = Integer.parseInt(a[1]);

        String[] b = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int ai = Integer.parseInt(b[i]);
            if (ai < x) {
                System.out.print(ai + " ");
            }
        }
    }
}