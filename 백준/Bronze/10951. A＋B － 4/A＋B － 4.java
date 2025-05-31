import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while((line = br.readLine()) != null) {
            String[] arr = line.split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            int s = a + b;

            bw.write(s + "\n");
        } 

        bw.flush();
    }
}