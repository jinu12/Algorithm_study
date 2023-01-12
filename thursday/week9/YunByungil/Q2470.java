import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2470 {
    public static void main(String[] args) throws IOException {
        // 1. input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // ?ฉ์ก????n
        int[] arr = new int[n];

        // ์ฃผ์ด์ง??ํ ?๊ฐ? 1์ด? n??๋ฒ์??-1,000,000,000 ?ด์ 1,000,000,000 ?ดํ
        // 2์ค?for ๋ฌธ์ ?ฌ์ฉ?ด์ ?ด๊ฒฐ?๋ ๋ฌธ์ ๊ฐ ?๋?? ???ฌ์ธ?ฐ๋? ?๊ณ ๋ฆฌ์ฆ ?์ฉ

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } // ?ฉ์ก???ด๋ ๋ฐฐ์ด
        // ์ต์ข?์ผ๋ก?0๊ณ?๊ฐ??๊ฐ๊น์ด ๊ฐ์ ์ฐพ๋ ๊ฒ์ด??

        // 2. ๋ง??ผ์ชฝ ๊ฐ๊ณผ ๋ง??ค๋ฅธ์ช?๊ฐ์ ๋น๊ต?๋ค.
        // ???์ ?ฉ์ ?๋๊ฐ??์ฐ๊ณ? ์ต์๊ฐ์ ๊ณ์ ๊ฐฑ์ ?๋ฉด?????์ ๊ฐ? -98, 99์ฒ๋ผ )??๊ณ์ ๊ฐฑ์ .

        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;

        int min = Integer.MAX_VALUE;
        int number = 0; // number ๊ฐ์ผ๋ก?์ต์๊ฐ์ ์ฐพ๋??
        int a = 0; // ????์ค??๋
        int b = 0; // ????์ค??๋ ( ???์ ?ฉ์ด 0?ด๋ ๊ฐ๊น์ธ ?? ๊ท???index ๊ฐ์ด a, b?? )
        int check = 0; // check ๊ฐ์ผ๋ก?index ๋ฒํธ๋ฅ?์กฐ์ ?????๊ฒ?๋ค
        while (start < end) {
            check = arr[start] + arr[end];
            number = Math.abs(arr[start] + arr[end]);

            if (min > number) {

                min = number;
                a = arr[start];
                b = arr[end];
            }
            if (check > 0) {
                end--;
            } else if (check < 0) {
                start++;
            } else if (check == 0) {
                break;
            }
        }

        System.out.println(a + " " + b);
    }
}
