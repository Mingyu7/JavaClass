import java.awt.*;
import javax.swing.*;

public class SwingPro06 extends JFrame {

	public SwingPro06() {
		setTitle("BoxLayout 테스트");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane(); // 컨테이너 불러오기 *import java.awt.Container*필수
		c.setBackground(Color.DARK_GRAY);
		
		c.setLayout(null);
		
		for(int i=1;i<=5;i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setSize(50,20); 			//버튼사이즈 50*20
			b.setLocation(i*15,i*15);   //버튼 위치 i*15로 반복 (i=1~5)
			add(b);
		}
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingPro06();

	}

}


