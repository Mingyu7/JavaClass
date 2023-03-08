
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class game3 extends JFrame implements ActionListener {

	static final int ROCK = 1, PAPER = 2, SCISSOR = 3;

	JPanel jp1, jp2, jp3;
	JButton rock, paper, scissor;
	JLabel jl1, jl2;

	public game3() {

		setTitle("��������������");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(400, 200);
		setLayout(new BorderLayout()); // contentPanel

		jp1 = new JPanel();
		jp2 = new JPanel(new GridLayout(1, 3));
		jp3 = new JPanel();

		jl1 = new JLabel("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���ϼ���");

		rock = new JButton("����");
		rock.setBackground(Color.cyan);

		paper = new JButton("��");
		paper.setBackground(Color.pink);

		scissor = new JButton("����");
		scissor.setBackground(Color.yellow);

		jl2 = new JLabel("��� : ");

		jp1.add(jl1);

		jp2.add(rock);
		jp2.add(paper);
		jp2.add(scissor);

		jp3.add(jl2);

		add(jp1);
		add(jp2);
		add(jp3);

		setVisible(true);
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new game3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int random = (int) (Math.random() * 3 + 1);// ������ ������ �������ش�

		if (e.getSource() == rock) {
			if (random == PAPER)
				jl2.setText("��ǻ�Ͱ� ������ �� : ����� �¸�");
			else if (random == ROCK)
				jl2.setText("��ǻ�Ͱ� ������ �� : �����");
			else
				jl2.setText("��ǻ�Ͱ� ���� �� : ��ǻ�� �¸�");

		} else if (e.getSource() == paper) {
			if (random == SCISSOR)
				jl2.setText("��ǻ�Ͱ� ������ �� : ��ǻ�� �¸�");
			else if (random == PAPER)
				jl2.setText("��ǻ�Ͱ� ���� �� : �����");
			else
				jl2.setText("��ǻ�Ͱ� ������ �� : ����� �¸�");
		} else if (e.getSource() == scissor) {
			if (random == ROCK)
				jl2.setText("��ǻ�Ͱ� ���� �� : ����� �¸�");
			else if (random == SCISSOR)
				jl2.setText("��ǻ�Ͱ� ������ �� : �����");
			else
				jl2.setText("��ǻ�Ͱ� ������ �� : ��ǻ�� �¸�");

		}

	}
}
