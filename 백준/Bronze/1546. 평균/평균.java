import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        sc.nextLine();
        String[] num = sc.nextLine().split(" ");
        int[] score = new int[N];
        int M = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(num[i]);
            M = Math.max(M, score[i]);
        }

        for(int j =0; j < N; j++) {
            sum += ((double) score[j] / M) * 100;
        }

        System.out.println(sum/N);
    }
}