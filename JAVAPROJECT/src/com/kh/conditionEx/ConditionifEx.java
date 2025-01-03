package com.kh.conditionEx;

public class ConditionifEx {
    /*
    * 조건에 맞는 구문이 1가지일 경우 {}를 생략해도 된다.
    *
    * if (조건) 조건이 true일 때 수행할 문장
    *
    * if (조건) 조건이 true일 떄 수행할 문장
    *
    * else-if (조건2) 조건1이 false이고 조건2가 true일 떄 수행
    *
    * else      조건1 조건2 가 false일 때 수행할 문장*/
    /*
    * if(조건) {
    *    조건이 true일 때 실행
    * }
    *
    * */
    public void method0(int age){
        System.out.println("---if문 만 {}를 생략해서 사용한 경우---");
        if(age >= 19) System.out.println("성인입니다.");

        System.out.println("--- if / else if / else {}를 생략해서 사용한 경우 ---");
        if(age >= 19)               System.out.println("성인입니다.");
        else if (age>=14&&age<=18)  System.out.println("청소년 입니다.");
        else                        System.out.println("어린이입니다.");


    }
    public void method1(int age){ // 매개변수명에(age)에 전달인자로 나이가 들어왔을 경우
        if(age >= 19){
            System.out.println("성인입니다.");
        }
    }
    /*
    * if(조건1){
    *   조건1이 true일 때 실행
    * }else{
    *   조건이 false일 떄 실행
    * }
    * */
    public void method2(int age){ // 매개변수명 (age)에 전달인자값(나이값)들어오면
        if(age >= 19){
            System.out.println("성인입니다.");
        }else{
            System.out.println("성인이 아닙니다.");
        }
    }
    /*
    * if(조건1){
    *    조건1이 true일 때 실행
    * }else if(조건2){
    * 조건1이 false일때 실행
    * 조건2가 true일때 실행
    * }else{
    * 조건1과 조건2가 false일때 실행
    * }
    * */

    public void method3(int age){
        if(age >= 19){
            System.out.println("성인입니다.");
        } else if (age <= 18 && age >= 14){
            System.out.println("청소년입니다.");
        }else {
            System.out.println("어린이입니다.");
        }
    }
}
