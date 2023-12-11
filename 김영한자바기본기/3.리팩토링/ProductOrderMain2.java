package ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();
        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.println("상품명 : ");
            String name = sc.nextLine();
            System.out.println("가격 : ");
            int price = sc.nextInt();
            System.out.println("수량 : ");
            int quantity = sc.nextInt();;
            sc.nextLine();
            orders[i]=cearteorder(name,price,quantity);
        }
        printOrders(orders);
    }
    static ProductOrder cearteorder(String productName,int price,int quantity){
        ProductOrder order = new ProductOrder();
        order.productName=productName;
        order.price=price;
        order.quantity=quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        int totalAmount =0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: "+totalAmount);

    }
}
