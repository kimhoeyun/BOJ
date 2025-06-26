import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[10]; 
        int mod[] = new int[10]; 
        Set<Integer> set = new HashSet<>(); 

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            mod[i] = num[i] % 42;
        }

        for (int j = 0; j < mod.length; j++) {
            set.add(mod[j]);
        }

        System.out.println(set.size());
    }
}