package com.kh.loopEx;

import java.util.Scanner;

public class LoopRun {
    public static void main(String[] args) {
//        ForEx forEx = new ForEx();
//        forEx.method2();
        WhileEx whileEx = new WhileEx();
        System.out.print("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        whileEx.method1(number);

    }
}

