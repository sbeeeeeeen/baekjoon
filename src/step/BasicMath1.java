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

    /**
     * methodName : snail
     * author : sbyim
     * description : 2869 달팽이는 올라가고싶다
     *
     * @throws IOException the io exception
     */
    public void snail() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //시간초과
//        String[] params = br.readLine().split("\\s");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        long result = 0;
//        시간초과
//        long n = 0;
//        while (result < height) {
//            n++;
//            result = n * (day - night) + night;
//        }

        result = (height-night)/(day-night);
        if ((height-night)%(day-night) > 0) result += 1;

        bw.write( result + "\n");
        bw.flush();
    }

    /**
     * methodName : acm
     * author : sbyim
     * description : 10250 ACM호텔
     *
     * @throws IOException the io exception
     */
    public void acm() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());
        for (int i=0; i<testcase; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int room = Integer.parseInt(st.nextToken());
            int guest = Integer.parseInt(st.nextToken());
            int floor = guest%height;
            if (floor==0) floor = height;
            int unit = guest/height;
            if (guest%height > 0) unit++;
            bw.write( String.format("%d%02d\n", floor, unit));
        }
        bw.flush();
    }

    /**
     * methodName : apartment
     * author : sbyim
     * description : 2775 부녀회장이 될테야
     *
     * @throws IOException the io exception
     */
    public void apartment() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int i=0; i<testcase; i++) {
            int floor = Integer.parseInt(br.readLine());
            int number = Integer.parseInt(br.readLine());
            int[][] numbers = new int[floor+1][number];
            for (int j=0; j<floor+1; j++) {
                int tmp = 0;
                for (int k=0; k<number; k++) {
                    if (j == 0) numbers[j][k] = k+1;
                    else if (k==0) numbers[j][k] = 1;
                    else numbers[j][k] = numbers[j][k-1] + numbers[j-1][k];
                }
            }
            bw.write( numbers[floor][number-1] + "\n");
        }

        bw.flush();
    }

    /**
     * methodName : sugar
     * author : sbyim
     * description : 2839 설탕배달
     *
     * @throws IOException the io exception
     */
    public void sugar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

    }



}
