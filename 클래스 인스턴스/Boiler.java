
public class Boiler {
	private int temp = 0;
	private final int MAX = 40;

	int setTemp() {
		return temp;
	}

	void getTemp(int temp) {
		this.temp = temp;
	}

	int tempUp() {
		temp++;
		return temp;
	}

	int tempUp(int i) {
		temp += i;
		if (temp > MAX)
			temp = MAX;
		return temp;

	}
}
