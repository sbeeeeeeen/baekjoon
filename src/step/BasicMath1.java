package step;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : step
 * fileName       : BasicMath1
 * author         : sbyim
 * date           : 2022/11/21
 * description    : 백준 단계별로 풀어보기 기본수학1
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/21        sbyim       최초 생성
 */
public class BasicMath1 {

    /**
     * methodName : bep
     * author : sbyim
     * description : 1721 손익분기점
     *
     * @throws IOException the io exception
     */
    public void bep() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cost = Integer.parseInt(st.nextToken());
        int laptop = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        int result = price-laptop == 0 ? -1 : cost/(price-laptop) + 1;
        if (result < 0) result = -1;
        bw.write(result+"\n");

        bw.flush();
    }

    /**
     * methodName : honeycomb
     * author : sbyim
     * description : 2292 벌집
     *
     * @throws IOException the io exception
     */
    public void honeycomb() throws IOException {
//        int a = 1;
//        int cnt = 1;
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int param = Integer.parseInt(br.readLine());
//        while(true) {
//            if (a >= param) {
//                bw.write(cnt + "\n");
//                break;
//            } else if (a==1) a += 1;
//            else a += 6*cnt++;
//        }
//
//        bw.flush();
    }
}
