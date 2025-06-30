import java.util.*;

class Main {
    public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);

    		String word = sc.nextLine();
    		int[] alpha = new int[26];
    		
    		for(int i = 0; i < word.length(); i++) {
    			int temp = word.charAt(i) - 97;
    			alpha[temp]++;
    		}
    		
    		for(int i = 0; i < 26; i++) {
    			System.out.print(alpha[i] + " ");
    		}
		
    }
}