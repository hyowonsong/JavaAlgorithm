package String;

import java.util.Scanner;

public class Character9 {
    public int solution(String s){
        String answer = "";
        for (char x: s.toCharArray()){
            // 만약 현재 문자 x가 숫자라면(Character.isDigit(x)),
            // 그 값을 answer 에 추가합니다.
            if(Character.isDigit(x)) answer+=x;
        }
        // 문자열로 이루어진 answer 를 정수로 변환하여 반환합니다.
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Character9 T = new Character9();
        Scanner kb = new Scanner(System.in);
        // next() 는 단어 단위 일기, nextLine() 은 전체 라인 단위 읽기
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
