
public class AnimalTest {

	public static void main(String[] args) { 
		Animal[] ani = new Animal[3];
		ani[0] = new Cat("고양이",4);
		ani[1] = new Tiger("호랑이",4);
		ani[2] = new Bird("새",2);
		
		for(int i =0; i<ani.length;i++) {
			System.out.println("종류: "+ani[i].getSpecies());
			System.out.println("종류: "+ani[i].getLeg());
			ani[i].run();
			ani[i].eat();
			ani[i].sound();
			
			if(ani[i] instanceof Bird) {
				((Bird)ani[i]).fly();
			}
			System.out.println("");
		}
	}

}
