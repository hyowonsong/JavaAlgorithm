package Array;
import java.util.ArrayList;
import java.util.Scanner;

// ArrayList 는 ArrayList 의 배열을 반환하고
// int 는 마지막 결과값만을 반환한다. 이 차이 체크!!
public class Array1 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i=1; i<n; i++){
            if (arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Array1 T = new Array1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n,arr)){
            System.out.println(x+" ");
        }
    }
}
