import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingPro01 extends JFrame {
	
	public SwingPro01() {
		setTitle("���� ������ �׽�Ʈ1");
		setSize(300,300); // ������ ũ�� 300x300
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container c = getContentPane(); //�����̳� �ҷ����� *import java.awt.Container*�ʼ�
		c.setBackground(Color.PINK); //�����̳� ��׶��忡 �÷� ����
		//c.setLayout(new FlowLayout()); //���̾ƿ� ���� 
		
		setLayout(new FlowLayout()); //�����̳� ��������
		
		
		JButton jb1 = new JButton("Ŭ���ϼ���"); //��ư�� "Ŭ���ϼ���" ����
		add(jb1); 						  // �����̳ʿ� ��ư ���� c. ��������
		
		//setBackground(Color.CYAN); 
		
		setVisible( true); // ������ ���
	}

	public static void main(String[] args) {
		SwingPro01 sp = new SwingPro01(); //�ٽ� ����ҷ��� �̷���
		//���ҷ���  new SwingPro01(); <- ������� �������� �׳� �տ� ��ü ���� ����

	}

}
