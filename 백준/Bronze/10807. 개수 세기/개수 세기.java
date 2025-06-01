import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        String v = br.readLine();
        int sum = 0;

        for(int i = 0; i < t; i++) {
            if(v.equals(arr[i])) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}