package programmers.lv0;

import java.util.Arrays;

/**
 * packageName    : programmers.lv0
 * fileName       : Babbling
 * author         : sbyim
 * date           : 2022/12/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/12/07        sbyim       최초 생성
 */
public class Babbling {

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        int result = solution(babbling);
        System.out.println(result);
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] ans = {"aya", "ye", "woo", "ma"};
        for (String bab : babbling) {
            for (String a : ans) {
                bab = bab.replace(a, "0");
            }
            if (bab.replaceAll("0", "").isBlank()) answer++;
        }
        return answer;
    }
}
