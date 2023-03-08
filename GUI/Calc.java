import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calc extends JFrame {
	JTextField jtft;

	JButton[] bt = new JButton[16];

	public Calc() {
		setTitle("°è»ê±â");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel jp3 = new JPanel(new GridLayout(4, 4));

		jtft = new JTextField(20);
		JButton btc = new JButton("C");

		bt[0] = new JButton("7");
		bt[1] = new JButton("8");
		bt[2] = new JButton("9");
		bt[3] = new JButton("¡À");

		bt[4] = new JButton("4");
		bt[5] = new JButton("5");
		bt[6] = new JButton("6");
		bt[7] = new JButton("¡¿");

		bt[8] = new JButton("1");
		bt[9] = new JButton("2");
		bt[10] = new JButton("3");
		bt[11] = new JButton("-");

		bt[12] = new JButton("0");
		bt[13] = new JButton("C");
		bt[14] = new JButton("C");
		bt[15] = new JButton("+");

		jp1.add(jtft);
		jp2.add(btc);
		for (int i = 0; i <= 15; i++) {
			jp3.add(bt[i]);
		}
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		add(jp3, BorderLayout.SOUTH);

		pack();

		setVisible(true);

		for (int i = 0; i <= 15; i++) {
			bt[i].addActionListener(new MyActionListener());
		}

	}


	public static void main(String[] args) {
		new Calc();

	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i <= 15; i++) {
				if (e.getSource() == bt[i]) {
					int n = Integer.parseInt(bt[i].getText());
					jtft.setText("" + n);
				}
				
			}
		}
	}
}
