
public class MergeSortClass {

	static int[] numArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

	public static void main(String[] args) {

		mergesort(0, numArray.length - 1);

	}

	private static void mergesort(int start, int end) {
		if (start >= end)
			return;

		int mid = (start + end) / 2;
		mergesort(start, mid);
		mergesort(mid + 1, end);
		merge(start, mid, end);

	}

	private static void merge(int start, int mid, int end) {
		int[] firstPartArray = new int[mid - start + 1];
		int index = 0;
		for (int i = start; i <= mid; i++) {
			firstPartArray[index++] = numArray[i];
		}
		index = 0;
		int[] secondPartArray = new int[end - mid];
		for (int i = mid + 1; i < end; i++) {
			secondPartArray[index++] = numArray[i];
		}

		index = start;
		for (int i = 0, j = 0; i < firstPartArray.length && j < secondPartArray.length;) {
			if (firstPartArray[i] < secondPartArray[j]) {
				numArray[index++] = firstPartArray[i++];
			} else {
				numArray[index++] = secondPartArray[j++];
			}
		}

	}

}
