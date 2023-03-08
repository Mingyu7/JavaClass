import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImagePro01 extends JFrame implements ActionListener{
	
	JButton jb1,jb2;
	ImageIcon img;
	JLabel jlImage;
	public ImagePro01() {
		setTitle("이미지 출력");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel jp1 = new JPanel();
		jb1 = new JButton("사랑해");
		jb2 = new JButton("취소");
		
		img = new ImageIcon("img/love.jpg");
		jlImage =new JLabel();
		
		jp1.add(jb1);
		jp1.add(jb2);
		
		add(jp1,BorderLayout.NORTH);
		add(jlImage, BorderLayout.CENTER);
		
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
			
	public static void main(String[] args)  {
		new ImagePro01();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb1)
			jlImage.setIcon(img);
		else
			jlImage.setIcon(new ImageIcon(""));
		
	}

}
