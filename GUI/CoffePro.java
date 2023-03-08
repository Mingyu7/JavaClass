import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class CoffePro extends JFrame{
	JRadioButton jrbSmall, jrbReqular, jrbLarge;
	JLabel jlSize;

	JCheckBox jckSyrup, jckCream, jckChoco;
	JLabel jladdOption;
	ArrayList<String> arrAddOption;
	
	JTextArea jtaMessage;
	JButton jbConfirm; 

	public CoffePro() {
		setTitle("coffe sales system");
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		arrAddOption = new ArrayList<>();

		setLayout(new GridLayout(7, 1));

		JPanel jpTitle = new JPanel();
		JPanel jpRadio = new JPanel();
		JPanel jpSize = new JPanel();
		JPanel jpCheck = new JPanel();
		JPanel jpoption = new JPanel();
		JPanel jpMessage = new JPanel();
		JPanel jpConfirm = new JPanel();

		JLabel jlTitle = new JLabel("커피판매시스템"); // 제목
		jpTitle.add(jlTitle);
		// 라디오 버튼
		jrbSmall = new JRadioButton("스몰");
		jrbReqular = new JRadioButton("레귤러");
		jrbLarge = new JRadioButton("라지");
		ButtonGroup bg = new ButtonGroup(); // 버튼 그룹생성
		// 버튼을 차례로 그룹에 넣기
		bg.add(jrbLarge);
		bg.add(jrbReqular);
		bg.add(jrbSmall);
		// 라디오 패널에 버튼넣기
		jpRadio.add(jrbSmall);
		jpRadio.add(jrbReqular);
		jpRadio.add(jrbLarge);
		// 사이즈 패널에 size 레이블 넣기
		jlSize = new JLabel("선택사이즈 : ");
		jpSize.add(jlSize);
		// 라디오패널에 테두리 및 제목삽입
		Border b = BorderFactory.createTitledBorder("사이즈선택");
		jpRadio.setBorder(b);

		// 체크박스
		jckSyrup = new JCheckBox("시럽");
		jckCream = new JCheckBox("휘핑크림");
		jckChoco = new JCheckBox("초코");

		TitledBorder b1 = BorderFactory.createTitledBorder("추가옵션선택");
		jpCheck.setBorder(b1);
		jpCheck.add(jckSyrup);
		jpCheck.add(jckCream);
		jpCheck.add(jckChoco);

		jladdOption = new JLabel("추가옵션");
		jpoption.add(jladdOption);
		
		//추가 메시지
		jtaMessage = new JTextArea(3,30);
		jtaMessage.setText("//요청사항을 입력하세요");
		JScrollPane jscp = new JScrollPane(jtaMessage);
		jpMessage.add(jscp);
		
		jbConfirm=new JButton("확인");
		jpConfirm.add(jbConfirm);
		
		add(jpTitle);
		add(jpRadio);
		add(jpSize);
		// 체크
		add(jpCheck);
		add(jpoption);
		//추가 메시지
		add(jpMessage);
		add(jpConfirm);
		setVisible(true);
		
		// 라디오 이벤트
		jrbSmall.addItemListener(new MyRadioListener());
		jrbReqular.addItemListener(new MyRadioListener());
		jrbLarge.addItemListener(new MyRadioListener());
		// 체크 이벤트
		jckSyrup.addItemListener(new MyCheckListener());
		jckCream.addItemListener(new MyCheckListener());
		jckChoco.addItemListener(new MyCheckListener());
		//추가 메시지
		jbConfirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//추가 메시지창 텍스트 불러와서 팝업으로 띄우기
				String addMessage = jtaMessage.getText(); 
				int result= JOptionPane.showConfirmDialog(null,addMessage+"을 요청합니다.","요청사항",JOptionPane.YES_NO_OPTION);
				if(result==JOptionPane.YES_NO_OPTION) {}
				else {}
			}
		});

	}

	public static void main(String[] args) {
		new CoffePro();
	}

	class MyRadioListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getItem() == jrbSmall) {
				jlSize.setText("선택 사이즈 : 스몰 ");
			} else if (e.getItem() == jrbReqular) {
				jlSize.setText("선택 사이즈 : 레귤러 ");
			} else if (e.getItem() == jrbLarge) {
				jlSize.setText("선택 사이즈 : 라지 ");
			}

		}

	}

	class MyCheckListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getItem() == jckSyrup) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					arrAddOption.add("시럽"); //추가
				else
					arrAddOption.remove("시럽"); //제거
			} else if (e.getItem() == jckCream) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					arrAddOption.add(" 휘핑크림");
				else
					arrAddOption.remove("크림");
			} else if (e.getItem() == jckChoco) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					arrAddOption.add(" 초코");
				else
					arrAddOption.remove("초코");

			}
			//String 배열에 list사용해서 추가,제거
			String selected="";
			for(String s: arrAddOption) {
				selected+=s+"";
			}
			jladdOption.setText("추가옵션: "+selected);
		}
	}


}
