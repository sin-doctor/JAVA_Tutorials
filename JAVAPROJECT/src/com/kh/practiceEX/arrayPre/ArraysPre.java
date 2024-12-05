package com.kh.practiceEX.arrayPre;

import java.util.Arrays;

public class ArraysPre {

    public void int1DArray() {
        int[] arr1 = {10, 300, 20, 50, 7000, 9999};
        int[] arr2 = {10, 300, 20, 50, 7000, 9999};

        // 1. Arrays.toString을 이용해서 arr1과 arr2 출력
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        // 2. arr1 오름차순 정렬
        Arrays.sort(arr1);
        System.out.println("arr1 sorted: " + Arrays.toString(arr1));

        // 3. arr1 안의 모든 값을 500으로 변경
        Arrays.fill(arr1, 500);
        System.out.println("arr1 filled: " + Arrays.toString(arr1));

        // 4. arr1과 arr2의 값이 모두 같은지 비교하고 비교한 결과 출력
        boolean a = Arrays.equals(arr1, arr2);
        System.out.println("arr1 and arr2 are equal: " + a);
    }


    public void string1DArray() {
        String[] arr1 = {"apple", "banana", "cherry", "date", "elderberry"};
        String[] arr2 = {"apple", "banana", "cherry", "date", "elderberry"};

        // 초기 배열 출력
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        // arr1 정렬
        Arrays.sort(arr1);
        System.out.println("Sorted arr1: " + Arrays.toString(arr1));

        // arr1의 모든 요소를 "mango"로 변경
        Arrays.fill(arr1, "mango");
        System.out.println("Filled arr1: " + Arrays.toString(arr1));

        // arr1과 arr2 비교
        boolean a = Arrays.equals(arr1, arr2);
        System.out.println("arr1 and arr2 are equal: " + a);
    }

    public static void main(String[] args) {
        ArraysPre arraysPre = new ArraysPre();
        arraysPre.int1DArray();
        arraysPre.string1DArray();
    }
}
