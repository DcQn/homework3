package be6_complexity_hw7;

public class FarthestDistance {

	public static int farthestDistance(int[] array) {

		int first = 0;
		int last = array.length - 1;

		while (first < last) {
			if (array[first] == array[last])
				first++;
			else
				break;
		}

		int a = last - first;

		first = 0;
		last = array.length - 1;

		while (first < last) {
			if (array[first] == array[last])
				last--;
			else
				break;
		}

		int b = last - first;

		return Math.max(a, b);
	}

	public static void main(String[] args) {
		int[] A = { 4, 6, 2, 2, 6, 6, 4 };
		System.out.println(farthestDistance(A));
	}
}
