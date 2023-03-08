import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingPro07 extends JFrame{
	
	public SwingPro07() {
		setTitle("Panel_01 테스트");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new GridLayout(2,1));
		JPanel jp1 = new JPanel(); //패널생성
		JPanel jp2 = new JPanel(new GridLayout(2,1)); //패널안에 그리드생성
		
		JButton jbAdd = new JButton("더하기");
		JButton jbSub = new JButton("빼기");
		JButton jbMul = new JButton("곱하기");
		JButton jbDiv = new JButton("나누기");
		JButton jbMod = new JButton("나머지");
		//패널 1에는 더하기,빼기,곱하기만 넣기
		jp1.add(jbAdd);
		jp1.add(jbSub);
		jp1.add(jbMul);
		//패널 2(그리드)에는 나누기,나머지 넣기
		jp2.add(jbDiv);
		jp2.add(jbMod);
		
		add(jp1);
		add(jp2);

		setVisible(true); //창 만들기
	}



	public static void main(String[] args) {
		new SwingPro07();

	}

}
