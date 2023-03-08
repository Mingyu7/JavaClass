import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RPS_Pro extends JFrame {
	JButton jbrock, jbpaper, jbscissors;
	JTextField jtRe;
	JLabel jlt;
	int Random = (int) (Math.random() * 3) + 1;

	public RPS_Pro() {

		setTitle("���������� ����");
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container c = getContentPane(); 
		c.setBackground(Color.gray);

		setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new BorderLayout());
		JPanel jp2 = new JPanel(new GridLayout(0,3));
		JPanel jp3 = new JPanel();
		
		JLabel jlc = new JLabel("�Ʒ��� ��ư�߿��� �ϳ��� Ŭ���ϼ���");
		jbscissors = new JButton("����");
		jbscissors.setBackground(Color.yellow);
		jbrock = new JButton("����");
		jbrock.setBackground(Color.PINK);
		jbpaper = new JButton("��");
		jbpaper.setBackground(Color.cyan);
		jlt = new JLabel("���");

		jp1.add(jlc);
		jp2.add(jbscissors);
		jp2.add(jbrock);
		jp2.add(jbpaper);		
		jp3.add(jlt);

		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jp3,BorderLayout.SOUTH);

		pack();

		setVisible(true);

		jbscissors.addActionListener(new MyActionListener());
		jbrock.addActionListener(new MyActionListener());
		jbpaper.addActionListener(new MyActionListener());
	}

	public static void main(String[] args) {
		new RPS_Pro();

	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jbscissors) { //����� ����
				if(3==Random) {
					jlt.setText("��ǻ�Ͱ� ������ ��: ���");
				}
				else if(2==Random) {
					jlt.setText("��ǻ�Ͱ� ���� ��: ����� �¸�");
				}
				else {
					jlt.setText("��ǻ�Ͱ� ������ ��: ��ǻ�� �¸�");
				}
			}
			
			if(e.getSource()==jbrock) { //����� ����
				if(1==Random) {
					jlt.setText("��ǻ�Ͱ� ������ ��: ���");
				}
				else if(3==Random) {
					jlt.setText("��ǻ�Ͱ� ������ ��: ����� �¸�");
				}
				else {
					jlt.setText("��ǻ�Ͱ� ���� ��: ��ǻ�� �¸�");
				}
			}
			
			if(e.getSource()==jbpaper) { //����� ��
				if(2==Random) {
					jlt.setText("��ǻ�Ͱ� ���� ��: ���");
				}
				else if(1==Random) {
					jlt.setText("��ǻ�Ͱ� ������ ��: ����� �¸�");
				}
				else {
					jlt.setText("��ǻ�Ͱ� ������ ��: ��ǻ�� �¸�");
				}
			}
			
		}
	}
}
