package backjoon.step;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : backjoon.step
 * fileName       : BasicMath2
 * author         : sbyim
 * date           : 2022/11/30
 * description    : 백준 단계별로 풀어보기 기본수학2
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/30        sbyim       최초 생성
 */
public class BasicMath2 {

    /**
     * methodName : primeNum
     * author : sbyim
     * description : 1978 소수찾기
     *
     * @throws IOException the io exception
     */
    public void primeNum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for (int i=0; i<testcase; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > 1) {
                boolean b = true;
                for (int j=2; j<num; j++) {
                    if (num%j == 0) {
                        b = false; break;
                    }
                }
                if (b) result++;
            }
        }

        bw.write(result + "\n");
        bw.flush();
    }

    /**
     * methodName : primeNum2
     * author : sbyim
     * description : 2581 소수
     *
     * @throws IOException the io exception
     */
    public void primeNum2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int result = 0;
        int min = 0;
        for (int i=start; i<=end; i++) {
            if (i > 1) {
                boolean b = true;
                for (int j=2; j<i; j++) {
                    if (i%j == 0) {
                        b = false; break;
                    }
                }
                if (b) {
                    result += i;
                    if (min==0) min = i;
                }
            }
        }

        if (min == 0) result = -1;
        bw.write(result + "\n");
        if (min != 0) bw.write(min + "\n");
        bw.flush();
    }
}
