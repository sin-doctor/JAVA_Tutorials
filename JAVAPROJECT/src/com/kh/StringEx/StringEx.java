package com.kh.StringEx;

public class StringEx {

    public static void main(String[] args) {
        StringEx se = new StringEx();
        se.method1();
    }
    public void methodString() {
        String str1 = "  Hello World  ";
        String str2 = "hello";

        // 1. str1 문자열의 길이 반환
        System.out.println("str1 문자열 길이 : " + str1.length());

        // 2. str2 1번 위치의 문자가 무엇인지 확인
        System.out.println("str2 1번 위치의 문자열 : " + str2.charAt(1));

        // 3. str2 첫 번째 위치 반환 대상자는 영어알파벳 l(=L)
        System.out.println("str2 에서 l의 마지막 위치는 : " + str2.indexOf('l'));

        // 4. str2 마지막 위치 반환 대상자는 영어알파벳 l(=L)
        System.out.println("str2 에서 l의 마지막 위치는 : " + str2.lastIndexOf('l'));

        // 5. str1 World 라는 값이 포함되어 있는지 확인 결과 : boolean
        System.out.println("str1에 World 가 포함되어 있는지 확인 결과 : "+str1.contains("World"));
        // 6. 문자열 비교 대소문자 구분 str1 과 str2 비교
        System.out.println("str1과 str2는 대소문자 구분 비교 : " + str1.equals(str2));
        // 7. 문자열 비교 대소문자 구분 x "hello world!"와 비교
        System.out.println("str1과 'hello world!' 대소문자 무시하고 동일한지비교 : "
                + str1.trim().equalsIgnoreCase("hello world!"));
        // 8. str1 문자열을 모두 대문자로 변환
        System.out.println("str1을 모두 대문자로 변환 : " + str1.toUpperCase());
        // 9. str2 문자열을 모두 소문자로 변환
        System.out.println("str2를 모두 소문자로 변환 : " + str2.toLowerCase());
        // 10. str1 앞 뒤 공백 제거
        System.out.println("str1의 앞뒤 공백 제거 : " + str1.trim());

        String str3 = "Hello Java World";
        String str4 = "Let's learn!";
        // 11. subString 이용해서 str3 6번째부터 끝까지 자르기
        System.out.println(" subString 이용해서 str3 6번째부터 끝까지 자르기 : "+str3.substring(6));
        // 12. subString str3 3 ~ 7까지만 자르기
        System.out.println(str3.substring(3,7));
        // 13. replace Java 를 HTML로 대체
        System.out.println(str3.replace("Java","HTML"));
        // 14. concat str4 를 str3와 결합 str3 + str4
        System.out.println(str3.concat(str4));

        // 15. split 문자열을 "" 기준으로 나누고 for-each문을 이용해서 출력
        String[] splitArray = str3.split(" ");
        for (String s : splitArray) {
            System.out.println(s);
        }
    }
    public void method1(){
        String str = "안녕하세요. 반갑습니다.";
        System.out.println(str);
        str = "식사는 맛있게 하셨나요";
        System.out.println(str);
    }

}
