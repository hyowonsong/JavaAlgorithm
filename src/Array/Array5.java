package Array;

import java.util.Scanner;

public class Array5 {
    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];

        // 2부터 n까지의 숫자에 대해 소수 여부를 판별합니다.
        for (int i = 2; i < n; i++){
            // 현재 숫자가 소수인 경우
            if(ch[i] == 0){
                answer++; // 소수 개수를 증가시킵니다.

                // 현재 소수의 배수들을 모두 소수가 아니라고 표시합니다.
                for(int j = i; j <= n; j += i) // i의 배수들을 확인합니다.
                    ch[j] = 1; // 소수가 아니라고 표시합니다.
            }
        }
        return answer; // 소수의 개수를 반환합니다.
    }

    public static void main(String[] args) {
        Array5 T = new Array5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 사용자로부터 정수 n을 입력받습니다.
        System.out.println(T.solution(n)); // 소수의 개수를 출력합니다.
    }
}

