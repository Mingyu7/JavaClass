import java.awt.*;
import javax.swing.*;

public class SwingPro05 extends JFrame {

	public SwingPro05() {
		setTitle("BoxLayout �׽�Ʈ");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane(); // �����̳� �ҷ����� *import java.awt.Container*�ʼ�
		c.setBackground(Color.DARK_GRAY);
		
		//GridLayout ���̾ƿ� ���� 3*2���� ����
		setLayout(new BoxLayout(c,BoxLayout.Y_AXIS)); //BoxLayout Y�������� �״´�
		//���� ��ư ����
		JButton jbAdd = new JButton("���ϱ�");
		JButton jbSub = new JButton("����");
		JButton jbMul = new JButton("���ϱ�");
		JButton jbDiv = new JButton("������");
		JButton jbMod = new JButton("������");
		
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


