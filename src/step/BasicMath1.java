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
        long range = 1;
        long cnt = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int param = Integer.parseInt(br.readLine());
        while(range < param) {
            range += 6*cnt++;
            bw.write(range + "\n");
        }

        bw.write(cnt + "\n");
        bw.flush();
    }

    /**
     * methodName : findFra
     * author : sbyim
     * description : 1193 분수찾기
     *
     * @throws IOException the io exception
     */
    public void findFra() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int param = Integer.parseInt(br.readLine());
        int cnt = 0;
        int tmp = 0;
        int add = 0;
        int bef = 0;
        boolean b = true;
        while(true) {
            if (cnt%2 == 1 || cnt==0) tmp += 1;
            else if (cnt%2 == 0){
                add += 4;
                tmp += add;
            }
            cnt++;
            if (cnt%2 == 1 && ((bef < param && param < tmp) || tmp==param)) break;
            else if (cnt%2 == 0 && (param-tmp < cnt || tmp==param)) break;

            bef = tmp;
        }

        if (cnt%2 == 1)
            bw.write((tmp-param+1) + "/" + (cnt-(tmp-param)) + "\n");
        else
            bw.write((param-tmp+1) + "/" + (cnt-(param-tmp)) + "\n");

        bw.flush();
    }


}
