import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NumberPro extends JFrame {
	// 멤버변수 선언
	JTextField jtt1;
	JButton jbok, jbcancel;
	JLabel jok, jre, ja;
	int Random = (int) (Math.random() * 10) + 1; //1~10까지 랜덤

	public NumberPro() {
		// 프레임 정보 설정
		setTitle("숫자 게임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new GridLayout(3, 1));
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		jok = new JLabel("1~10 사이의 숫자를 추측하시오:");
		jtt1 = new JTextField(10);
		jre = new JLabel("결과");
		jbok = new JButton("확인");
		jbcancel = new JButton("종료");

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
					jre.setText("정답입니다");
				else if (a >= Random) {
					jre.setText("숫자가 큽니다");
				} else if (a <= Random) {
					jre.setText("숫자가 작습니다");
				}
			} else if (e.getSource() == jbcancel) {
				dispose();// 프레임 종료
			}

		}

	}
}
