import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConPro3 extends JFrame {
	JPanel jp1, jp2;
	JButton jb1, jb2;
	JLabel jl1;

	public ConPro3() {
		// ������ ���� ����
		setTitle("�̺�Ʈ�ڵ鷯1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(400, 200);
		setLayout(new GridLayout(2, 1));

		jp1 = new JPanel(new FlowLayout()); //�⺻�� FlowLayout �Ƚᵵ ��
		jp2 = new JPanel();
		jp2.setBackground(Color.cyan); // ���� ����

		jb1 = new JButton("��ư1");
		jb2 = new JButton("��ư2");
		jl1 = new JLabel("���: ");

		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jl1);

		add(jp1);
		add(jp2);

		// pack();

		setVisible(true);
		//MyActionListener��ü ������ jb1, jb2�� ����
		jb1.addActionListener(new MyActionListener()); 
		jb2.addActionListener(new MyActionListener());

	}

	public static void main(String[] args) {
		new ConPro3();

	}

	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jb1) {
				//��ư 1Ŭ���ϸ�" ��ư2�� Ŭ���߽��ϴ�."����� -> �� pink�� ��ȯ
				jl1.setText("�ι�° ���: ��ư 1�� Ŭ���߽��ϴ�.");
				jp2.setBackground(Color.pink); 
			} else if (e.getSource() == jb2) {
				//��ư 2Ŭ���ϸ� "��ư2�� Ŭ���߽��ϴ�."����� ->�� cyan�� ��ȯ
				jl1.setText("�ι�° ���: ��ư2�� Ŭ���߽��ϴ�.");
				jp2.setBackground(Color.cyan);

			}
			
		}
		
	}
}