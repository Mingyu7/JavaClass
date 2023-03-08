import java.util.Stack;

public class StackPro {

   public static void main(String[] args) {
      Stack<Integer> myIntStack =new Stack<>();
      myIntStack.push(1);
      myIntStack.push(2);
      myIntStack.push(3);
      myIntStack.push(4);
      
      while(!myIntStack.isEmpty()) {
         System.out.println(myIntStack.pop());
         
      }
      
      Stack<String>myStringStack =new Stack<>();
      myStringStack.add("���");
      myStringStack.add("��");
      myStringStack.add("�ٳ���");
      myStringStack.add("����");
      
      while(!myStringStack.isEmpty()) {
         System.out.println(myStringStack.pop());
      }
   }

}
