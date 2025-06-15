import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] S = sc.nextLine().split(" ");
        int Num = 0;

        for(int i = 0; i < S.length; i++) {
            if(!S[i].equals("")) {
                Num++;
            }
        }

        System.out.println(Num);
    }
}