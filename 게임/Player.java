import java.util.Scanner;

class Player {
	private String name;
	private String word;
	Scanner sc;

	Player(String name) {
		this.name = name;
		sc = new Scanner(System.in);
	}

	public String getName() {
		return name;
	}

	public String sayWord() {
		System.out.println(name + ">>");
		word = sc.next();
		return word;

	}

	public boolean succeed(String lastWord) {
		int lastIndex = lastWord.length() - 1;

		if (lastWord.charAt(lastIndex) == word.charAt(0)) {
			return true;

		} else {
			return false;
		}
	}
}



