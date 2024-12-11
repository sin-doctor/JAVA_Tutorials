package com.kh.practiceEX.StringEx;

public class StringBuilderPre {
    /*TODO

    String str = "Welcome";
    1. 작성된 객체를 StringBuilder sb 로 변환해서 사용

    2. to Java 이어서 작성

    3. 8번째 자리에 the world of 글자 추가

    4. 4~ 11 come to 변경

    5. 20, 25 삭제

    6. sb 뒤집기
     */

    public static void main(String[] args) {
        StringBuilderPre sb = new StringBuilderPre();
        sb.method1();
    }
    public void method1(){
        String str = "Welcome";
        StringBuffer sb = new StringBuffer(str);

        sb.append("to Java");
        System.out.println(sb);

        sb.insert(8,"the world of");
        System.out.println(sb);

        sb.replace(4,11,"come to");
        System.out.println(sb);

        sb.delete(20,25);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


    }
}
