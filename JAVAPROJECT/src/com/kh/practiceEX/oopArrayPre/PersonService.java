package com.kh.practiceEX.oopArrayPre;

import java.util.Scanner;

public class PersonService {

    public static void main(String[] args) {

        // Person 배열 생성
        Person[] people = new Person[4];

        Scanner sc = new Scanner(System.in);

        // Scanner 객체를 이용해서 사용자에게 키보드로 정보를 입력하고 배열 초기화
      for (int i = 0; i < people.length; i++) {
          System.out.print(i+"번 째 사람의 이름을 입력하세요 : ");
          String name = sc.nextLine();

          System.out.print(i+ "번 째 사람의 나이를 입력하세요 : ");
          int age = sc.nextInt();
          sc.nextLine();
          people[i] = new Person(name, age);


      }
      System.out.println("\n모든 사람이 등록되 었습니다 . 아래는 ");


        // for 문을 이용해서

        // ㅇㅇ 번째 사람의 이름을 입력하세요

        // ㅇㅇ 번째 사람의 나이를 입력하세요 이름입력 입력한 내용이

        // Person ㅇㅇ 번째 객체 생성 및 배열에 저장

        // 저장을 완료할 경우 for문을 탈출해서 모든사람이 등록되었습니다 출력문 결과 출력


        // 각 배열의 값을 출력 1 일반 for 문 2 향상된 for 문으로 만들기


    }

}
