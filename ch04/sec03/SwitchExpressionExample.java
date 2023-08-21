package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        //Switch문
        char grade ='B';

        switch(grade){
            case 'A', 'a'-> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b'->{
                System.out.println("일반 회원입니다.");
            }
            default->{
                System.out.println("손님입니다.");
            }
                
        }
        //switch문에서 중괄호 안에 실행문이 하나만 있을 경우네는 중괄호를 생략할 수 있다.
        //단 default가 반드시 존재해야 한다.
        switch(grade){
            case 'A', 'a' ->System.out.println("우수 회원입니다.");
            case 'B', 'b' ->System.out.println("일반 회원입니다.");
            default ->System.out.println("손님입니다.");
        
        }
    }
}