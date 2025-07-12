import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int t =  0;

        while (N > 0) {
            if (N % 5  == 0) {
                t += N/5;
                break;
            } else {
                N -= 3;
                t++;
            }
            if (N < 0) {
                t = -1;
            }
        }
        bw.write(t + " ");
        bw.flush();
        bw.close();
    }
}