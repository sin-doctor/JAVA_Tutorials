package com.kh.polymorphismEx;
/*
* 다형성 : 다양한 형태를 지니는 성질
*
* 1. 상속 관계의 자식 객체의 모습이 여러 모습으로 보임
*   자식 객체, 부모 객체, Object 객체 등으로 변하는 것처럼 보임
*
* 2. 오버 로딩
*   같은 클래스에서 같은 이름의 메서드를 여러 번 작성하는 기술
*   조건 : 메서드명 동일, 매개변수 개수, 타입 순서하나라도 달라야함
*   목적 : 전달 받은 매개 변수에 따른 상황별 처리 방법 구현
* sum(a,b)   -> 두 수 더하기
* sum(a,b,c) -> 세 수 더하기
* sum(배열)  -> 내열 내 요소 모두 더하기
* */
public class PolymorphismEx {

   /*오버로딩이 되는 조건
     * 매개변수의 개수가 다르거나 종류가 다르거나 순서가 다르거나 일 때 오버로딩이 적용된다.
     * 매개변수 명과 반환 타입은 오버로딩 조건에 상관이 없음

    */
    // 오버로딩 문제
    // public void sum 명칭 변경 x
    // 하나는 두 수끼리 더하기
    // 세수 끼리 더하기
    // 두 실수끼리 더하기
    // 두 문자형끼리 더하기
   /* public void sum(int a ,int b){
        System.out.println(a+b);
    };
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    };
    public void sum(double a,double b){
        System.out.println(a+b);
    };
    public void sum(String a,String b){
        System.out.println(a+b);
    };

    */

   /* 아래 기준 메소드를 먼저 써놓고
1번부터 7번까지의 메소드를 차례로 써나간다고 할 때
    오버로딩이 적용되는 것은 무엇일까?
    기준    public void method1(int i){}


=========================
 1    public void method1(String str){} 종류가 다름 O
 2    public void method1(int i, String str){} 종류 ,갯수가 다름 O
 3    public void method1(int num){} 종류 갯수가 같음 X
 4    public char method1(int point){} 종류 갯수가 같음 X
 5    public void method1(int i, int k){} 갯수가 다름 O
 6    public void method1(int num, String string){} 2번에서 먼저 중복되므로 x
 7    public void method1(String str, int i){} 순서가 다름 O

    */
}
