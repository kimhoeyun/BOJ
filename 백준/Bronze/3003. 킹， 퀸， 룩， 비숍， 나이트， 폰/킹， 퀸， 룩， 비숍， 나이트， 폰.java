import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int[] point = { 1, 1, 2, 2, 2, 8 };

		String[] input = str.split(" ");

		for (int i = 0; i < point.length; i++) {

			System.out.print(point[i] - Integer.parseInt(input[i]) + " ");
		}
	}
}    