
public class Television {

	private int channel;
	private int Volumn;
	private boolean OnOff;
	
	private static int tvCount=0;
	
	public static int getTvCount() {
		return tvCount;
	}

	Television() {
		/*channel = 10;
		Volumn = 2;
		OnOff = false; */
		//System.out.println("�⺻ Tv ����"); <-- ������ ó���� this
		this(10,2,false); 				//ó���� this�;� �Ѵ�
		System.out.println("�⺻ Tv ����");
		
		
	}

	Television(int channel) { //������ �����ε�
		/*this.channel = channel;
		Volumn = 0;
		OnOff = false;*/
		this(channel,0,false);
		
	}

	Television(int channel, int Volumn) {
		/*this.channel = channel;
		this.Volumn = Volumn;
		OnOff = false;*/
		this(channel,Volumn,false);
		

	}

	Television(int channel, int Volumn, boolean OnOff) {
		this.channel = channel;
		this.Volumn = Volumn;
		this.OnOff = OnOff;
		tvCount++;

	}

	void print() {
		System.out.println("ä��: " + channel + " ����: " + Volumn + " ��������: " + OnOff);
	}

	int getChannel() {
		return channel;
	}

	int getVolumn() {
		return Volumn;
	}

	boolean getonOff() {
		return OnOff;
	}

	public void setChannel(int channel) {
		if (channel > 0)
			this.channel = channel;
	}

	void setvolumn(int volumn) {
		this.Volumn = volumn;
	}

	void setOnOff(boolean OnOff) {
		this.OnOff = OnOff;

	}
}
