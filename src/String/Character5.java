package String;

import java.util.Scanner;

public class Character5 {
    public String solution(String str) {
        // 입력받은 문자열을 문자 배열로 변환합니다.
        char[] s = str.toCharArray();
        // 두 개의 포인터 left 와 right 를 설정합니다.
        int left = 0, right = str.length() - 1;
        // left 포인터가 right 포인터보다 작을 때까지 반복합니다.
        while (left < right) {
            // left 와 right 가 가리키는 문자가 알파벳인지 확인합니다.
            // 알파벳이 아니면 해당 포인터를 이동시킵니다.
            // 둘 다 알파벳인 경우에는 두 문자를 교환하고, 두 포인터를 각각 이동시킵니다.
            if (!Character.isLetter(s[left])) {
                left++;
            } else if (!Character.isLetter(s[right])) {
                right--;
            } else {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }
        // 수정된 문자 배열을 문자열로 변환하여 반환합니다
        return new String(s);
    }

    public static void main(String[] args) {
        Character5 T = new Character5();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}

