package String;

import java.util.Scanner;

public class Character10 {
    public int[] solution(String s, char t) {

        // 문자열 s의 길이를 n에 저장하고,
        // 결과를 저장할 정수 배열 answer 를 생성합니다. p를 큰 값으로 초기화합니다.
        int n = s.length();
        int[] answer = new int[n];
        int p = 1000; // 큰 값으로 초기화

        // 왼쪽에서 오른쪽으로 탐색
        // 현재 문자가 t와 같으면 p를 0으로 설정하고,
        // 그렇지 않으면 p를 증가시킵니다.
        // 각 위치의 거리를 answer 배열에 저장합니다.
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        // 오른쪽에서 왼쪽으로 탐색
        // 현재 문자가 t와 같으면 p를 0으로 설정하고,
        // 그렇지 않으면 p를 증가시킵니다.
        // 각 위치의 거리를 answer 배열에 저장된 값과 비교하여 더 작은 값을 선택합니다.
        p = 1000; // 큰 값으로 초기화
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    // main 메소드에서 사용자로부터 문자열 s와 문자 t를 입력받고,
    // solution 메소드를 호출하여 결과를 출력합니다
    public static void main(String[] args) {
        Character10 T = new Character10();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t = kb.next().charAt(0);
        int[] result = T.solution(s, t);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

