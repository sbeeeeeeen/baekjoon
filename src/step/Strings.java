package step;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * packageName    : step
 * fileName       : Strings
 * author         : sbyim
 * date           : 2022/11/15
 * description    : 백준 단계별로 풀어보기 - 문자열
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/15        sbyim       최초 생성
 */
public class Strings {

    /**
     * methodName : ascii
     * author : sbyim
     * description : 11654 아스키코드
     *
     * @throws IOException the io exception
     */
    public void ascii() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char character = br.readLine().charAt(0);
        int ascii = (int) character;

        bw.write(ascii + "\n");
        bw.flush();
        bw.close();
    }

    /**
     * methodName : sum
     * author : sbyim
     * description : 11720 숫자의 합
     *
     * @throws IOException the io exception
     */
    public void sum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();

        String param = br.readLine();
        Pattern pattern = Pattern.compile("");
        int[] results = pattern.splitAsStream(param)
                .mapToInt(Integer::parseInt)
                .toArray();
        int result = Arrays.stream(results).sum();
        bw.write(result + "\n");
        bw.flush();
    }

    /**
     * methodName : alphabet
     * author : sbyim
     * description : 10809 알파벳 찾기
     *
     * @throws IOException the io exception
     */
    public void alphabet() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        String st = br.readLine();
        for (int i=0; i<st.length(); i++) {
            int stChar = st.charAt(i) - (int)'a';
            if (alphabet[stChar] == -1) alphabet[stChar] = i;
        }

        bw.write(Arrays.toString(alphabet).replaceAll("[^[-]0-9 ]", ""));
        bw.flush();
    }

    public void StringRepeat() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        for (int i=0; i<cnt; i++) {
            String params[] = br.readLine().split(" ");

            String result = "";
            //3 abc
            int repeat = Integer.parseInt(params[0]);
            String param = params[1];
            for (int j=0; j<param.length(); j++) {
                result += (param.charAt(j)+"").repeat(repeat);
            }

            bw.write(result + "\n");
        }

        bw.flush();
    }

}
