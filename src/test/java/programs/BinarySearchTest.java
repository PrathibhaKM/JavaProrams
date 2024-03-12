package programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BinarySearchTest {
	@Test
	public void binaryTest() {
		int a[] = { 10, 20, 50, 40, 44 };
		Arrays.sort(a);
		int low = 0;
		int high = a.length - 1;
		int key = 49;
		
		int c = 0;

		while (low <= high)

		{
			int mid = (low + high) / 2;

			if (a[mid] == key) {
				c++;
				break;

			} else if (key < a[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}

		if (c == 1) {
			System.out.println("key found");
		} else
			System.out.println("key not found");
	}

}