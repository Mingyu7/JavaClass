import java.awt.*;
import javax.swing.*;

public class SwingPro04 extends JFrame {

	public SwingPro04() {
		setTitle("GridLayout �׽�Ʈ");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane(); // �����̳� �ҷ����� *import java.awt.Container*�ʼ�
		c.setBackground(Color.DARK_GRAY);
		
		//GridLayout ���̾ƿ� ���� 3�� 2�� (����3,����2) ����
		setLayout(new GridLayout(3,2)); 
		//���� ��ư ����
		JButton jbAdd = new JButton("���ϱ�");
		JButton jbSub = new JButton("����");
		JButton jbMul = new JButton("���ϱ�");
		JButton jbDiv = new JButton("������");
		JButton jbMod = new JButton("������");
		
		add(jbAdd);
		add(jbSub);
		add(jbMul);
		add(jbDiv);
		add(jbMod);
		

		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingPro04();

	}

}
