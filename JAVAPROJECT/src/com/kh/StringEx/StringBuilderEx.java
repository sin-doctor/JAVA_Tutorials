package com.kh.StringEx;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilderEx sb = new StringBuilderEx();
        sb.method1();
    }
    public void method1(){
        /*
        * StirngBuilder 기능들
        * append(string str) : 문자열을 현재 문자열 끝에 추가
        * insert(int index,String str) = 지정한 위치에 문자열 삽입
        * delete(int start, int end) = 지정된 범위의 문자열 삭제
        * deleteCharAt(int index) = 지정한 인덱스의 문자 하나를 삭제
        * replace(int start, int end, String str) = 지정한 범위의 문자열 다른 문자열로 대체
        * reverse()                               = 문자열을 뒤집음(거꾸로)
        * length()                                = 문자열의 길이를 반환
        * charAt(int index)                       = 지정한 위치의 문자를 반환
        * setCharAt(int index, char ch)           = 지정한 위치의 문자를 다른 문자 하나로 변경
        * subString(int start, int end)           = 지정된 범위의 문자열 반환
        *
        *
        * */
        StringBuilder s1 = new StringBuilder();
        s1.append("hello"); //s1 공간에 hello 작성되고
        s1.append("world"); // s1 공간에 hello world 가 작성됨
        System.out.println(s1);
        // String에서는 +=을 작성하지 않으면 이어서 작성한다음
        // 객체생성을 하지 않고 단독 작성

        // StringBuilder는 이어서 작성


    }
}
