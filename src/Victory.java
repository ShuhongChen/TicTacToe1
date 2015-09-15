public class Victory {

	public int askEnd(int[][] input) {

		int ans = 0;

		if (input[0][0] + input[1][1] + input[2][2] == 3) {
			ans = 1;
		} else if (input[0][2] + input[1][1] + input[2][0] == 3) {
			ans = 1;
		} else if (input[0][0] + input[1][1] + input[2][2] == -3) {
			ans = -1;
		} else if (input[0][2] + input[1][1] + input[2][0] == -3) {
			ans = -1;
		} else {
			for (int i = 0; i <= 2;) {
				if (input[i][0] + input[i][1] + input[i][2] == 3) {
					ans = 1;
					break;
				} else if (input[i][0] + input[i][1] + input[i][2] == -3) {
					ans = -1;
					break;
				} else if (input[0][i] + input[1][i] + input[2][i] == 3) {
					ans = 1;
					break;
				} else if (input[0][i] + input[1][i] + input[2][i] == -3) {
					ans = -1;
					break;
				} else {
					i++;
				}
			}
		}

		return ans;
	}

	public int[] goAhead(int[][] input) {

		int[] ans = { 5, 0 };

		if (input[0][0] + input[1][1] + input[2][2] == 2
				|| input[0][2] + input[1][1] + input[2][0] == 2) {
			ans[0] = 1;
			ans[1] = 1;
		} else {
			for (int i = 0; i <= 2;) {
				if (input[i][0] + input[i][1] + input[i][2] == 2) {
					ans[0] = i;
					for (int j = 0; j <= 2; j++) {
						if (input[i][j] == 0) {
							ans[1] = j;
						}
					}
					break;
				} else if (input[0][i] + input[1][i] + input[2][i] == 2) {
					ans[1] = i;
					for (int j = 0; j <= 2; j++) {
						if (input[j][i] == 0) {
							ans[0] = j;
						}
					}
					break;
				} else {
					i++;
				}
			}
		}

		return ans;
	}

	public int[] goDefend(int[][] input) {

		int[] ans = { 5, 0 };

		if (input[0][0] + input[1][1] + input[2][2] == -2
				|| input[0][2] + input[1][1] + input[2][0] == -2) {
			if (input[0][2] == 0) {
				ans[0] = 0;
				ans[1] = 2;
			} else if (input[2][0] == 0) {
				ans[0] = 2;
				ans[1] = 0;
			}
		} else {
			for (int i = 0; i <= 2;) {
				if (input[i][0] + input[i][1] + input[i][2] == -2) {
					ans[0] = i;
					for (int j = 0; j <= 2; j++) {
						if (input[i][j] == 0) {
							ans[1] = j;
						}
					}
					break;
				} else if (input[0][i] + input[1][i] + input[2][i] == -2) {
					ans[1] = i;
					for (int j = 0; j <= 2; j++) {
						if (input[j][i] == 0) {
							ans[0] = j;
						}
					}
					break;
				} else {
					i++;
				}
			}
		}

		return ans;
	}
}
