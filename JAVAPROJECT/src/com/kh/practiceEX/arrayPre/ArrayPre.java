package com.kh.practiceEX.arrayPre;

import java.util.Arrays;

public class ArrayPre {

    // 1. 주어진 정수 배열에서 가장 큰 숫자를 찾아서 출력하기
    public void maxValue(){
        // 정수가 들어있는 배열
        int[] numbers = {12, 45, 3, 22, 78, 10};

        /*  for(int i = 1 이 0이 아니라 1로 시작하는 이유
            int max = numbers[0]; 에서 number[0] 0번 째 자리에 최대값을 저장한다 설정했기 때문
            첫 번째 자리 값은 이미 최대값 후보자리 선정
            첫 번째 자리값과 두 번째 자리값이 비교를 진행해서
            두 번째 자리값이 첫 번째 자리값보다 크다면 두 번째 자리값을 첫 번째 자리값에 넣어줌
        * */
        // 배열에서 최대값을 찾아 출력
        int max = numbers[0]; // 찾은 최대값을 가져올 변수명 설정 int 이기 때문에 최초숫자는 0
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){ // 만약에 비교할 숫자가 max 에 들어있는 최대값보다 크다면
                max = numbers[i]; // 최대값을 현재 비교하고 있는 숫자로 교체하기

            }
        }//for 문은 결과를 찾기 위한 과정이기 때문에 for 문이 종료된 다음에 결과를 출력
        System.out.println("최대값 : "+max);
    }

    // 2. 문자열 배열에서 특정 문자열 찾기 cherry 라는 단어가 어디에 위치했는지 찾아보기
    public void findString(){
        String[] words ={"apple","banana","cherry","date","melon"};
        String target = "cherry";
        // TODO : 특정 문자의 위치를 찾고 출력하는 for 문 완성

        for(int i = 0; i < words.length; i++){ // 특정 위치 찾기 for문
            if(words[i].equals(target)){
                System.out.println("찾는 문자열 ["+target+"] 은 배열의 "+i+"번째 위치해있습니다");
                break;
            }

        }

    }

    // 3. 배열에서 특정 숫자 교체하기
    public void replaceArrayNumber(){
        // 입력 배열
        int[] numbers = {10, 20, 30, 20, 40, 20, 320};
        int target = 20;
        int replacenumber = 99;

        // for문으로 배열을 순회해서 만약에 교체할 숫자랑 배열에 들어있는 숫자가
        // 일치하다면 99로 교체
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                numbers[i] = replacenumber;

            }
        }
        // 교체한다음 교체를 제대로 했는지 출력
        System.out.print("교체 후 배열 : ");
        for(int num : numbers){
            System.out.print(num+" ");
        }
        System.out.println();
    }



    // 4. 배열에서 특정 문자열 교체하기

    public void replaceArrayString(){
        String[] words = {"apple","banana","cherry","banana","date"};
        String target = "banana";
        String replacenumber = "mango";
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(target)){
                words[i] = replacenumber;
            }
        }
        System.out.print("교체 후 배열 : ");
        for(String word : words){
            System.out.print(word+" ");
        }

        System.out.println();
    }

    // 5. 이중 배열 값 출력하기
    public void print2DArray(){
        int[][] numbers ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        // 배열 출력
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
                //i 0번부터 j = 0,1,2 자리를 순차적으로 순회한다음
                //i 2번 자리까지 모두 순회한 결과 표기
            }
        }
        System.out.println(); // 모두 출력한다음 줄바꿈 처리
    }

    // 6. 특정 숫자값의 위치 찾기

    public void find2DArray(){
        int[][] numbers = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        int target = 50;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(numbers[i][j] == target){
                    System.out.println("숫자"+ target +"은 ["+i+"]["+j+"] 위치에 존재합니다.");
                }
            }
        }


    }
    public void findStringIn2DArray(){
        String [][] animals =  {{"cat", "dog", "fish"},
                             {"parrot", "hamster", "rabbit"},
                                {"turtle", "snake", "lizard"}
    };
        String target = "rabbit";

        for(int i = 0; i < animals.length; i++){
        for(int j = 0; j < animals[i].length; j++){
        if(animals[i][j].equals(target)){
        System.out.print(animals[i][j]+" ");
        }
        }
        }
        for(int i = 0; i < animals.length; i++){
            for(int j = 0; j < animals[i].length; j++){
                if(animals[i][j].equals(target)){
                    System.out.println("찾는 문자열 ["+target+"] 은 배열의 "+i+","+j+"번째 위치해있습니다");
                    break;
                }

            }
        }



    }


    public void replaceStringIn2DArray(){
        String [][] colors = { {"red", "blue", "green"}, {"yellow", "blue", "purple"},{"pink", "blue", "orange"} };
        String target = "blue";
        String replacecolor = "cyan";

        // 문자열 target -> replace 교체
        for(int i = 0; i < colors.length; i++){ // 값을 꺼내기 1단계
            for(int j = 0; j < colors[i].length; j++){ // 1단계에서 찾을 값 꺼내기
                if(colors[i][j].equals(target)){ // 만약에 target
                    colors[i][j] = replacecolor;
                }
            }
            System.out.print("교체 후 배열 : ");

            //

        }

    }

    public void lunchMenuArray(){
        
        String[] lunchMenu ={"김치찌개","된장찌개","삼겹살","초밥","치킨","햄버거"};
        System.out.print(Arrays.toString(lunchMenu));
        System.out.println();
    }
    public void lunchMenu2DArray(){
        String[][] lunchMenu = {{"김치찌개","된짱찌개","불고기"},
                {"햄버거","피자","파스타"},
                {"짜장면","짬뽕","탕수육"},
                {"초밥","라멘","돈카츠"}};
        System.out.print(Arrays.toString(lunchMenu));
        System.out.print(Arrays.deepToString(lunchMenu));
        System.out.println();
    }

    // main 메서드
    public static void main(String[] args) {
        ArrayPre arrayPre = new ArrayPre(); // ArrayPre 내부에 있는 기능 사용
        arrayPre.maxValue();
        arrayPre.findString();
        arrayPre.replaceArrayNumber();
        arrayPre.replaceArrayString();
        arrayPre.print2DArray();
        arrayPre.find2DArray();
        arrayPre.findStringIn2DArray();
        arrayPre.replaceStringIn2DArray();
        arrayPre.lunchMenuArray();
        arrayPre.lunchMenu2DArray();
    }
}
