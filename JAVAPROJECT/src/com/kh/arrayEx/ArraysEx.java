package com.kh.arrayEx;

import java.util.Arrays;

/*
* Arrays 클래스는 java에서 배열을 다룰 때 유용한 다양한 기능을 제공
*
* 기능들
* toString(배열이 들어있는 변수명)                            1차원 배열은 값이 출력 이외 주소값 출력
* deepToString(2차원 배열이 들어있는 변수명)                  2차원 이상만 사용 가능
* sort(오름차순으로 정렬할 변수명)                            오름차순 정렬
* fill(배열 내 값을 동일한 값으로 변경할 변수명 , 숫자)       모든 요소(값) 동일한 값으로 채움
* copyOf(길이를 변경할 변수명 , 숫자)                         배열을 복사하고, 지정된 길이에 맞게 크기를 변경
* equals(비교1변수명, 비교2변수명)                            두 배열이 동일한지 비교
* deepEquals(2차원이상의 배열 비교1변수명 , 2차원이상의 배열 비교2변수명) 2차원 이상의 두 배열이 같은지 비교
* */
public class ArraysEx {
    public void arr1DMethod(){
        int[] arr1 = {5,2,8,3,1};

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        // arr1 모든 값을 오름차순 정렬
        Arrays.sort(arr1); // 결과 확인이 아니라
        // 오름차순으로 정렬이 안되있는 arr1 정렬 시키기 기능
        System.out.println(Arrays.toString(arr1));
        // 오름차순으로 arr1이 제대로 정렬됐는지 확인

        // arr1 모든 값을 7로 채우기
        Arrays.fill(arr1,7);
        System.out.println(Arrays.toString(arr1));

        boolean a = Arrays.equals(arr1,new int[]{5,2,8,3,1}); // 같은지 비교
        System.out.println(a); // 비교에 대한 결과를 출력
    }
    public static void main(String[] args) {
        ArraysEx arraysEx = new ArraysEx();
        // ArraysEX 객체에 작성된 기능 중 실행하고자 하는 기능명 작성
        // arraysEx.기능명칭()
        arraysEx.arr1DMethod();
    }
}
