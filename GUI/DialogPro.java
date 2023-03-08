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
		setTitle("��ȭ���� �׽�Ʈ");
		setSize(300, 170);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		jb1 = new JButton("���� ����");
		jb2 = new JButton("�簢���� ����");
		jtfResult = new TextField(20);

		add(jb1);
		add(jb2);
		add(jtfResult);

		dialog = new MyDialog(this, "�簢�� ũ���Է�"); // ���̾�α� ����

		setVisible(true);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String num = JOptionPane.showInputDialog("���Ǹ����Է�");
				if (num != null) {
					int radius = Integer.parseInt(num);
					jtfResult.setText("���Ǹ���:" + radius * radius * 3.14);
				} else {

					JOptionPane.showMessageDialog(null, "�����߻�", "����", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				int[] nums = dialog.getInput();
				jtfResult.setText("�簢������ :" + nums[0] * nums[1]);

			}
		});

	}

	class MyDialog extends JDialog {
		JTextField jtfNum1 = new JTextField(5);
		JTextField jtfNum2 = new JTextField(5);
		JButton jbCalc = new JButton("�������ϱ�");

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
					setVisible(false); // ���̾�α� �ݱ�.

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