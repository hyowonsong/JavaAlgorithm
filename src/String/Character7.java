package String;

public class Character7 {
    public String solution(String str){
        // 결과를 저장할 문자열 answer 를 선언하고 초기값으로 "NO"를 설정합니다.
        String answer = "NO";

        // 입력받은 문자열 str 을 StringBuilder 객체로 변환합니다.
        // StringBuilder 의 reverse() 메소드를 사용하여 문자열을 뒤집고, 이를 다시 문자열로 변환하여 tmp 변수에 저장합니다.
        String tmp = new StringBuilder(str).reverse().toString();

        // 입력 문자열 str과 뒤집힌 문자열 tmp를 대소문자 구분 없이 비교합니다.
        // 두 문자열이 같다면, 이는 str이 회문임을 의미합니다.
        // 이 경우 answer를 "YES"로 설정합니다.
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }
}
