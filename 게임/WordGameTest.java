import java.util.Scanner;

public class WordGameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String startWord = "�ڷγ�";
		Player[] players;
		System.out.println("���ӿ� �����ϴ� �ο�>>");
		players = new Player[sc.nextInt()];

		for (int i = 0; i < players.length; i++) {
			System.out.println("������ �̸�>>");
			players[i] = new Player(sc.next());
		}
		String lastWord = startWord;
		System.out.println("�����ϴ� �ܾ�� " + lastWord + "�Դϴ�.");
		int next = 0;
		while (true) {
			String newWord = players[next].sayWord();
			if (!players[next].succeed(lastWord)) {
				System.out.println(players[next].getName() + "�� �����.");
				break;
			}
			next++;
			next = next % players.length;
			lastWord = newWord;
		}

	}

}
