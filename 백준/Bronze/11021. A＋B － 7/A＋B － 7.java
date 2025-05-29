import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String[] arr = br.readLine().split(" "); 

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            int s = a + b;
            
            bw.write("Case #" + (i + 1) + ": " + s + "\n");
        }
        bw.flush();
    }
}