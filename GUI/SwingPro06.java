import java.awt.*;
import javax.swing.*;

public class SwingPro06 extends JFrame {

	public SwingPro06() {
		setTitle("BoxLayout �׽�Ʈ");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane(); // �����̳� �ҷ����� *import java.awt.Container*�ʼ�
		c.setBackground(Color.DARK_GRAY);
		
		c.setLayout(null);
		
		for(int i=1;i<=5;i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setSize(50,20); 			//��ư������ 50*20
			b.setLocation(i*15,i*15);   //��ư ��ġ i*15�� �ݺ� (i=1~5)
			add(b);
		}
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingPro06();

	}

}


