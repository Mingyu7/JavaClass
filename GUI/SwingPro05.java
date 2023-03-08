import java.awt.*;
import javax.swing.*;

public class SwingPro05 extends JFrame {

	public SwingPro05() {
		setTitle("BoxLayout 테스트");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane(); // 컨테이너 불러오기 *import java.awt.Container*필수
		c.setBackground(Color.DARK_GRAY);
		
		//GridLayout 레이아웃 생성 3*2간격 지정
		setLayout(new BoxLayout(c,BoxLayout.Y_AXIS)); //BoxLayout Y방향으로 쌓는다
		//각자 버튼 생성
		JButton jbAdd = new JButton("더하기");
		JButton jbSub = new JButton("빼기");
		JButton jbMul = new JButton("곱하기");
		JButton jbDiv = new JButton("나누기");
		JButton jbMod = new JButton("나머지");
		
		jbAdd.setAlignmentX(CENTER_ALIGNMENT);
		jbSub.setAlignmentX(CENTER_ALIGNMENT);
		jbMul.setAlignmentX(CENTER_ALIGNMENT);
		jbDiv.setAlignmentX(CENTER_ALIGNMENT);
		jbMod.setAlignmentX(CENTER_ALIGNMENT);
		
		add(jbAdd);
		add(jbSub);
		add(jbMul);
		add(jbDiv);
		add(jbMod);
		
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingPro05();

	}

}


