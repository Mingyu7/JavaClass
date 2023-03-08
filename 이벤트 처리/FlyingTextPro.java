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
		setTitle("�ؽ�Ʈ �����̱�");
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

		// �����̳� c�� ���� �̺�Ʈó��
		c.addMouseListener(new MyAdapterListener());
		//Ű �̺�Ʈ ó��
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				int keyCode = e.getKeyCode(); // �����¿�� �����ڵ尡 �ƴ� 
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
	 * { //���콺������ ����
	 * 
	 * //���콺 �̺�Ʈó��
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
