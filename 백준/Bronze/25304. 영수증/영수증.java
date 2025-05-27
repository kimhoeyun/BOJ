import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int number = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= number; i++) {
            int price = scanner.nextInt();
            int count = scanner.nextInt();

            sum += price * count;
        }

        if(sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        
    }
}