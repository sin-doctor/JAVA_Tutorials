package com.kh.practiceEX.oopArrayPre;

import java.util.Scanner;

public class ProductServiceRun {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        /*
        // 제품 설명과 카테고리는 입력유무 물어본 후 yes로 입력하면
        // 제품설명과 카테고리 작성 후 저장
        // no 입력하면 제품명과 가격만 저장
        // p1 제품 추가
        Product p1 = new Product("스마트폰",100000);
        p1.setDescription("최신 스마트폰입니다. 12/14 출고예정");
        p1.setCategory("전자기기");

        Product p2 = new Product("노트북",1500000);
        if (p2.getDescription() == null){
            p2.setDescription("없음");
        }
        if (p2.getCategory() == null){
            p2.setCategory("없음");
        }
        // p2에서 제품설명이 null 값일 경우 없음으로 저장
        // p2에서 카테고리가 이 null 값일 경우 없음으로 저장

        productService.addProduct(p1);
        productService.addProduct(p2);

        // 제품목록 보기
        productService.viewProducts();

        // 제품명으로 제품검색
        // searchProduct 기능이 void가 아닌 return 값이 Product 이기 때문에 Product 자료형으로 변수명 설정

        productService.sp("노트북");
        if(productService.searchProduct("노트북") != null){
            System.out.println("검색된 제품 : " + sp);
        }else{
            System.out.println("해당 이름에 제품을 찾을 수 없습니다.");
        }

         */
        // 제품명 가격 입력받기

        // 제품 설명과 카테고리는 입력유무 물어본 후 yes로 입력하면
        // 제품 설명과 카테고리 작성 후 저장
        // no 입력하면 제품명과 가격만 저장
        // 제품 정보를 저장할 Product 객체 생성
        System.out.print("제품명을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("제품 가격을 입력하세요: ");
        int price = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        Product product = new Product(name, price);

        // 제품 설명과 카테고리 입력 여부 확인
        System.out.print("제품 설명과 카테고리를 추가하시겠습니까? (yes/no): ");
        String addDetails = sc.nextLine().trim().toLowerCase();

        if (addDetails.equals("yes")) {
            // 제품 설명과 카테고리 입력받기
            System.out.print("제품 설명을 입력하세요: ");
            product.setDescription(sc.nextLine());

            System.out.print("제품 카테고리를 입력하세요: ");
            product.setCategory(sc.nextLine());

            System.out.println("제품 정보가 저장되었습니다!");
        } else {
            System.out.println("제품명과 가격만 저장되었습니다!");
        }

        // 저장된 제품 정보 출력
        System.out.println("\n저장된 제품 정보:");
        System.out.println(product.toString());

        sc.close();
    }
}

