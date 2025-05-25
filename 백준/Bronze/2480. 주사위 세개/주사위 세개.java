import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int p = 0;

        if(x == y && y == z) {
            p = 10000 + 1000 * x;
        } 
        else if (x != y && y != z && x != z) {
            int max = Math.max(Math.max(x, y), z);
            p = 100 * max;
        }
        else if (x == y || x == z) {
            p = 1000 + 100 * x;
        }
        else {
            p = 1000 + 100 * y;
        }

        System.out.println(p);
    }
}