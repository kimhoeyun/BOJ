import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();

        if(t + m >= 60) {
            h = h + (t + m) / 60;
            m = (t + m) % 60;

            if(h >= 24) {
                h = h - 24;
            }
        } 
        else { 
            m = t + m;
        }

        System.out.printf("%d %d", h, m);
    }
}