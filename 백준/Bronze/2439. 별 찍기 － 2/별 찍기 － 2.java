import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String stars = "*".repeat(i + 1);
            bw.write(String.format("%" + n + "s", stars));
            bw.newLine();
        }
        bw.flush();
    }
}