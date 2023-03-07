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
		super(speed); //매개변수면 SportCar 오류 super 호출하면 값을 넘겨준다.
		//super !!바로위에 부모만 적용된다!!
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
