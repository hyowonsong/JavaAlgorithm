package String;

import java.util.ArrayList;
import java.util.Scanner;

// 문장 속 단어
public class Character4 {
    public ArrayList<String> solution(int n, String[] str){
        // 빈 ArrayList<String>을 생성하고, 이를 answer 라는 변수에 할당합니다.
        // 이 리스트는 뒤집힌 문자열을 저장하는 데 사용
        ArrayList<String> answer=  new ArrayList<>();
        for (String x: str){
            // 현재 문자열 x를 StringBuilder 객체로 변환하고,
            // reverse() 메소드를 사용하여 문자열을 뒤집은 다음,
            // toString() 메소드를 사용하여 다시 문자열로 변환한 결과를 tmp 변수에 저장합니다.
            String tmp = new StringBuilder(x).reverse().toString();
            // 뒤집힌 문자열 tmp 를 answer 리스트에 추가합니다.
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Character4 T = new Character4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 단어의 개수를 입력받음
        kb.nextLine(); // 개행 문자 소비
        // for 루프를 사용하여 n개의 단어를 입력받아 배열 str 에 저장합니다.
        // nextLine() 메소드는 각 단어를 문자열로 읽습니다.
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.nextLine();
        }

        // solution 메소드를 호출하여 배열 str에 있는 각 단어를 뒤집은 결과를
        // ArrayList<String> 타입의 result 변수에 저장합니다.
        ArrayList<String> result = T.solution(n, str);
        // 향상된 for 루프를 사용하여 result 리스트의 각 문자열 s를 출력합니다.
        // 뒤집힌 단어들이 한 줄씩 출력됩니다.
        for (String s : result) {
            System.out.println(s);
        }
    }

}