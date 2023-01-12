import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 0;

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) { // ?�라?�스?�네?�의 �??�고리즘
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        List<Integer> numbers = new ArrayList<>();
        for (int i : arr) { // ?�수�??�긴 List
            if (i != 0) {
                numbers.add(i);
            }
        }

        int answer = getCount(numbers, n);
        System.out.println(answer);

    }

    public static int getCount(List<Integer> numbers, int n) {
        int count = 0;
        int start = 0;
        int end = 0;

        int sum = 0;

        while (true) {
            if (sum >= n) {
                if (sum == n) {
                    count++;
                }
                sum -= numbers.get(start++);
            } else if (end == numbers.size()) {
               break;
            } else if (sum < n) {
                sum += numbers.get(end++);
            }

        }


        return count;
    }
}
