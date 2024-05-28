package String;

import java.util.Scanner;

public class Character8 {
    public String solution(String str) {
        // 알파벳만 추출하여 StringBuilder 에 추가
        StringBuilder filtered = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                filtered.append(c);
            }
        }

        // 추출된 문자열을 소문자로 변환
        String filteredStr = filtered.toString().toLowerCase();

        // 문자열을 뒤집어 원래 문자열과 비교
        String reversedStr = new StringBuilder(filteredStr).reverse().toString();
        if (filteredStr.equals(reversedStr)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Character8 T = new Character8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
