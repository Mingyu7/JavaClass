import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class loginPro extends JFrame {
	// 멤버변수 선언
	JTextField jti;
	JTextField jtp;
	JButton jblogin, jbcancel;
	JLabel jok;

	public loginPro() {
		// 프레임 정보 설정
		setTitle("로그인 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new GridLayout(3, 1));
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JLabel jlID = new JLabel("아이디 :");
		JLabel jlPS = new JLabel("패스워드 :");
		jok = new JLabel("로그인 결과:");
		jti = new JTextField(10);
		jtp = new JTextField(10);

		jblogin = new JButton("로그인");
		jbcancel = new JButton("취소");

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
					jok.setText("로그인 되었습니다");
				else {
					jok.setText("다시 입력해주세요");
				}
			} else if (e.getSource() == jbcancel) {
				jti.setText(" ");
				jtp.setText(" ");
			}

		}

	}
}
