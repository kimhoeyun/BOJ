import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 1; i < t + 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
    
            int k = a + b;
            System.out.println(k);
        } 
    }
}
