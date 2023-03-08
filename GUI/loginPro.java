import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class loginPro extends JFrame {
	// ������� ����
	JTextField jti;
	JTextField jtp;
	JButton jblogin, jbcancel;
	JLabel jok;

	public loginPro() {
		// ������ ���� ����
		setTitle("�α��� ȭ��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new GridLayout(3, 1));
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JLabel jlID = new JLabel("���̵� :");
		JLabel jlPS = new JLabel("�н����� :");
		jok = new JLabel("�α��� ���:");
		jti = new JTextField(10);
		jtp = new JTextField(10);

		jblogin = new JButton("�α���");
		jbcancel = new JButton("���");

		jp1.add(jlID);
		jp1.add(jti);
		jp1.add(jlPS);
		jp1.add(jtp);
		jp2.add(jblogin);
		jp2.add(jbcancel);
		jp3.add(jok);

		add(jp1);
		add(jp2);
		add(jp3);

		pack();

		setVisible(true);

		jblogin.addActionListener(new MyActionListener());
		jbcancel.addActionListener(new MyActionListener());

	}

	public static void main(String[] args) {
		new loginPro();

	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jblogin) {
				if (jti.getText().equals("admin") && jtp.getText().equals("1234"))
					jok.setText("�α��� �Ǿ����ϴ�");
				else {
					jok.setText("�ٽ� �Է����ּ���");
				}
			} else if (e.getSource() == jbcancel) {
				jti.setText(" ");
				jtp.setText(" ");
			}

		}

	}
}
