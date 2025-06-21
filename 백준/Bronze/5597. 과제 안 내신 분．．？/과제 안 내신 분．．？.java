import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[31];

        for(int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            num[n] = 1;
        }

        for (int i = 1; i <= 30; i++) {
            if (num[i] == 0) {
                System.out.println(i);
            }
        }
    }
}