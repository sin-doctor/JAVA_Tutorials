package com.kh.conditionEx;

public class CondotionSwitchPre {

    /*
    * 사용자가 입력한 숫자에 따라 해당 숫자가 어떤 요일인지 출력하는 프로그램
    * 1부터 7까지의 숫자를 입력받아 switch문을 사용햇 요일 출력
    *
    * */
    public void choiceDay(int choice) {
        String result;

        switch (choice){
            case 1:
                result = "월";
                break;
                case 2:
                    result = "화";
                    break;
                    case 3:
                        result = "수";
                        break;
            case 4:
                result = "목";
                break;
                case 5:
                    result = "금";
                    break;
                    case 6:
                        result = "토";
                        break;
            case 7:
                result = "일";
                break;
                default:
                    result = "잘못된";
        }
        System.out.println("["+result+"]요일입니다");
    }
}
