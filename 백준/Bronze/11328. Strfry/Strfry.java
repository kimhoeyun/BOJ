import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < N; i++) {
            String[] s = sc.nextLine().split(" ");

            HashMap<Character, Integer> mapA = new HashMap<>();
            HashMap<Character, Integer> mapB = new HashMap<>();

            String A = s[0];

            for (int j = 0; j < A.length(); j++) {
                char ch = A.charAt(j);
                mapA.put(ch, mapA.getOrDefault(ch, 0) + 1);
            }

            String B = s[1];

            for (int k = 0; k < B.length(); k++) {
                char ch = B.charAt(k);
                mapB.put(ch, mapB.getOrDefault(ch, 0) + 1);
            }

            if (mapA.equals(mapB)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}