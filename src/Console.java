import java.util.Scanner;
import java.util.StringTokenizer;

public class Console {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("I want to play a game...");

		// create Classes for methods
		Printer printer = new Printer();
		Victory victory = new Victory();
		Determine determine = new Determine();
		Scanner read = new Scanner(System.in);
		
		boolean h = true;
		while (h == true) {
			// Setup
			int[][] table = new int[3][3];
			table[0][0] = 1;
			// table[1][1] = 0;
			// table[2][2] = 0;
			int counter = 1;

			// EVERY TURN
			while (victory.askEnd(table) == 0) {
				printer.print(table);
				// System.out.println("counter:" + counter);
				System.out.println("Enter: row (space) column");

				/*double k = read.nextDouble();
				int player1 = (int) k;
				int player2 = (int) (10 * k - 10 * player1);
				player1--;
				player2--;*/
				// System.out.println(player1 + " " + player2);
				String k = read.nextLine();
				StringTokenizer st = new StringTokenizer(k, " ");
				String[] array = new String[2];
				int cnt = 0;
				while (st.hasMoreElements()) {
					array[cnt++] = (String) st.nextElement();
				}
				int player1 = (int) Integer.valueOf(array[0]);
				int player2 = (int) Integer.valueOf(array[1]);
				player1--;
				player2--;
				System.out.println();

				if (table[player1][player2] != 0) {
					System.out.println("No cheating.");
					;
				} else {
					table[player1][player2] = -1;
					table[determine.determine(table, counter)[0]][determine
							.determine(table, counter)[1]] = 1;
					counter++;
				}

				if (counter == 5) {
					break;
				}
			}

			// Victory met
			printer.print(table);
			if (victory.askEnd(table) == -1) {
				System.out.println("Long live the Luddite!");
				System.out.println("Rematch? 0/1?");
			} else if (victory.askEnd(table) == 1) {
				System.out
						.println("I, for one, welcome our new digital overlords.");
				System.out.println("Dare you challenge master? 0/1?");
			} else {
				System.out.println("Machine and Man, Hand in Hand.");
				System.out.println("Once more, comrade? 0/1?");
			}

			int q = read.nextInt();
			System.out.println();
			if (q == 0) {
				System.out.println("Fine, have it your way.");
				break;
			} else if (q == 1) {
				System.out.println("Let's go.");
			} else {
				System.out.println("I'll take that as a yes then...");
			}

		}
	}

}
