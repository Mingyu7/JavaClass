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

		setTitle("나의 일기장");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		jmb = new JMenuBar();

		jmnFile = new JMenu("파일");
		jmiNew = new JMenuItem("새문서");
		jmiLoad = new JMenuItem("열기");
		jmiSave = new JMenuItem("저장");
		jmiExit = new JMenuItem("종료");
		// 파일메뉴에 아이템넣기
		jmnFile.add(jmiNew);
		jmnFile.add(jmiLoad);
		jmnFile.add(jmiSave);
		jmnFile.addSeparator(); // 선긋기
		jmnFile.add(jmiExit);

		jmnFind = new JMenu("찾기/바꾸기");
		jmiFind = new JMenuItem("찾기");
		jmiReplace = new JMenuItem("바꾸기");
		// 찾기/바꾸기 메뉴에 아이템넣기
		jmnFind.add(jmiFind);
		jmnFind.add(jmiReplace);
		// 메뉴바에 추가
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
					FileDialog fd = new FileDialog(MyDiaryPro.this, "저장", FileDialog.SAVE);
					fd.setVisible(true);
					String path = fd.getDirectory() + fd.getFile();
					if (fd.getFile() == null)
						return;
					// 파일 txt 파일로 저장하기
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
					FileDialog fd = new FileDialog(MyDiaryPro.this, "열기", FileDialog.LOAD); //열기
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
					JOptionPane.showMessageDialog(null, "일기장 열기에 실패하였습니다.", "열기오류", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		jmiExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //종료
			}
		});

	}

	public static void main(String[] args) {
		new MyDiaryPro();

	}

}
