import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
//Thread 사용
class TimerThread extends Thread {

	JLabel jlTimer;

	public TimerThread(JLabel jlTimer) {
		this.jlTimer = jlTimer;

	}

	public void run() {
		super.run();
		int n = 0;
		while (true) {
			jlTimer.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				return;
			}
		}
	}
}
//Runnable 사용
class TimerRunnable implements Runnable {
	JLabel jlTimer;

	public TimerRunnable(JLabel jlTime) {
		this.jlTimer = jlTime;

	}

	public void run() {
		//super.run();
		int n = 0;
		while (true) {
			jlTimer.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				return;
			}
		}
	}

}

public class ThreadTimerPro extends JFrame {
	public ThreadTimerPro() {
		setTitle("스레드 타이머");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300, 200);
		setLayout(new FlowLayout());

		JLabel jlTimer = new JLabel();
		jlTimer.setFont(new Font("Gothic", Font.ITALIC, 80));
		add(jlTimer);

		// TimerThread th = new TimerThread(jlTimer);
		// th.start();

		TimerRunnable run = new TimerRunnable(jlTimer);
		Thread th = new Thread(run);
		th.start();

		setVisible(true);

	}

	public static void main(String[] args) {
		new ThreadTimerPro();
	}

}