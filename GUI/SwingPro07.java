import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingPro07 extends JFrame{
	
	public SwingPro07() {
		setTitle("Panel_01 �׽�Ʈ");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new GridLayout(2,1));
		JPanel jp1 = new JPanel(); //�гλ���
		JPanel jp2 = new JPanel(new GridLayout(2,1)); //�гξȿ� �׸������
		
		JButton jbAdd = new JButton("���ϱ�");
		JButton jbSub = new JButton("����");
		JButton jbMul = new JButton("���ϱ�");
		JButton jbDiv = new JButton("������");
		JButton jbMod = new JButton("������");
		//�г� 1���� ���ϱ�,����,���ϱ⸸ �ֱ�
		jp1.add(jbAdd);
		jp1.add(jbSub);
		jp1.add(jbMul);
		//�г� 2(�׸���)���� ������,������ �ֱ�
		jp2.add(jbDiv);
		jp2.add(jbMod);
		
		add(jp1);
		add(jp2);

		setVisible(true); //â �����
	}



	public static void main(String[] args) {
		new SwingPro07();

	}

}
