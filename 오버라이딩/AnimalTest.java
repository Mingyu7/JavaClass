
public class AnimalTest {

	public static void main(String[] args) { 
		Animal[] ani = new Animal[3];
		ani[0] = new Cat("�����",4);
		ani[1] = new Tiger("ȣ����",4);
		ani[2] = new Bird("��",2);
		
		for(int i =0; i<ani.length;i++) {
			System.out.println("����: "+ani[i].getSpecies());
			System.out.println("����: "+ani[i].getLeg());
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
