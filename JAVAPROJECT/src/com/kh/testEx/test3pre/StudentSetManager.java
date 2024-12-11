package com.kh.testEx.test3pre;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSetManager {
    public static void main(String[] args) {
        Set<String> studentSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    System.out.print("추가할 학생 이름 입력: ");
                    String studentToAdd = scanner.nextLine();
                    if (studentSet.contains(studentToAdd)) {
                        System.out.println("이미 존재하는 학생입니다.");
                    } else {
                        studentSet.add(studentToAdd);
                        System.out.println(studentToAdd + " 학생이 추가되었습니다.");
                    }
                    break;

                case 2:
                    System.out.print("삭제할 학생 이름 입력: ");
                    String studentToRemove = scanner.nextLine();
                    if (studentSet.contains(studentToRemove)) {
                        studentSet.remove(studentToRemove);
                        System.out.println(studentToRemove + " 학생이 삭제되었습니다.");
                    } else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    break;

                case 3:
                    System.out.println("학생 목록:");
                    if (studentSet.isEmpty()) {
                        System.out.println("등록된 학생이 없습니다.");
                    } else {
                        for (String student : studentSet) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 4:
                    System.out.print("확인할 학생 이름 입력: ");
                    String studentToCheck = scanner.nextLine();
                    if (studentSet.contains(studentToCheck)) {
                        System.out.println(studentToCheck + " 학생이 존재합니다.");
                    } else {
                        System.out.println(studentToCheck + " 학생이 존재하지 않습니다.");
                    }
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    exit = true;
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }

            System.out.println(); // 줄바꿈
        }

        scanner.close();
    }
}
