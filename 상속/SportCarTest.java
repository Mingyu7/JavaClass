class Car{
	int speed;
	//Car(){}
	Car(int speed){
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}

class SportCar extends Car{
	boolean turbo;
	public SportCar(int speed,boolean turbo) {
		super(speed); //�Ű������� SportCar ���� super ȣ���ϸ� ���� �Ѱ��ش�.
		//super !!�ٷ����� �θ� ����ȴ�!!
		this.turbo=turbo;
	}
	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
}

public class SportCarTest {

	public static void main(String[] args) {
		SportCar sc = new SportCar(100,true);
		System.out.println(sc.getSpeed());
		System.out.println(sc.isTurbo());
		
		sc.setSpeed(180);
		sc.setTurbo(true);
		System.out.println(sc.getSpeed());
		System.out.println(sc.isTurbo());
	}

}
