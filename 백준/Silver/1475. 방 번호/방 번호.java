import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] roomNum = input.toCharArray();
        int[] count = new int[10];
        int max = 0;

        for(int i = 0; i < roomNum.length; i++) {
            int num = roomNum[i] - '0';

            if(num == 6 || num == 9) {
                count[6]++;
            } else {
                count[num]++;
            }
        }

        count[6] = (count[6] + 1) / 2;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                }
        }

        System.out.println(max);
    }
}