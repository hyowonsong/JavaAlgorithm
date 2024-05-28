package String;

import java.util.*;

// 1. 문자 찾기
public class Character1 {
    // 'solution' 메서드를 반환하는데 반환 타입은 int 입니다.
    public int solution(String str, char t){
        int answer = 0;
        // str 과 t 둘 다 대문자로 변환
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        // str 을 문자 배열로 변환하고, 각 문자를 'x' 라는 변수로 순회
        for(char x: str.toCharArray()){
            // 현재 문자와 t 가 같으면 answer 를 1 증가시킵니다.
            if (x==t) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        // Character 클래스의 인스턴스를 생성하여 'T' 라는 변수에 저장
        Character1 T = new Character1();
        // 사용자 입력을 받기 위해 'scanner' 객체를 생성합니다.
        Scanner kb = new Scanner(System.in);
        // 사용자로부터 문자열을 입력받아 'str' 변수에 저장합니다.
        // 'kb.next()' 는 공백을 기준으로 문자열 받습니다.
        String str = kb.next();
        // 사용자로부터 문자열을 입력받아 그 첫 번째 문자를 'c' 변수에 저장
        // kb.next() 는 문자열을 입력받고, 'charAt(0)' 은 그 문자의 첫 번째 문자열 추출
        char c = kb.next().charAt(0);
        // 'solution' 메서드를 호출하여 'str' 내에서 'c'의 출현 횟수 구하기
        System.out.println(T.solution(str, c));
    }
}
