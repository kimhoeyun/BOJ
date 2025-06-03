import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");

        int[] arr = Arrays.stream(a)
                    .mapToInt(num -> Integer.parseInt(num))
                    .toArray();

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.printf("%d %d", min, max);
    }
}