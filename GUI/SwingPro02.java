import java.awt.*;
import javax.swing.*;

public class SwingPro02 extends JFrame {

	public SwingPro02() {
		setTitle("���� ������ �׽�Ʈ2");
		setSize(500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane(); // �����̳� �ҷ����� *import java.awt.Container*�ʼ�
		c.setBackground(Color.blue);
		
		//���̾ƿ� (CENTER)�߰����� ���򰣰�:20 ��������:20
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//���� ��ư ����
		JButton jbAdd = new JButton("���ϱ�");
		JButton jbSub = new JButton("����");
		JButton jbMul = new JButton("���ϱ�");
		JButton jbDiv = new JButton("������");
		JButton jbMod = new JButton("������");
		//add ������� ���̾ƿ��� ����
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
