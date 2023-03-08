import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) throws Exception {
      int num1, num2; //num1,num2 숫자 변수
      int ca, sum; //ca연산자 번호 입력변수, sum 합 변수
      String sw = "";
      Scanner sc = new Scanner(System.in);
      System.out.println("******** 숫자 계산기 ********");

      try {
         while (true) {
            System.out.print("계산을 하려면 y, 끝내려면n을 누르시오->");
            sw = sc.next();
            if (sw.equals("n"))
               break;
            System.out.print("숫자 1입력->");
            num1 = sc.nextInt();
            System.out.print("숫자 2입력->");
            num2 = sc.nextInt();
            System.out.print("연산자 입력(1:+, 2:-, 3:*, 4:/)->");
            ca = sc.nextInt();

            switch (ca) {
            case 1:
               sum = num1 + num2;
               System.out.println("계산결과->" + sum);
               break;
            case 2:
               sum = num1 - num2;
               System.out.println("계산결과->" + sum);
               break;
            case 3:
               sum = num1 * num2;
               System.out.println("계산결과->" + sum);
               break;
            case 4:
               sum = num1 / num2;
               System.out.println("계산결과->" + sum);
               break;

            }
         }

      } catch (ArithmeticException e) {
         System.out.println("0으로 나눌수 없습니다");
      }

   }

}