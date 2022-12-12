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
//        System.out.println(hamburger(new int[]{1,2,1,2,3,1,3,1,2,3,1,2,3,1}));
//        System.out.println(fruit(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
//        System.out.println(cola(2, 1, 20));
//        System.out.println(foodFight(new int[]{1, 7, 1, 2}));
//        System.out.println(threeMusketeers(new int[]{-3, -2, -1, 0, 1, 2, 3}));
        System.out.println(numPair("100", "123450"));
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

    /**
     * methodName : fruit
     * author : sbyim
     * description : 과일장수
     *
     * @param k 최대값
     * @param m 박스의 과일 개수
     * @param score
     * @return int
     */
    public static int fruit(int k, int m, int[] score) {
        int[] sort = new int[k];
        for (int s : score)
            sort[s-1] = ++sort[s-1];

        int answer = 0; //점수
        int bef = 0;
        for(int i=sort.length-1; i>=0; i--) {
            if(bef>0) { //더 높은 스코어에 남은게 있는 경우
                if (sort[i] >= bef) {
                    answer += (i+1) * m;
                    sort[i] -= bef;
                    bef = 0;
                } else {
                    bef -= sort[i];
                    sort[i] = 0;
                }
            }
            if(sort[i]/m > 0) { //한박스 이상 만들 수 있는 경우
                answer += ((i+1)*m) * (sort[i]/m) ;
                if (sort[i]%m > 0) bef = m-sort[i]%m;
                else bef = 0;
            } else if (sort[i] > 0) { //한박스 이하
                bef = m-sort[i];
            }
        }
        return answer;
    }

    /**
     * methodName : cola
     * author : sbyim
     * description : 콜라 문제
     *
     * @param a
     * @param b
     * @param n
     * @return int
     */
    public static int cola(int a, int b, int n) {
//  콜라 b개 = 빈병 a 개.. 내가 갖고있는 콜라 = n
//        만약에 콜라 10개가 있는데, 빈병 3개에 2개로 바꿔준다고하면? 빈병 9개로 6개 받아오기. 10/3*2? 그럼 콜라는 6+1 7개가 됨.
        int result = 0;
        while(n >= a) {
            int cola = n/a*b;
            result += cola;
            n = cola + (n%a);
        }
        return result;
    }

    /**
     * methodName : foodFight
     * author : sbyim
     * description : 푸드 파이트 대회
     *
     * @param food
     * @return string
     */
    public static String foodFight(int[] food) {
        String answer = "0";
        for (int i=food.length-1; i>0; i--) {
            if (food[i]%2==1) food[i] = food[i]-1; //홀수면 한개 제거
            for (int j=0; j<food[i]/2; j++) {
                answer += i;
                answer = i + answer;
            }
        }
        return answer;
    }

    /**
     * methodName : threeMusketeers
     * author : sbyim
     * description : 삼총사
     *
     * @param number
     * @return int
     */
    public static int threeMusketeers(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length; i++) {
            for(int j=i+1; j<number.length; j++) {
                for(int k=j+1; k<number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        return answer;
    }

    /**
     * methodName : numPair
     * author : sbyim
     * description : 숫자짝꿍
     *
     * @param X
     * @param Y
     * @return string
     */
    public static String numPair(String X, String Y) {
        int[][] nums = new int[2][10];
        for (int i=0; i<X.length(); i++)
            nums[0][X.charAt(i) - '0'] = nums[0][X.charAt(i) - '0']+1;
        for (int i=0; i<Y.length(); i++)
            nums[1][Y.charAt(i) - '0'] = nums[1][Y.charAt(i) - '0']+1;
        StringBuilder sb = new StringBuilder();

        for(int i=9; i>=0; i--) {
            if(nums[0][i] > 0) {
                int tmp = Math.min(nums[0][i], nums[1][i]);
                for(int j=0; j<tmp; j++)
                    sb.append(i);
            }
        }
        String answer = "";
        if(sb.length() == 0) answer = "-1";
        else if(sb.charAt(0) == '0') answer = "0";
        else answer = sb.toString();
        return answer;
    }
}
