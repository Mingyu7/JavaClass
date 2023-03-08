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
		// 프레임 정보 설정
		setTitle("이벤트핸들러1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(400, 200);
		setLayout(new GridLayout(2, 1));

		jp1 = new JPanel(new FlowLayout()); //기본이 FlowLayout 안써도 됨
		jp2 = new JPanel();
		jp2.setBackground(Color.cyan); // 색상 설정

		jb1 = new JButton("버튼1");
		jb2 = new JButton("버튼2");
		jl1 = new JLabel("결과: ");

		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jl1);

		add(jp1);
		add(jp2);

		// pack();

		setVisible(true);
		//MyActionListener객체 생성후 jb1, jb2랑 연결
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
				//버튼 1클릭하면" 버튼2를 클릭했습니다."출력후 -> 색 pink로 변환
				jl1.setText("두번째 방법: 버튼 1을 클릭했습니다.");
				jp2.setBackground(Color.pink); 
			} else if (e.getSource() == jb2) {
				//버튼 2클릭하면 "버튼2를 클릭했습니다."출력후 ->색 cyan로 변환
				jl1.setText("두번째 방법: 버튼2를 클릭했습니다.");
				jp2.setBackground(Color.cyan);

			}
			
		}
		
	}
}
