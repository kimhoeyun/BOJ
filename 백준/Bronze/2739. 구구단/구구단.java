import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        for(int k = 1; k < 10; k++) {
            System.out.println(i + " * " + k + " = " + i * k);            
        }
    }
}