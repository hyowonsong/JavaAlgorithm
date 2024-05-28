package String;

import java.util.Scanner;

public class Character6 {
    public String solution(String str){
        String answer = "";
        for (int i=0; i<str.length(); i++){
            // str.indexOf(str.charAt(i))는 현재 문자가 문자열 str 에서 처음으로 나타나는 위치의 인덱스를 반환합니다.
            // 이 값이 현재 인덱스 i와 같다면, 이는 현재 문자가 처음으로 나타나는 위치임을 의미합니다
            // 따라서 이 문자는 처음 한 번만 등장하는 문자입니다.
            // 조건이 참이면, answer 문자열에 현재 문자를 추가합니다.
            if (str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Character6 T = new Character6();
        Scanner kb = new Scanner(System.in);
        // next() 는 단어 단위 일기, nextLine() 은 전체 라인 단위 읽기
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

