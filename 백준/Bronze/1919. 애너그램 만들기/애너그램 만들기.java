import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String w1 = sc.next();
		String w2 = sc.next();
		
		int[] a1 = new int[26];
		int[] a2 = new int[26];
		
		for(int i = 0; i < w1.length(); i++) {
			a1[w1.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < w2.length(); i++) {
			a2[w2.charAt(i) - 'a']++;
		}
		
		int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.abs(a1[i] - a2[i]);
        }

        System.out.println(count);
	}
}