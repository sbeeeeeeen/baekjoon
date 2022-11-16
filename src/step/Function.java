package step;

import java.util.Arrays;

/**
 * packageName    : step
 * fileName       : Function
 * author         : sbyim
 * date           : 2022/11/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/14        sbyim       최초 생성
 */
public class Function {

    /**
     * methodName : sum
     * author : sbyim
     * description : 정수 N개의 합 -15596
     *
     * @param a
     * @return long
     */
    public long sum(int[] a) {
//        return Arrays.stream(a).sum(); // int 허용범위를 초과하기때문에 실패
        long result = 0L;
        for (int temp : a)
            result += temp;
        return result;
    }


}
