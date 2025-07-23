import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int n = 666;
        while (count != N) {
            n++;
            if (String.valueOf(n).contains("666")) {
                count++;
            }
        }
        System.out.println(n);
    }
}