package sss;

import java.util.Random;
import java.util.Scanner;
public class Kwm20220778_mid1 {
       public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("## 가위 바위 보 게임 ##");
             System.out.println("( 1.주먹 2.가위  3.보)");
             System.out.print("숫자을 입력하세요 :");
             int com = 0;
             int user = sc.nextInt();
             Random r =new Random();
 
             com = r.nextInt(3)+1; 
  // r.nextInt(3)은 0~2 에 숫자 중 램덤하게 나오기 때문에 +1 을 해서 1~3에 수가 나올수있게함  
             
  System.out.println("유저 "+user);
             System.out.println("컴퓨터"+com);
             
             if(user == 1) {
                    if(com == 2) {
                           System.out.println("승리");
                    }
                    else if(com == 3) {
                           System.out.println("패배");
                    }
                    else {
                           System.out.println("무승부");
                    }
             }
             else if(user == 2) {
                    if(com == 2) {
                           System.out.println("무승부");
                    }
                    else if(com == 3) {
                           System.out.println("승리");
                    }
                    else {
                           System.out.println("패배");
                    }
             }
             else if(user == 3) {
                    if(com == 2) {
                           System.out.println("패배");
                    }
                    else if(com == 3) {
                           System.out.println("무승부");
                    }
                    else {
                           System.out.println("승리");
                    }
             }
             else {
                    System.out.println("다시 입력 해주세요!!");
             }
             
             sc.close();
       }
}