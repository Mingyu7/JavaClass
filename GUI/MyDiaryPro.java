import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyDiaryPro extends JFrame {
	JMenuBar jmb;
	JMenu jmnFile, jmnFind;
	JMenuItem jmiNew, jmiLoad, jmiSave, jmiExit;
	JMenuItem jmiFind, jmiReplace;
	JTextArea jtaDiary;

	public MyDiaryPro() {

		setTitle("���� �ϱ���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		jmb = new JMenuBar();

		jmnFile = new JMenu("����");
		jmiNew = new JMenuItem("������");
		jmiLoad = new JMenuItem("����");
		jmiSave = new JMenuItem("����");
		jmiExit = new JMenuItem("����");
		// ���ϸ޴��� �����۳ֱ�
		jmnFile.add(jmiNew);
		jmnFile.add(jmiLoad);
		jmnFile.add(jmiSave);
		jmnFile.addSeparator(); // ���߱�
		jmnFile.add(jmiExit);

		jmnFind = new JMenu("ã��/�ٲٱ�");
		jmiFind = new JMenuItem("ã��");
		jmiReplace = new JMenuItem("�ٲٱ�");
		// ã��/�ٲٱ� �޴��� �����۳ֱ�
		jmnFind.add(jmiFind);
		jmnFind.add(jmiReplace);
		// �޴��ٿ� �߰�
		jmb.add(jmnFile);
		jmb.add(jmnFind);

		setJMenuBar(jmb);

		jtaDiary = new JTextArea(10, 30);
		jtaDiary.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		JScrollPane jsp = new JScrollPane(jtaDiary);

		add(jsp);
		setVisible(true);

		jmiNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtaDiary.setText("");
			}
		});
		jmiSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					FileDialog fd = new FileDialog(MyDiaryPro.this, "����", FileDialog.SAVE);
					fd.setVisible(true);
					String path = fd.getDirectory() + fd.getFile();
					if (fd.getFile() == null)
						return;
					// ���� txt ���Ϸ� �����ϱ�
					FileWriter fw = new FileWriter(path + ".txt");
					fw.write(jtaDiary.getText());
					fw.close();
				} catch (Exception fe) {
					fe.printStackTrace();
				}
			}
		});

		jmiLoad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileDialog fd = new FileDialog(MyDiaryPro.this, "����", FileDialog.LOAD); //����
					fd.setVisible(true);
					String path = fd.getDirectory() + fd.getFile();
					String s = "";
					FileReader fr = new FileReader(path);
					jtaDiary.setText(" ");
					
					int c;
					while (true) {
						c = fr.read();
						if (c == -1) break;
						s += (char) c;
					}
					jtaDiary.setText(s);
					fr.close();
				} catch (Exception ec) {
					ec.printStackTrace();
					JOptionPane.showMessageDialog(null, "�ϱ��� ���⿡ �����Ͽ����ϴ�.", "�������", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		jmiExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //����
			}
		});

	}

	public static void main(String[] args) {
		new MyDiaryPro();

	}

}
