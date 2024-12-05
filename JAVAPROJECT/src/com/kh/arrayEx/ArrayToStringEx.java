package com.kh.arrayEx;

import java.util.Arrays;

/*
次元 (= Dimension , 차원)
次 = 다음 차 차례, 차선 과 같이 다음 단계 순서로 쓰임
元 = 시작 원 원조, 원상태로 와 같이 기본적인 단위 시작이라는 의미로 사용
* 1D = 1Dimension 1차원 선
* 2D = 2Dimension 2차원 평면
* 3D = 3Dimension 3차원 공간
* */
public class ArrayToStringEx {

    public void toString1DMethod(){
        int[] numbers = {1,2,3,4,5};
        System.out.println("numbers[0] : " + numbers[0]);
        System.out.println("numbers[1] : " + numbers[1]);
        System.out.println("numbers[2] : " + numbers[2]);
        System.out.println("numbers[3] : " + numbers[3]);
        System.out.println("numbers[4] : " + numbers[4]);

        System.out.println("Arrays.toString(numbers)"+Arrays.toString(numbers));
       // System.out.println("Arrays.deeptoString(numbers)"+Arrays.deepToString(numbers));
        //

    }

    public void toString2DMethod(){
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        // 각 행에 값들이 존재하기 때문에 행열의 위치 주소결과가 출력 [ = 1차원 배열] [[ = 2차원 배열 I = int
        System.out.println("numbers[0] : " + numbers[0]);
        System.out.println("numbers[1] : " + numbers[1]);
        System.out.println("numbers[2] : " + numbers[2]);
    }

    public static void main(String[] args) {
        ArrayToStringEx atse = new ArrayToStringEx();
        atse.toString1DMethod();
        atse.toString2DMethod();
    }
}
