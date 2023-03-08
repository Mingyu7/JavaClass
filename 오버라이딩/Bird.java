
public class Bird extends Animal { //레퍼클래스 상속받으면 재정의 해서 사용해야함

	public Bird(String species, int leg) {
		super(species, leg);
	}

	@Override
	public void eat() {
		System.out.println("벌레를 먹어요");

	}

	@Override
	public void sound() {
		System.out.println("짹짹~");

	}

	public void fly() {
		System.out.println("하늘을 날아~");
	}

}
