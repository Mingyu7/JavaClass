
public class Bird extends Animal { //����Ŭ���� ��ӹ����� ������ �ؼ� ����ؾ���

	public Bird(String species, int leg) {
		super(species, leg);
	}

	@Override
	public void eat() {
		System.out.println("������ �Ծ��");

	}

	@Override
	public void sound() {
		System.out.println("±±~");

	}

	public void fly() {
		System.out.println("�ϴ��� ����~");
	}

}
