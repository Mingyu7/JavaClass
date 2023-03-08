import java.awt.*;
import javax.swing.*;

public class SwingPro02 extends JFrame {

	public SwingPro02() {
		setTitle("스윙 프레임 테스트2");
		setSize(500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane(); // 컨테이너 불러오기 *import java.awt.Container*필수
		c.setBackground(Color.blue);
		
		//레이아웃 (CENTER)중간정렬 수평간격:20 수직간격:20
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//각자 버튼 생성
		JButton jbAdd = new JButton("더하기");
		JButton jbSub = new JButton("빼기");
		JButton jbMul = new JButton("곱하기");
		JButton jbDiv = new JButton("나누기");
		JButton jbMod = new JButton("나머지");
		//add 순서대로 레이아웃에 정렬
		add(jbAdd);
		add(jbSub);
		add(jbMul);
		add(jbDiv);
		add(jbMod);
		

		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingPro02();

	}

}
