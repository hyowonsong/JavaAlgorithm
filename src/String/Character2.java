package String;

import java.util.Scanner;

// 대소문자 변환
public class Character2 {
    // 문자를 입력 받는데 대문자는 소문자로 소문자는 대문자로 변환하여 출력
    public String solution(String str){
        // 문자열을 출력해야 하니까 answer = "" 해준다
        String answer = "";
        for (char x: str.toCharArray()){
            // 만약 대문자이면 소문자로 소문자이면 대문자로
            // Character.isLowerCase 여기 안에 x 를 넣어서 해결
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        Character2 T = new Character2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
