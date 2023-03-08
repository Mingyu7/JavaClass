
public abstract class Animal {
	private String species;
	private int leg;

	public Animal(String species, int leg) {
		this.species = species;
		this.leg = leg;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public void run() {
		System.out.println("´Þ·Á~~");
	}
	
	abstract public void eat();
	abstract public void sound();
	
}
