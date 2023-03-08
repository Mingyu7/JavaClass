import java.awt.*;
import javax.swing.*;

public class ColorLayout01 extends JFrame{
	
	public ColorLayout01() {
		setTitle("ColorGridLayout");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout(FlowLayout.LEFT));//왼쪽으로 정렬
		Panel jp1 = new Panel();		
		String[] msg = {"0","1", "2", "3", "4", "5","6", "7", "8", "9"};
		Button[] btn = new Button[msg.length];
		Color[] color= {Color.red,Color.orange,Color.yellow,Color.green,Color.cyan,Color.blue,Color.magenta,Color.gray,Color.pink,Color.lightGray};
		for(int i=0; i<btn.length; i++){

			btn[i]=new Button(msg[i]); // 버튼 생성

			btn[i].setBackground(color[i]); // 색 삽입

			jp1.add(btn[i]);

			}
		
			add(jp1);
			
			pack();
		/*
		JButton jbRed = new JButton("0");
		JButton jbOrange = new JButton("1");
		JButton jbYellow = new JButton("2");
		JButton jbGreen = new JButton("3");
		JButton jbCyan = new JButton("4");
		JButton jbBlue = new JButton("5");
		JButton jbMagenta = new JButton("6");
		JButton jbGray = new JButton("7");
		JButton jbPink = new JButton("8");
		JButton jbLight_Gray = new JButton("9");
		*/
		
				
		
		setVisible(true); //창 만들기
	}
	
	public static void main(String[] args) {
		new ColorLayout01();

	}

	

}
