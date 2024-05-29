package String;

import java.util.Scanner;

// 문자열 압축
public class Character11 {
    public String solution(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // 마지막 문자가 아니고 현재 문자와 다음 문자가 같다면 count 증가
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // 현재 문자 추가
                compressed.append(str.charAt(i));
                // count 가 1보다 크다면 count 추가
                if (count > 1) {
                    compressed.append(count);
                }
                // count 초기화
                count = 1;
            }
        }
        return compressed.toString();
    }

    public static void main(String[] args) {
        Character11 T = new Character11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
