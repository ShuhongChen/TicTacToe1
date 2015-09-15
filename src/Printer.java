public class Printer {

	public void print(int[][] input) {

		String[] temp = new String[3];
		
		System.out.println("-------------");
		
		for (int i = 0; i < 3; i += 1) {
			
			for (int j = 0; j <= 2; j++) {
				if (input[i][j] == 0) {
					temp[j] = "   ";
				}
				else if (input[i][j] == 1) {
					temp[j] = " X ";
				}
				else if (input[i][j] == -1){
					temp[j] = " O ";
				}
				else {
					throw new IllegalArgumentException("Impossibruh!");
				}
			}
			
			System.out.println("|" + temp[0] + "|" + temp[1] + "|" + temp[2] + "|");
			System.out.println("-------------");

		}
	}
}
