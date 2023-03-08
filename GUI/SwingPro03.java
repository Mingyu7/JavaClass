import java.awt.*;
import javax.swing.*;

public class SwingPro03 extends JFrame {

	public SwingPro03() {
		setTitle("���� ������ �׽�Ʈ3");
		setSize(500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane(); // �����̳� �ҷ����� *import java.awt.Container*�ʼ�
		c.setBackground(Color.DARK_GRAY);
		
		//BorderLayout ���̾ƿ� ���� 5*5���� ����
		setLayout(new BorderLayout(5,5));
		//���� ��ư ����
		JButton jbAdd = new JButton("���ϱ�");
		JButton jbSub = new JButton("����");
		JButton jbMul = new JButton("���ϱ�");
		JButton jbDiv = new JButton("������");
		JButton jbMod = new JButton("������");
		//��ư�� ������������ ���� 
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
