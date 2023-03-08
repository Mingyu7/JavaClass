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

		JLabel jlTitle = new JLabel("Ŀ���ǸŽý���"); // ����
		jpTitle.add(jlTitle);
		// ���� ��ư
		jrbSmall = new JRadioButton("����");
		jrbReqular = new JRadioButton("���ַ�");
		jrbLarge = new JRadioButton("����");
		ButtonGroup bg = new ButtonGroup(); // ��ư �׷����
		// ��ư�� ���ʷ� �׷쿡 �ֱ�
		bg.add(jrbLarge);
		bg.add(jrbReqular);
		bg.add(jrbSmall);
		// ���� �гο� ��ư�ֱ�
		jpRadio.add(jrbSmall);
		jpRadio.add(jrbReqular);
		jpRadio.add(jrbLarge);
		// ������ �гο� size ���̺� �ֱ�
		jlSize = new JLabel("���û����� : ");
		jpSize.add(jlSize);
		// �����гο� �׵θ� �� �������
		Border b = BorderFactory.createTitledBorder("�������");
		jpRadio.setBorder(b);

		// üũ�ڽ�
		jckSyrup = new JCheckBox("�÷�");
		jckCream = new JCheckBox("����ũ��");
		jckChoco = new JCheckBox("����");

		TitledBorder b1 = BorderFactory.createTitledBorder("�߰��ɼǼ���");
		jpCheck.setBorder(b1);
		jpCheck.add(jckSyrup);
		jpCheck.add(jckCream);
		jpCheck.add(jckChoco);

		jladdOption = new JLabel("�߰��ɼ�");
		jpoption.add(jladdOption);
		
		//�߰� �޽���
		jtaMessage = new JTextArea(3,30);
		jtaMessage.setText("//��û������ �Է��ϼ���");
		JScrollPane jscp = new JScrollPane(jtaMessage);
		jpMessage.add(jscp);
		
		jbConfirm=new JButton("Ȯ��");
		jpConfirm.add(jbConfirm);
		
		add(jpTitle);
		add(jpRadio);
		add(jpSize);
		// üũ
		add(jpCheck);
		add(jpoption);
		//�߰� �޽���
		add(jpMessage);
		add(jpConfirm);
		setVisible(true);
		
		// ���� �̺�Ʈ
		jrbSmall.addItemListener(new MyRadioListener());
		jrbReqular.addItemListener(new MyRadioListener());
		jrbLarge.addItemListener(new MyRadioListener());
		// üũ �̺�Ʈ
		jckSyrup.addItemListener(new MyCheckListener());
		jckCream.addItemListener(new MyCheckListener());
		jckChoco.addItemListener(new MyCheckListener());
		//�߰� �޽���
		jbConfirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�߰� �޽���â �ؽ�Ʈ �ҷ��ͼ� �˾����� ����
				String addMessage = jtaMessage.getText(); 
				int result= JOptionPane.showConfirmDialog(null,addMessage+"�� ��û�մϴ�.","��û����",JOptionPane.YES_NO_OPTION);
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
				jlSize.setText("���� ������ : ���� ");
			} else if (e.getItem() == jrbReqular) {
				jlSize.setText("���� ������ : ���ַ� ");
			} else if (e.getItem() == jrbLarge) {
				jlSize.setText("���� ������ : ���� ");
			}

		}

	}

	class MyCheckListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getItem() == jckSyrup) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					arrAddOption.add("�÷�"); //�߰�
				else
					arrAddOption.remove("�÷�"); //����
			} else if (e.getItem() == jckCream) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					arrAddOption.add(" ����ũ��");
				else
					arrAddOption.remove("ũ��");
			} else if (e.getItem() == jckChoco) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					arrAddOption.add(" ����");
				else
					arrAddOption.remove("����");

			}
			//String �迭�� list����ؼ� �߰�,����
			String selected="";
			for(String s: arrAddOption) {
				selected+=s+"";
			}
			jladdOption.setText("�߰��ɼ�: "+selected);
		}
	}


}
