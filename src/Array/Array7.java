package Array;

import java.util.Scanner;

public class Array7 {
    // 연속적으로 답을 맞히는 경우에는 가산점
    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array7 T = new Array7();
        Scanner kb = new Scanner(System.in);

        // 문제의 개수 입력
        int n = kb.nextInt();
        int[] arr = new int[n];

        // 채점 결과 입력
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        // solution 메소드 호출하여 결과 출력
        int result = T.solution(n, arr);
        System.out.println(result);
    }
}

