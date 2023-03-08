import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NumberPro extends JFrame {
	// ������� ����
	JTextField jtt1;
	JButton jbok, jbcancel;
	JLabel jok, jre, ja;
	int Random = (int) (Math.random() * 10) + 1; //1~10���� ����

	public NumberPro() {
		// ������ ���� ����
		setTitle("���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new GridLayout(3, 1));
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		jok = new JLabel("1~10 ������ ���ڸ� �����Ͻÿ�:");
		jtt1 = new JTextField(10);
		jre = new JLabel("���");
		jbok = new JButton("Ȯ��");
		jbcancel = new JButton("����");

		jp1.add(jok);
		jp1.add(jtt1);
		jp2.add(jre);
		jp3.add(jbok);
		jp3.add(jbcancel);

		add(jp1);
		add(jp2);
		add(jp3);

		pack();

		setVisible(true);

		jbok.addActionListener(new MyActionListener());
		jbcancel.addActionListener(new MyActionListener());

	}

	public static void main(String[] args) {
		new NumberPro();

	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == jbok) {
				int a = Integer.parseInt(jtt1.getText());
				if (a == Random)
					jre.setText("�����Դϴ�");
				else if (a >= Random) {
					jre.setText("���ڰ� Ů�ϴ�");
				} else if (a <= Random) {
					jre.setText("���ڰ� �۽��ϴ�");
				}
			} else if (e.getSource() == jbcancel) {
				dispose();// ������ ����
			}

		}

	}
}
