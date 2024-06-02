package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array6 {

    // 주어진 숫자가 소수인지 판별하는 함수
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) // 소수는 1과 자기 자신으로만 나누어지므로, 나머지가 0이면 소수가 아님
                return false;
        }
        return true; // 위의 조건을 만족하지 않으면 소수임
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Array6 T = new Array6();
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

