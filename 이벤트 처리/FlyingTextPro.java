import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextPro extends JFrame {

	JLabel la = new JLabel("HELLO");

	public FlyingTextPro() {
		setTitle("텍스트 움직이기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300, 300);

		Container c = getContentPane();
		c.setLayout(null);

		la.setLocation(50, 50);
		la.setSize(50, 10);
		c.add(la);

		c.setFocusable(true);
		c.requestFocus();
		setVisible(true);

		// 컨테이너 c에 대해 이벤트처리
		c.addMouseListener(new MyAdapterListener());
		//키 이벤트 처리
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				int keyCode = e.getKeyCode(); // 상하좌우는 유니코드가 아님 
				switch (keyCode) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY() - 10);
					break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY() + 10);
					break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX() - 10, la.getY());
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX() + 10, la.getY());
					break;
				}
			}
		});
	}

	class MyAdapterListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			// super.mousePressed(e);
			int x = e.getX();
			int y = e.getY();

			la.setLocation(x, y);
		}

	}
	/*
	 * { //마우스리스너 생성
	 * 
	 * //마우스 이벤트처리
	 * 
	 * @Override public void mouseReleased(MouseEvent e) { int x=e.getX(); int
	 * y=e.getY(); la.setLocation(x,y); }
	 * 
	 * @Override public void mousePressed(MouseEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public void mouseExited(MouseEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public void mouseEntered(MouseEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * } });
	 */

	public static void main(String[] args) {

		new FlyingTextPro();

	}

}
