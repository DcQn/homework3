package be6_complexity_hw7;

import java.util.Arrays;

public class EarliestValidTime {
	public static String solution(int A, int B, int C, int D, int E, int F) {
		int[] array = { A, B, C, D, E, F };
		Arrays.sort(array);
		if (array[4] < 6) {
			if (10 * array[0] + array[1] < 24)
				return "" + array[0] + array[1] + ":" + array[2] + array[3] + ":" + array[4] + array[5];
			else
				return "impossible";
		} else if (array[3] < 6) {
			if (10 * array[0] + array[1] < 24)
				return "" + array[0] + array[1] + ":" + array[2] + array[4] + ":" + array[3] + array[5];
			else
				return "impossible";
		} else if (array[2] < 6) {
			if (10 * array[0] + array[3] < 24)
				return "" + array[0] + array[3] + ":" + array[1] + array[4] + ":" + array[2] + array[5];
			else
				return "impossible";
		} else {
			return "impossible";
		}
	}

	public static void main(String[] args) {
		System.out.println(solution(1, 8, 3, 2, 6, 4));
	}
}
