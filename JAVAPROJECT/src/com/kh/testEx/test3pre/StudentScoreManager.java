package com.kh.testEx.test3pre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentScoreManager {
    public static void main(String[] args) {

        // 1. 학생 정보 저장
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("김철수", 85);
        studentScores.put("이영희", 92);
        studentScores.put("박민수", 77);
        studentScores.put("최수진", 88);

        // 2. 학생 정보 출력
        printStudentScores(studentScores);

        // 3. 합격/불합격 판단
        printPassOrFail(studentScores);

        // 4. 점수 수정 기능
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 수정할 학생 이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.println(name + "의 새로운 점수를 입력하세요:");

        if (studentScores.containsKey(name)) {
            int newScore = scanner.nextInt();
            studentScores.put(name, newScore);
            System.out.println(name + "의 점수가 " + newScore + "로 수정되었습니다.");
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }

        // 수정 후 결과 출력
        printPassOrFail(studentScores);
        scanner.close();
    }

    // 저장된 모든 학생과 점수를 출력
    private static void printStudentScores(Map<String, Integer> scores) {
        System.out.println("학생 정보:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "점");
        }
    }

    // 합격/불합격 여부를 출력
    private static void printPassOrFail(Map<String, Integer> scores) {
        System.out.println("합격/불합격 결과:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String result = entry.getValue() >= 80 ? "합격" : "불합격";
            System.out.println(entry.getKey() + ": " + result);
        }
    }
}


