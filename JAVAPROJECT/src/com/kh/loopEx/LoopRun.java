package com.kh.loopEx;

import java.util.Scanner;

public class LoopRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ForEx forEx = new ForEx();
//        forEx.method2();
        WhileEx whileEx = new WhileEx();

        while (true) {
            System.out.print("값을 입력하세요 (-1 입력 시 종료): ");
            int input = sc.nextInt();

            if (input == -1) { // 종료 조건
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            whileEx.method1(input); // 입력값을 method1에 전달
        }

        sc.close(); // Scanner 닫기
    }
}

