package backjoon.step;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : backjoon.step
 * fileName       : Array2D
 * author         : sbyim
 * date           : 2022/12/02
 * description    : 백준 단계별로 풀어보기 2차원 배열
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/12/02        sbyim       최초 생성
 */
public class Array2D {

    /**
     * methodName : addMatrix
     * author : sbyim
     * description : 2738 행렬 덧셈
     *
     * @throws IOException the io exception
     */
    public void addMatrix() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        for(int k=0; k<2; k++) {
            for(int i=0; i<arr.length; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<arr[0].length; j++) {
                    arr[i][j] += Integer.parseInt(st.nextToken());
                    if (k==1) bw.write(arr[i][j] + " ");
                }
                if (k==1) bw.write("\n");
            }
        }

        bw.flush();
    }
}
