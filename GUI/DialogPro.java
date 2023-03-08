import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DialogPro extends JFrame {
	TextField jtfResult;
	JButton jb1, jb2;
	MyDialog dialog;

	public DialogPro() {
		setTitle("대화상자 테스트");
		setSize(300, 170);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		jb1 = new JButton("원의 면적");
		jb2 = new JButton("사각형의 면적");
		jtfResult = new TextField(20);

		add(jb1);
		add(jb2);
		add(jtfResult);

		dialog = new MyDialog(this, "사각형 크기입력"); // 다이얼로그 생성

		setVisible(true);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String num = JOptionPane.showInputDialog("원의면적입력");
				if (num != null) {
					int radius = Integer.parseInt(num);
					jtfResult.setText("원의면적:" + radius * radius * 3.14);
				} else {

					JOptionPane.showMessageDialog(null, "오류발생", "오류", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				int[] nums = dialog.getInput();
				jtfResult.setText("사각형면적 :" + nums[0] * nums[1]);

			}
		});

	}

	class MyDialog extends JDialog {
		JTextField jtfNum1 = new JTextField(5);
		JTextField jtfNum2 = new JTextField(5);
		JButton jbCalc = new JButton("면적구하기");

		public MyDialog(JFrame frame, String title) {
			super(frame, title, true);
			setSize(200, 100);
			setLocationRelativeTo(null);
			setLayout(new FlowLayout());

			add(jtfNum1);
			add(jtfNum2);
			add(jbCalc);

			jbCalc.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false); // 다이얼로그 닫기.

				}
			});
		}

		public int[] getInput() {
			int[] nums = new int[2];
			nums[0] = Integer.parseInt(jtfNum1.getText());
			nums[1] = Integer.parseInt(jtfNum2.getText());
			jtfNum1.setText("");
			jtfNum2.setText("");
			return nums;
		}
	}

	public static void main(String[] args) {
		new DialogPro();

	}
}