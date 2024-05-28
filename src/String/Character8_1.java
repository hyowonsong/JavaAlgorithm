package String;

import java.util.Scanner;

// Character8 replaceAll 사용
public class Character8_1 {
    public String solution(String s) {
        String answer = "NO";
        // 입력된 문자열 s를 대문자로 변환하고,
        // replaceAll 메서드를 사용하여 알파벳 이외의 모든 문자를 제거합니다. 이렇게 하면 알파벳만 남게 됩니다.
        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        // 알파벳만 남은 문자열 s를 뒤집은 후, 문자열로 변환하여 tmp에 저장합니다.
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Character8 T = new Character8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
