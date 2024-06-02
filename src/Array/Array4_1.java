package Array;

import java.util.Scanner;

public class Array4_1 {
    public int[] solution(int n){
        int[] result = new int[n];
        int a = 1, b = 1, c;

        result[0] = a;
        result[1] = b;

        for (int i = 2; i < n; i++){
            c = a + b;
            result[i] = c;
            a = b;
            b = c;
        }

        return result;
    }

    public static void main(String[] args) {
        Array4_1 T = new Array4_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int x : T.solution(n)) System.out.print(x + " ");
    }
}
