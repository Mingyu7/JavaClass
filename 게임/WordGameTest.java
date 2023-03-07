import java.util.Scanner;

public class WordGameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String startWord = "코로나";
		Player[] players;
		System.out.println("게임에 참가하는 인원>>");
		players = new Player[sc.nextInt()];

		for (int i = 0; i < players.length; i++) {
			System.out.println("참가자 이름>>");
			players[i] = new Player(sc.next());
		}
		String lastWord = startWord;
		System.out.println("시작하는 단어는 " + lastWord + "입니다.");
		int next = 0;
		while (true) {
			String newWord = players[next].sayWord();
			if (!players[next].succeed(lastWord)) {
				System.out.println(players[next].getName() + "이 졌어요.");
				break;
			}
			next++;
			next = next % players.length;
			lastWord = newWord;
		}

	}

}
