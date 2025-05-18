import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt(); 

        String bstr = Integer.toString(b);

        for(int l = bstr.length() - 1; l >= 0; l--) {
            char c = bstr.charAt(l);

            int v = Integer.parseInt(String.valueOf(c));
            System.out.println(v * a);
        }

        System.out.println(a * b);
    }
}