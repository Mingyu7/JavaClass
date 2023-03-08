import java.awt.*;
import javax.swing.*;

public class SwingPro03 extends JFrame {

	public SwingPro03() {
		setTitle("스윙 프레임 테스트3");
		setSize(500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane(); // 컨테이너 불러오기 *import java.awt.Container*필수
		c.setBackground(Color.DARK_GRAY);
		
		//BorderLayout 레이아웃 생성 5*5간격 지정
		setLayout(new BorderLayout(5,5));
		//각자 버튼 생성
		JButton jbAdd = new JButton("더하기");
		JButton jbSub = new JButton("빼기");
		JButton jbMul = new JButton("곱하기");
		JButton jbDiv = new JButton("나누기");
		JButton jbMod = new JButton("나머지");
		//버튼을 동서남북으로 정렬 
		add(jbAdd, BorderLayout.NORTH);
		add(jbSub, BorderLayout.SOUTH);
		add(jbMul, BorderLayout.WEST);
		add(jbDiv, BorderLayout.CENTER);
		add(jbMod, BorderLayout.EAST);
		

		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingPro03();

	}

}
