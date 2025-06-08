import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < t; i++) {
            String r = sc.nextLine();

            char a = r.charAt(0);
            char z = r.charAt(r.length()-1);

            System.out.println("" + a + z);
        }
    }
}