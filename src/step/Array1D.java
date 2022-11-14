package step;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * packageName    : step
 * fileName       : Array1D
 * author         : sbyim
 * date           : 2022/11/14
 * description    : 백준 단계별로 풀어보기 - 1차원배열
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/14        sbyim       최초 생성
 */
public class Array1D {

    /**
     * methodName : count
     * author : sbyim
     * description : 10807 개수세기
     *
     * @throws IOException the io exception
     */
    public void count() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        String arr[] = br.readLine().split(" ");
        String cnt =br.readLine();

        int result = Collections.frequency(List.of(arr), cnt);
        bw.write(result + "\n");

        bw.flush();
        bw.close();
    }

    /**
     * methodName : minmax
     * author : sbyim
     * description : 10818 최소, 최대
     *
     * @throws IOException the io exception
     */
    public void minmax() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        bw.write(arr[0] + " " + arr[arr.length-1] + "\n");

        bw.flush();
        bw.close();
    }

    /**
     * methodName : find
     * author : sbyim
     * description : 5597 과제 안 내신 분..?
     *
     * @throws IOException the io exception
     */
    public void find() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> lists = IntStream.range(1, 31).boxed().collect(Collectors.toList());
        for (int i=0; i<28; i++) {
            int tmp = Integer.parseInt(br.readLine());
            lists.remove(Integer.valueOf(tmp));
        }

        Collections.sort(lists);
        bw.write(lists.get(0) + "\n");
        bw.write(lists.get(1) + "\n");

        bw.flush();
        bw.close();
    }

    /**
     * methodName : remainder
     * author : sbyim
     * description : 3052 나머지
     *
     * @throws IOException the io exception
     */
    public void remainder() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer[] temps = new Integer[10];
        for (int i=0; i<10; i++)
            temps[i] = Integer.parseInt(br.readLine()) % 42;

        Integer[] resultArr = Arrays.stream(temps).distinct().toArray(Integer[]::new);
        System.out.println(resultArr.length);
    }

    /**
     * methodName : avg
     * author : sbyim
     * description : 1546 평균
     *
     * @throws IOException the io exception
     */
    public void avg() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String grades = br.readLine();
        Pattern pattern = Pattern.compile(" |,");

        double[] results = pattern.splitAsStream(grades)
                .mapToDouble(Double::parseDouble)
                .toArray();
        Arrays.sort(results);

        double avg = 0;
        for (int i=0; i<cnt; i++) {
            avg += results[i]/results[cnt-1]*100;
        }

        System.out.println(avg/cnt);
    }

    /**
     * methodName : oxquiz
     * author : sbyim
     * description : 8958 OX퀴즈
     *
     * @throws IOException the io exception
     */
    public void oxquiz() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for (int i=0; i<cnt; i++) {
            int result = 0;
            String[] grades = br.readLine().split("");
            int level = 0;
            for (int j=0; j<grades.length; j++) {
                if ("O".equals(grades[j])) {
                    result += ++level;
                } else level = 0;
            }
            System.out.println(result);
        }
    }

    /**
     * methodName : avg2
     * author : sbyim
     * description : 4344 평균은 넘겠지
     *
     * @throws IOException the io exception
     */
    public void avg2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int j=0; j<cnt; j++) {
            String grades = br.readLine();
            Pattern pattern = Pattern.compile(" |,");

            double[] results = pattern.splitAsStream(grades)
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double avg = 0;
            for (int i=1; i<results.length; i++) {
                avg += results[i];
            }

            avg = avg/results[0];

            double result = 0;
            for(int k=1; k<results.length; k++) {
                if (results[k] > avg) result+=1;
            }

            bw.write(String.format("%.3f%%\n",(result/results[0])*100));
        }

        bw.flush();
        bw.close();
    }
}
