import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] Nums = sc.nextLine().split(" ");
        String aNum = "";
        String bNum = "";

        for(int i = 2; -1 < i; i--) {
            aNum += Nums[0].charAt(i);
            bNum += Nums[1].charAt(i);
        }

        int a = Integer.parseInt(aNum);
        int b = Integer.parseInt(bNum);

        if(a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}