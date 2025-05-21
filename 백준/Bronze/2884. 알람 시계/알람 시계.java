import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if(m >= 45) {
            m = m - 45;
        }
        else {
            if(h == 0) {
                h = 24;
            }
            h = h - 1;
            m = 15 + m;
        }

        System.out.printf("%d %d", h, m);
    } 
}