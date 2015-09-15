public class Determine {
	public int[] determine(int[][] table, int counter) {

		int[] output = new int[2];
		Victory vic = new Victory();

		if (counter == 1) {
			if (table[1][1] == -1) {
				output[0] = 2;
				output[1] = 2;
			} else if (table[1][0] == 0) {
				output[0] = 2;
				output[1] = 0;
			} else {
				output[0] = 0;
				output[1] = 2;
			}
		} else if (counter == 2) {
			if (vic.goAhead(table)[0] != 5) {
				output[0] = vic.goAhead(table)[0];
				output[1] = vic.goAhead(table)[1];
			} else if (vic.goDefend(table)[0] != 5) {
				output[0] = vic.goDefend(table)[0];
				output[1] = vic.goDefend(table)[1];
			} else {
				if (table[0][2] == 0 && table[0][1] == 0) {
					output[0] = 0;
					output[1] = 2;
				} else if (table[2][0] == 0 && table[1][0] == 0) {
					output[0] = 2;
					output[1] = 0;
				} else if (table[2][2] == 0) {
					output[0] = 2;
					output[1] = 2;
				}
			}
		} else {
			if (vic.goAhead(table)[0] != 5) {
				output[0] = vic.goAhead(table)[0];
				output[1] = vic.goAhead(table)[1];
			} else if (vic.goDefend(table)[0] != 5) {
				output[0] = vic.goDefend(table)[0];
				output[1] = vic.goDefend(table)[1];
			}
		}

		counter++;
		return output;
	}
}
