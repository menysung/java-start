package variable;

public class VowelFilter {
    //VowelFilter 모음을 필터링하고 출력하는 기능을 담당
    public static void main(String[] args) {
        String str = "Programming is fun!";
        // 변수 str 에 문자열 Programming is fun! 을 저장함. 이 문자열에서 모음만 추출할 예정

        // 1. 모음만 출력하기
        StringBuilder vowels = new StringBuilder();
        // 모음을 저장할 vowels 객체 생성

        //for-each  루프 시작
        for (char c : str.toCharArray()) { //배열의 각 문자를 c 에 하나씩 저장하며 반복
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels.append(c); //append(c) 문자열의 끝에 문자를 붙이는 메서드
            }
        }

        // vowels 에 저장된 모음을 문자열로 변환. 결과 출력
        System.out.println(vowels.toString());
    }
}
