package step;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

    /**
     * methodName : wordStudy
     * author : sbyim
     * description : 1157 단어공부
     * 알파벳 대소문자로 된 단어가 주어지면,
     * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
     * 단, 대문자와 소문자를 구분하지 않는다.
     * 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
     */
    public void wordStudy() throws IOException{
        //예제 Mississipi 출력 ?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //이것도 맞긴한데 메모리 너무많이씀 시간도 오래걸리고...
//        String[] param = br.readLine().toUpperCase().split("");
//        String[] paramDist = Arrays.stream(param).distinct().toArray(String[]::new); //중복제거
//        String maxChar = "";
//        int maxCnt = 0;
//        for (int i=0; i<paramDist.length; i++) {
//            int cnt = Collections.frequency(List.of(param), paramDist[i]);
//            if (!maxChar.equals(paramDist[i]) && maxCnt < cnt) { //더 많은거 발견할경우
//                maxChar = paramDist[i];
//                maxCnt = cnt;
//            } else if (!maxChar.equals(paramDist[i]) && maxCnt == cnt) { //max가 여러개일경우
//                maxChar = "?";
//                maxCnt = cnt;
//            }
//        }
        String param = br.readLine().toUpperCase();
        int[] arr = new int[26];

        for (int i=0; i<param.length(); i++) {
            int chr = param.charAt(i) - (int)'A';
            arr[chr] = ++arr[chr];
        }

        String maxChar = "";
        int maxCnt = 0;
        for (int j=0; j<arr.length; j++) {
            if (arr[j] > maxCnt) {
                maxChar = Character.toString(j + (int)'A');
                maxCnt = arr[j];
            } else if (arr[j] == maxCnt)
                maxChar = "?";
        }

        bw.write(maxChar + "\n");
        bw.flush();
    }

    /**
     * methodName : wordCnt
     * author : sbyim
     * description : 1152 단어의 개수
     *
     * @throws IOException the io exception
     */
    public void wordCnt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String param = br.readLine();
        if (!param.isBlank()) {
            result = param.trim().toUpperCase().split("\\s+").length;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
    }

    /**
     * methodName : reverse
     * author : sbyim
     * description : 2908 상수
     *
     * @throws IOException the io exception
     */
    public void reverse() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String param[] = br.readLine().split("\\s");
        int sb1 = Integer.parseInt(new StringBuffer(param[0]).reverse().toString());
        int sb2 = Integer.parseInt(new StringBuffer(param[1]).reverse().toString());

        int result = sb1;
        if (sb1 < sb2) result = sb2;
        bw.write(result + "\n");
        bw.flush();
    }

    /**
     * methodName : dial
     * author : sbyim
     * description : 5622 다이얼
     *
     * @throws IOException the io exception
     */
    public void dial() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] params = br.readLine().split("");
        int result = 0;
        for (String param : params) {
            int temp = param.charAt(0) - (int) 'A';
            if (temp > 17) temp--;
            temp = temp/3 + 3;
            if ("Z".equals(param)) temp--;
            result += temp;
        }

        bw.write(result + "\n");
        bw.flush();
    }

    /**
     * methodName : croatia
     * author : sbyim
     * description : 2941 크로아티아 알파벳
     *
     * @throws IOException the io exception
     */
    public void croatia() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String[] params = br.readLine().split("");
//        int result = 0;
//        for (int i=1; i<params.length; i++) {
//            String temp = params[i];
//
//            if ("=".equals(params[i-1])) continue; // =n 이렇게 시작하면 꼬임
//            if (i < params.length-1) {
//                temp += params[i-1];
//                if (i+1 < params.length-1 && "dz".equals(temp))  { //dz=만 세글자라..
//                    temp += params[i+1];
//                }
//            }
//
//            if ("lj".equals(temp) || "nj".equals(temp) || "dz=".equals(temp)) {
//                result += 1;
//                i = i+temp.length()-1;
//            } else {
//                int tmp = temp.replaceAll("[^a-zA-Z]", "").length();
//                result += tmp;
//                ++i;
//            }
//
//            bw.write("temp = " + temp + ", i = " + i + ", result = " + result + "\n");
//        }
//
//        bw.write(result + "\n");
//        bw.flush();
    }


}
