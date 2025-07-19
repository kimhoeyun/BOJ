import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] num = br.readLine().split(" ");
        int[] card = new int[num.length];

        for(int i = 0; i < num.length; i++) {
            card[i] = Integer.parseInt(num[i]);
        }

        int max = 0;

        for(int i = 0; i < num.length; i++) {
            for(int j = i + 1; j < num.length; j++) {
                for(int k = j + 1; k < num.length; k++) {
                    int sum = card[i] + card[j] + card[k];

                    if(sum <= M) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println(max);
        bw.flush();
    }
}