import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String[] S = sc.next().split("");
            String ans = "";

            for (int j = 0; j < S.length; j++) {
                
                for (int k = 0; k < R; k++) {
                    ans += S[j];
                }
            }

            System.out.println(ans);
        }
    }
}