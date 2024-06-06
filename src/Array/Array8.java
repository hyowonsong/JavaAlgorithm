package Array;

import java.util.Scanner;

public class Array8 {
    // 여기는 int[] 로 배열을 구성
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for (int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<n; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Array8 T = new Array8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 자연수의 개수 입력
        int[] arr = new int[n]; // 입력된 자연수들을 저장할 배열
        // 자연수 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        // 입력된 자연수들을 뒤집고 소수인지 판별하여 출력
        for (int x : T.solution(n,arr)) {
            System.out.println(x+ " ");
        }
    }
}
