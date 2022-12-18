package programmers;

/**
 * packageName    : programmers
 * fileName       : Lv0
 * author         : sbyim
 * date           : 2022/12/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/12/07        sbyim       최초 생성
 */
public class Lv0 {

    public static void main(String[] args) {
//        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
//        int result = solution(babbling);
//        System.out.println(result);

        int n = 100;
        int answer = 0;
        while(n > 9) {
            answer += n%10;
            n /= 10;
        }

        answer += n;

        System.out.println("Babbling.main" + answer);
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
