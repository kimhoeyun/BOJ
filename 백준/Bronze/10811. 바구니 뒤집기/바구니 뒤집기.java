import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        
        for (int x = 1; x <=N ; x++){
            arr.add(x);
        }

        for (int y = 0; y < M; y++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            Collections.reverse(arr.subList(i - 1, j));
        }

        for (int z : arr) {
            System.out.print(z + " ");
        }
    }
}