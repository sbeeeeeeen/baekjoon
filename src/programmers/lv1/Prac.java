package programmers.lv1;

import java.util.Arrays;
import java.util.Stack;

/**
 * packageName    : programmers.lv1
 * fileName       : Prac
 * author         : sbyim
 * date           : 2022/12/09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/12/09        sbyim       최초 생성
 */
public class Prac {
    public static void main(String[] args) {
//        boolean b = solution("Pyy");
//        poketmon(new int[]{3,3,3,2,2,4});
//        System.out.println(hamburger(new int[]{1,2,1,2,1,2,1,2,3,1,3,1,3,1,3,1}));
        System.out.println(hamburger(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
//        System.out.println(hamburger(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
//        System.out.println(hamburger(new int[]{1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1}));
//        System.out.println(hamburger(new int[]{1,2,1,2,3,1,3,1,2,3,1,2,3,1}));
    }


    /**
     * methodName : solution
     * author : sbyim
     * description : 자연수 뒤집어 배열로 만들기
     *
     * @param n
     * @return int [ ]
     */
    public static int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            answer[i] = Integer.parseInt(s.substring(s.length()-i-1, s.length()-i));
        }
        return answer;
    }

    /**
     * methodName : solution
     * author : sbyim
     * description : 문자열 내 p와 y의 개수
     *
     * @param s
     * @return boolean
     */
    public static boolean solution(String s) {
        boolean answer = false;
        s = s.toUpperCase();
        int y = 0; int p = 0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 89) y++;
            else if (s.charAt(i) == 80) p++;
        }

        if ((y==0 && p==0) || y==p) answer = true;
        return answer;
    }

    /**
     * methodName : poketmon
     * author : sbyim
     * description : 폰켓몬
     *
     * @param nums
     * @return int
     */
    public static int poketmon(int[] nums) {
        int answer = nums.length/2;
        int[] resultArr = Arrays.stream(nums).distinct().toArray();
        if (resultArr.length < answer) answer = resultArr.length;
        return answer;
    }

    /**
     * methodName : hamburger
     * author : sbyim
     * description : 햄버거 만들기
     *
     * @param ingredient
     * @return int
     */
    public static int hamburger(int[] ingredient) {
        //1,2,1,2,3,1,3,1,2,3,1,2,3,1
        int answer = 0;
        Stack<Integer> ham = new Stack<>();
        for(int ing : ingredient) {
            if(ham.size() == 0 && ing==1) ham.push(ing);
            else if(ham.isEmpty()) continue;
            else if(ham.peek() == 1 && ing==2) ham.push(ing);
            else if(ham.peek() == 2 && ing==3) ham.push(ing);
            else if(ham.peek() == 3 && ing==1) {
                answer++;
                ham.pop(); ham.pop(); ham.pop();
            } else if(ing==1) ham.push(ing);
            else ham.clear();
        }
        return answer;
    }
}
