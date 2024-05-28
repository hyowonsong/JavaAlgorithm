package String;

import java.util.Scanner;

// 문장 속 단어
public class Character3 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        // 입력된 문자열 str 을 공백을 기준으로 나누어 단어별로 분리한 후, 배열 s에 저장합니다.
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            // 각 단어의 길이를 'len' 변수에 저장합니다.
            // 현재 단어의 길이 'len' 이 'm' 보다 크면, 'm' 을 'len' 으로 업데이트하고
            // 'answer' 를 현재 단어 'x' 로 설정합니다.
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Character3 T = new Character3();
        Scanner kb = new Scanner(System.in);
        // next() 는 단어 단위 일기, nextLine() 은 전체 라인 단위 읽기
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
