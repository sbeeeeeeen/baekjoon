package backjoon.step;

import java.io.*;

/**
 * packageName    : backjoon.step
 * fileName       : Recursion
 * author         : sbyim
 * date           : 2022/12/03
 * description    : 백준 단계별로 풀어보기 - 재귀
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/12/03        sbyim       최초 생성
 */
public class Recursion {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int result = factorial(num);
        bw.write(result + "\n");
        bw.flush();
    }

    public static int factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num-1);
    }
}
