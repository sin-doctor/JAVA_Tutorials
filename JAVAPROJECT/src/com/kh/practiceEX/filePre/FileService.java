package com.kh.practiceEX.filePre;

import java.io.*;
import java.util.Scanner;

public class FileService {

    // File FileWriter 이용해서 바탕화면에 food.docs 생성하기
    // try- catch

    /**
     * 파일 생성 및 작성하기 메서드
     * void createFile(String content)
     *
     * @param content
     */
    public void createFile(String content) {
        // 사용자 바탕화면 경로 가져오기
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName); //파일경로와 파일명 가져오기

        // try() 안에 FileWriter 나 FileReader BufferedReader 를 작성하면 close 따로 작성 X
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content); //내용 작성하기
            System.out.println("파일이 성공적으로 생성되고, 내용이 작성되었습니다.");
        } catch (Exception e) {
            System.out.println("파일 생성 / 작성 중 오류 발생 : " + e.getMessage());
        }

    }

    // TODO : FileReader BuffedredReader 이용해서 파일 읽기 기능 설정
    public void readFile() {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";
        File file = new File(path + fileName);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("파일 내용:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다: " + fileName);
        }
    }

    /** TODO : 바탕화면에 있는 food.docs 파일에 이어쓰기 기능 설정해서
     * 이어서 음식 작성
     * 줄바꿈 - 햄버거 줄바꿈 - 돈까스 줄바꿈 - 쌀국수 줄바꿈 - 카레
     * File FileWriter
     * FileServiceRun 에서 readFile 한번더 불러와 이어서 잘 작성되었는지 확인
     * classRoom 제출
     */
    /** 파일 이어쓰기 기능 설정
     *  void appendFile(String content)
     *
     */
    public void appendFile() {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";
        File file = new File(path + fileName);

        String content = "\n - 햄버거 \n - 돈까스 \n - 쌀국수 \n - 카레";
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(content);
            System.out.println("내용이 성공적으로 추가되었습니다.");
        } catch (IOException e) {
            System.out.println("파일에 내용을 추가할 수 없습니다: " + fileName);
        }
    }
    }





