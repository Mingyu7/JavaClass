import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingPro01 extends JFrame {
	
	public SwingPro01() {
		setTitle("스윙 프레임 테스트1");
		setSize(300,300); // 프레임 크기 300x300
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container c = getContentPane(); //컨테이너 불러오기 *import java.awt.Container*필수
		c.setBackground(Color.PINK); //컨테이너 백그라운드에 컬러 저장
		//c.setLayout(new FlowLayout()); //레이아웃 지정 
		
		setLayout(new FlowLayout()); //컨테이너 생략가능
		
		
		JButton jb1 = new JButton("클릭하세요"); //버튼에 "클릭하세요" 생성
		add(jb1); 						  // 컨테이너에 버튼 저장 c. 생략가능
		
		//setBackground(Color.CYAN); 
		
		setVisible( true); // 프레임 출력
	}

	public static void main(String[] args) {
		SwingPro01 sp = new SwingPro01(); //다시 사용할려면 이렇게
		//안할려면  new SwingPro01(); <- 사용하지 않을려면 그냥 앞에 객체 생성 생략

	}

}
