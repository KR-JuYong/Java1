package ch05.sec05;

public class EmptyStringExample {
    public static void main(String[] args) {
        //문자열 비교
        String hobby="";
        if(hobby.equals("")){
            System.out.println("hooby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}
