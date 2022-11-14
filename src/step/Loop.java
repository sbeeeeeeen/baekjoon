package step;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : step
 * fileName       : Loop
 * author         : sbyim
 * date           : 2022/11/14
 * description    : 백준 단계별로 풀어보기 - 반복문
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/14        sbyim       최초 생성
 */
public class Loop {

    /**
     * methodName : multiplication
     * author : sbyim
     * description : 2739 구구단
     *
     * @throws IOException the io exception
     */
    public void multiplication() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer param = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(param.nextToken());

        for (int i=1; i<10; i++) {
            System.out.println(a + " * " + i + " = " + (i*a));
        }
    }

    /**
     * methodName : ab3
     * author : sbyim
     * description : 10950 A+B - 3
     *
     * @throws IOException the io exception
     */
    public void ab3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i=0; i<a; i++) {
            StringTokenizer param = new StringTokenizer(br.readLine());
            int result = Integer.parseInt(param.nextToken()) + Integer.parseInt(param.nextToken());
            System.out.println(result);
        }
    }

    /**
     * methodName : add
     * author : sbyim
     * description : 8393 합
     *
     * @throws IOException the io exception
     */
    public void add() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i=1; i<=a; i++) {
            result += i;
        }

        System.out.println(result);
    }

    /**
     * methodName : receipt
     * author : sbyim
     * description : 25304 영수증
     *
     * @throws IOException the io exception
     */
    public void receipt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int receipt = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i=0; i<cnt; i++) {
            StringTokenizer param = new StringTokenizer(br.readLine());
            result += Integer.parseInt(param.nextToken()) * Integer.parseInt(param.nextToken());
        }

        String rslt = "No";
        if (receipt == result) rslt = "Yes";
        System.out.println(rslt);
    }

    /**
     * methodName : fastaaddb
     * author : sbyim
     * description : 15552 빠른 A+B
     *
     * @throws IOException the io exception
     */
    public void fastaaddb() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<a; i++) {
            StringTokenizer param = new StringTokenizer(br.readLine());
            int result = Integer.parseInt(param.nextToken()) + Integer.parseInt(param.nextToken());
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    /**
     * methodName : ab7
     * author : sbyim
     * description : 11021 A+B-7
     *
     * @throws IOException the io exception
     */
    public void ab7() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<a; i++) {
            StringTokenizer param = new StringTokenizer(br.readLine());
            int result = Integer.parseInt(param.nextToken()) + Integer.parseInt(param.nextToken());
            bw.write("Case #" + (i+1) + ": " + result + "\n");
        }

        bw.flush();
        bw.close();
    }

    /**
     * methodName : cycle
     * author : sbyim
     * description : 1110 더하기 사이클
     *
     * @throws IOException the io exception
     */
    public void cycle() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int st = Integer.parseInt(br.readLine());
        if (st < 10) st *= 10;
        int result = st;
        int cnt = 1;
        while(true) {
            result = Integer.parseInt((result % 10) + "" + ((result / 10 + result % 10) % 10));
            if (st == result) {
                bw.write(cnt + "\n");
                break;
            } else cnt++;
        }

        bw.flush();
        bw.close();
    }
}
