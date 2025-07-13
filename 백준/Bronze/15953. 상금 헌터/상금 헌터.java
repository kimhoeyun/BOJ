import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int[] prizeA = {5000000, 3000000, 2000000, 500000, 300000, 100000};
            int[] personA = {1, 2, 3, 4, 5, 6};
            
            int rankA = a;
            int amountA = 0;
            int peopleA = 0;

            for (int j = 0; j < personA.length; j++) {
                peopleA += personA[j];

                if (rankA != 0 && rankA <= peopleA) {
                amountA = prizeA[j];
                break;
                }
            }

            int[] prizeB = {5120000, 2560000, 1280000, 640000, 320000};
            int[] personB = {1, 2, 4, 8, 16};

            int rankB = b;
            int amountB = 0;
            int peopleB = 0;

            for (int k = 0; k < personB.length; k++) {
                peopleB += personB[k];

                if (rankB != 0 && rankB <= peopleB) {
                amountB = prizeB[k];
                break;
                }
            }

            bw.write(amountA + amountB + "\n");
            bw.flush();
        }
    }
}