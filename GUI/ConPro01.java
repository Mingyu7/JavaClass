import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConPro01 extends JFrame {
	// ������� ����
	JTextField jtfC;
	JTextField jtfF;
	JButton jbChangeC, jbChangeF;

	public ConPro01() {
		// ������ ���� ����
		setTitle("�µ���ȯ��1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new GridLayout(3, 1));
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JLabel jlC = new JLabel("�����µ�(C):");
		JLabel jlF = new JLabel("ȭ���µ�(F):");
		jtfC = new JTextField(10);
		jtfF = new JTextField(10);
		jbChangeC = new JButton("��ȯ C->F");
		jbChangeF = new JButton("��ȯ F->C");

		jp1.add(jlC);
		jp1.add(jtfC);
		jp2.add(jbChangeF);
		jp2.add(jbChangeC);
		jp3.add(jlF);
		jp3.add(jtfF);

		add(jp1);
		add(jp2);
		add(jp3);

		pack();

		setVisible(true);

		jbChangeC.addActionListener(new MyActionListener());
		jbChangeF.addActionListener(new MyActionListener());
		/*
		 * jbChangeC.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { //jtfC �ؽ�Ʈ�� double��
		 * ��ȯ�� �������� ȭ���� ��ȯ double c = Double.parseDouble(jtfC.getText()); double result
		 * = (c*1.8)+32; jtfF.setText(String.format("%.2f",result)); //�Ҽ������� ��Ÿ����
		 * 
		 * } });
		 * 
		 * jbChangeF.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { double f =
		 * Double.parseDouble(jtfC.getText()); double result = (f-32)/1.8;
		 * jtfF.setText(String.format("%.2f",result));
		 * 
		 * } });
		 */
	}

	public static void main(String[] args) {
		new ConPro01();

	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jbChangeC) {
				double c = Double.parseDouble(jtfC.getText());
				double result = (c * 1.8) + 32;
				jtfF.setText(String.format("%.2f", result));
			} else if (e.getSource() == jbChangeF) {
				double f = Double.parseDouble(jtfC.getText());
				double result = (f - 32) / 1.8;
				jtfF.setText(String.format("%.2f", result));
			}

		}

	}
}
