public class Cat extends Animal {

	public Cat(String species, int leg) {
		super(species, leg);

	}

	@Override
	public void eat() {

		System.out.println("������ �Ծ��.");
	}

	@Override
	public void sound() {
		System.out.println("�߿� �߿�~");

	}

}
