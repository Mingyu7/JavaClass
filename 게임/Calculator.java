import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) throws Exception {
      int num1, num2; //num1,num2 ���� ����
      int ca, sum; //ca������ ��ȣ �Էº���, sum �� ����
      String sw = "";
      Scanner sc = new Scanner(System.in);
      System.out.println("******** ���� ���� ********");

      try {
         while (true) {
            System.out.print("����� �Ϸ��� y, ��������n�� �����ÿ�->");
            sw = sc.next();
            if (sw.equals("n"))
               break;
            System.out.print("���� 1�Է�->");
            num1 = sc.nextInt();
            System.out.print("���� 2�Է�->");
            num2 = sc.nextInt();
            System.out.print("������ �Է�(1:+, 2:-, 3:*, 4:/)->");
            ca = sc.nextInt();

            switch (ca) {
            case 1:
               sum = num1 + num2;
               System.out.println("�����->" + sum);
               break;
            case 2:
               sum = num1 - num2;
               System.out.println("�����->" + sum);
               break;
            case 3:
               sum = num1 * num2;
               System.out.println("�����->" + sum);
               break;
            case 4:
               sum = num1 / num2;
               System.out.println("�����->" + sum);
               break;

            }
         }

      } catch (ArithmeticException e) {
         System.out.println("0���� ������ �����ϴ�");
      }

   }

}