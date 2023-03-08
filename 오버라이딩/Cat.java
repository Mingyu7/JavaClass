public class Cat extends Animal {

	public Cat(String species, int leg) {
		super(species, leg);

	}

	@Override
	public void eat() {

		System.out.println("积急阑 冈绢夸.");
	}

	@Override
	public void sound() {
		System.out.println("具克 具克~");

	}

}
