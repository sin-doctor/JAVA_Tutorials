package com.kh;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UnifiedMethods {


    public void method1() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        System.out.println("홀수 값의 합: " + sum);
    }


    public void method2() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Eve");

        System.out.print("A로 시작하는 이름: ");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }
        System.out.println();
    }


    public void method3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("결과: " + (a / b));
        }
    }


    class Animal {
        public void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public void method4() {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }


    public void method5() {

        String inputFile = "C:/Users/user1/Desktop/numbers.txt";
        String outputFile = "C:/Users/user1/Desktop/result.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            int sum = 0;
            String line;
            StringBuilder numbersRead = new StringBuilder("Numbers: ");

            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                sum += num;
                numbersRead.append(num).append(" ");
            }

            // 파일에 숫자들과 합계를 저장
            bw.write(numbersRead.toString().trim() + "\n"); // 읽은 숫자들 저장
            bw.write("Sum: " + sum);                        // 합계 저장
            System.out.println("Result saved to " + outputFile);

        } catch (IOException e) {
            System.err.println("파일 작업 중 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }





    class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            this.balance = 0;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("입금: " + amount + " | 잔액: " + balance);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("출금: " + amount + " | 잔액: " + balance);
            } else {
                System.out.println("Insufficient funds");
            }
        }
    }

    public void method6() {
        BankAccount account = new BankAccount("123-456");
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(400);
    }

    // Method 7: 연산자와 변수
    public void method7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.println("합: " + (a + b));
        System.out.println("차: " + (a - b));
        System.out.println("곱: " + (a * b));
        System.out.println("몫: " + (a / b));
        System.out.println("나머지: " + (a % b));
    }


    public static void main(String[] args) {
        UnifiedMethods um = new UnifiedMethods();


        um.method1();
        um.method2();
        um.method3();
        um.method4();
        um.method5();
        um.method6();
        um.method7();
    }
}
