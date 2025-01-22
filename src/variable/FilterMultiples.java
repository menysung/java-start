package variable;


import java.util.*;

public class FilterMultiples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. 정렬하기 numbers 리스트를 오름차순으로 정렬
        Collections.sort(numbers);

        // 2. 3의 배수와 5의 배수 제외하기
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int num : numbers) { // for-each 반복문
            if (num % 3 != 0 && num % 5 != 0) {
                // if 조건문 : 각 num 값이 3의 배수도 아니고 5의 배수도 아닌 경우에만 다음 코드를 실행
                filteredNumbers.add(num);
                //조건이 만족하면 filteredNumbers 리스트에 num 추가
            }
        }

        // 결과 출력
        System.out.println(filteredNumbers);
    }
}
