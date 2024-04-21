package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 하나의 메소드는 한 가지 책임만 가지도록 구현
 * 인덴트는 1단게로 유지
 * 최대한 else는 지양
 */

 // 요구사항 
 // 1) 쉼표 또는 콜른을 구분자로 가지는 문자열을 전달할 경우 각 문자열 기준으로 수분한 숫자의 합으로 반환
 // 2) 쉼표 및 콜론 외에 커스텀 구분자를 받아들일 수 있어야함
 //    - 커스텀구분자는 //\n 사이에 있는 문자임
 // 3) 음수롤 전달하는 경우 RuntimeException 처리

 // 
public class StringCalculator  {
    int add(String text) throws Exception{
        int sum = 0;
        String[] arr = {"," ,":"};
        List<String> deviderList = new ArrayList<>(Arrays.asList(arr));
        
        if(text == null || text.isEmpty()) return sum;
        if(haveCustomDivider(text)) deviderList.add(devider(text));
        String pattern = splitPattern(deviderList);
        String[] splitList =  text.split(pattern);
        for(String num : splitList){
            sum +=  returnPostiveNumber(num);
        }
        return sum;
    }

    //구분자 포함여부 확인
    boolean haveCustomDivider(String text){
        boolean haveCustomDivider = false;
        if(text.contains("//") && text.contains("\n")) haveCustomDivider = true;
        return haveCustomDivider;
    }

    // 커스텀 구분자 찾는 패턴
    String devider(String text){
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if(m.find()){
            return m.group(1);
        }
        return null;
    }

    // 커스텀 구분자를 포함한 스플릿 패턴 찾기
    String splitPattern(List<String> deviderList){
        String splitPattern = "";
        for(String arrChar : deviderList){
            splitPattern += arrChar+"|";
        }
        return splitPattern.substring(0,splitPattern.length()-1);
    }

     //3)번 요건 음수가 있을 경우 런타임익셉션
    int returnPostiveNumber(String num){
        int number = Integer.parseInt(num);
        if(number<0) throw new RuntimeException();
        return number;
    }

}
