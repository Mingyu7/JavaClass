
public class Tiger extends Animal {

	public Tiger(String species, int leg) {
		super(species, leg);

	}

	@Override
	public void eat() {
		System.out.println("°í±â¸¦ ¸Ô¾î¿ä");

	}

	@Override
	public void sound() {
		System.out.println("¾îÈï¾îÈï~");

	}

}
