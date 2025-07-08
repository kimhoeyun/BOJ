import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int K = Integer.parseInt(num[1]);

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = 0;
        LinkedList<Integer> result = new LinkedList<>();

        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size();
            int removed = list.remove(index);     
            result.add(removed);                    
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<");
        
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i != result.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(">");

        System.out.println(sb.toString());
    }
}