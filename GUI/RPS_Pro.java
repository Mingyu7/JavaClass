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

		setTitle("가위바위보 게임");
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container c = getContentPane(); 
		c.setBackground(Color.gray);

		setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new BorderLayout());
		JPanel jp2 = new JPanel(new GridLayout(0,3));
		JPanel jp3 = new JPanel();
		
		JLabel jlc = new JLabel("아래의 버튼중에서 하나를 클릭하세요");
		jbscissors = new JButton("가위");
		jbscissors.setBackground(Color.yellow);
		jbrock = new JButton("바위");
		jbrock.setBackground(Color.PINK);
		jbpaper = new JButton("보");
		jbpaper.setBackground(Color.cyan);
		jlt = new JLabel("결과");

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
			if(e.getSource()==jbscissors) { //사용자 가위
				if(3==Random) {
					jlt.setText("컴퓨터가 가위를 냄: 비김");
				}
				else if(2==Random) {
					jlt.setText("컴퓨터가 보를 냄: 사용자 승리");
				}
				else {
					jlt.setText("컴퓨터가 바위를 냄: 컴퓨터 승리");
				}
			}
			
			if(e.getSource()==jbrock) { //사용자 바위
				if(1==Random) {
					jlt.setText("컴퓨터가 바위를 냄: 비김");
				}
				else if(3==Random) {
					jlt.setText("컴퓨터가 가위를 냄: 사용자 승리");
				}
				else {
					jlt.setText("컴퓨터가 보를 냄: 컴퓨터 승리");
				}
			}
			
			if(e.getSource()==jbpaper) { //사용자 보
				if(2==Random) {
					jlt.setText("컴퓨터가 보를 냄: 비김");
				}
				else if(1==Random) {
					jlt.setText("컴퓨터가 바위를 냄: 사용자 승리");
				}
				else {
					jlt.setText("컴퓨터가 가위를 냄: 컴퓨터 승리");
				}
			}
			
		}
	}
}
