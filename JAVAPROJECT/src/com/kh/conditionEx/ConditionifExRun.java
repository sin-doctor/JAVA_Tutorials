package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionifExRun {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
//        ConditionifEx cix = new ConditionifEx();
//
//        System.out.println("나이를 숫자로 입력하세요 : ");
//        int age = sc.nextInt();
//        sc.nextLine();
//
//        cix.method0(age);
//      cix.method1(age);
//        cix.method2(age);
//       cix.method3(age);
//        ConditionPre cp = new ConditionPre();
//        System.out.print("계절을 숫자로 입력하세요 : ");
//        int month = sc.nextInt();
//        sc.nextLine(); // 줄바꿈 버퍼 제거
//        cp.method1(month);
        CondotionSwitchPre csp = new CondotionSwitchPre();
        System.out.print("숫자를 입력하세요 : ");
        int choice = sc.nextInt();
        sc.nextLine();
        csp.choiceDay(choice);
    }
}
