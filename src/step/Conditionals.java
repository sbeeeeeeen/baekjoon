package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * packageName    : step
 * fileName       : Conditionals
 * author         : sbyim
 * date           : 2022/11/08
 * description    : 백준 단계별로 풀어보기 - 조건문
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/08        sbyim       최초 생성
 */
public class Conditionals {

    /**
     * methodName : ovenClock
     * author : sbyim
     * description : 2525
     * date : 2022/11/08
     *
     * @throws IOException the io exception
     */
    public void ovenClock() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hh = Integer.parseInt(st.nextToken());
        int mi = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());

        if (mi + time > 59) {
            if (hh + ((mi + time)/60) > 23) hh += ((mi + time)/60) - 24;
            else hh += ((mi + time) / 60);
            mi = (mi + time) % 60;
        } else {
            mi += time;
        }

        System.out.println(hh + " " + mi);
    }

    /**
     * methodName : dices
     * author : sbyim
     * description : 2480
     * date : 2022/11/08
     *
     * @throws IOException the io exception
     */
    public void dices() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] dices = {Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())};
        Arrays.sort(dices, Collections.reverseOrder());

        Integer[] resultArr = Arrays.stream(dices).distinct().toArray(Integer[]::new);
        int result = 0;
        if (resultArr.length == 1) result = 10000 + resultArr[0] * 1000;
        else if (resultArr.length == 2) {
            int cnt = Collections.frequency(List.of(dices), resultArr[0]);
            if (cnt == 2) result = 1000 + resultArr[0] * 100;
            else result = 1000 + resultArr[1] * 100;
        } else result = resultArr[0] * 100;


        System.out.println(result);
    }
}

