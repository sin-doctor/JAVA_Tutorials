package com.kh;

import java.io.*;
import java.util.Scanner;

public class practice8 {
    private static String PATH = System.getProperty("user.home") + "/Desktop/";
    private static String FILE_NAME =  "todolist"; // 기본 파일 이름
    private static String EXT_NAME =  ".txt"; // 기본 확장자명

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== To-Do 리스트 관리 ====");
        System.out.println("1. 기존 파일 불러오기");
        System.out.println("2. 새로운 파일로 시작하기");
        System.out.print("옵션을 선택하세요: ");
        String firstChoice = scanner.nextLine();
        File file = new File(PATH + FILE_NAME);

        switch (firstChoice) {
            case "1":
                System.out.print("불러올 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                break;
            case "2":
                System.out.print("새로운 To-Do 리스트 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                if (file.exists()) {
                    System.out.println("파일이 이미 존재합니다. : " + file.getAbsolutePath());
                } else {

                    try {
                        file.createNewFile();
                        System.out.println("파일 생성이 완료되었습니다. : ");
                    } catch (IOException e) {
                        System.out.println("파일 생성중 문제가 발생했습니다. : " + e.getMessage());
                    } finally {
                        System.out.println("파일 생성을 종료합니다.");
                    }
                    System.out.println("새로운 파일이 생성됩니다: " + FILE_NAME + EXT_NAME);
                    break;
                }
                    default:
                        System.out.println("잘못된 선택입니다. 기본 파일로 시작합니다: " + FILE_NAME + EXT_NAME);

        }

        boolean isTrue = true;
        while (isTrue) {
            System.out.println("\n==== To-Do 리스트 ====");
            System.out.println("1. 할 일 목록 보기");
            System.out.println("2. 할 일 추가");
            System.out.println("3. 종료");
            System.out.print("옵션을 선택하세요: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    if (!file.exists()) {
                        System.out.println("파일을 찾을 수 없습니다. 새로운 파일을 생성하거나 확인하세요.");
                        return;
                    }
                    try (FileReader fr = new FileReader(file);
                         BufferedReader br = new BufferedReader(fr)){
                        String line;

                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("파일을 찾을 수 없습니다. :"+e.getMessage());
                    } catch (IOException e) {
                        System.out.println("파일 찾기 이외 다른 문제가 발생했습니다. :" + e.getMessage());
                    }
                    break;
                    case "2":

                        if (!file.exists()) {
                            System.out.println("이어서 작성할 파일이 존재하지 않습니다. 먼저 파일을 생성해주세요.");
                            return;
                        } else {
                            try (FileWriter fw = new FileWriter(file, true)) {
                                // (file) 기존파일 덮어쓰기를 하거나 새로 만들기 (file,true) 이어서 작성하기 모드
                                Scanner sc = new Scanner(System.in); // 파일에 글을 작성하기 위해 스캐너 사용
                                System.out.print("새로운 할 일을 입력하세요 : ");
                                fw.write(sc.nextLine());

                                // try 옆에 저렇게 넣으면 close 사용할 필요가 업승ㅁ
                            } catch (IOException e) {
                                System.out.println("파일에 글을 이어서 작성하던 도중 문제가 발생했습니다." + e.getMessage());
                            } finally {

                                System.out.println("할 일이 추가되었습니다: " + FILE_NAME + EXT_NAME);
                            }
                        }
                        break;
                        case "3":
                            System.out.println("종료합니다.");
                            return;
                            default:
                                System.out.println("잘못입력하셨습니다");
                                break;
            }

            }
        }
    }

