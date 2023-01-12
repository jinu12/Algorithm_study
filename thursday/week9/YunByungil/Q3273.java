import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // a(i) + a(j) = xë¥?ë§ì¡±?ë (a(i), a(j))?ì ê°ìë¥?êµ¬í??ë¬¸ì .
        // ë²ìê° ë§¤ì° ?¬ê¸° ?ë¬¸??forë¬¸ì ?´ì©?´ì ?ì  ?ì???ë©´ ?ê° ì´ê³¼
        // ?°ë¼?????¬ì¸???ê³ ë¦¬ì¦???´ì©?´ì ?´ê²°?ì. ???¬ì¸?°ì ?ê° ë³µì¡?ë O(N)?´ë¤.

        // 1. input
        int n = Integer.parseInt(br.readLine()); // ?ì´???¬ê¸° n

        int[] arr = new int [n]; // nê°ì ?«ìë¥??´ë ë°°ì´

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // ?ì°??x

        int result = 0; // ê²°ê³¼

        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (arr[start] + arr[end] == x) {
                result++;
                end--;
            } else if (arr[start] + arr[end] > x) {
                end--;
            } else if (arr[start] + arr[end] < x) {
                start++;
            }
        }

        System.out.println(result);
    }
}
