import java.util.Scanner;

public class TwoPermutations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Read the value of n
			long a = scanner.nextLong(); // Read the value of a
			long b = scanner.nextLong(); // Read the value of b

			// Check if the sum of a and b plus 2 is less than or equal to n
			// or if both a and b are equal to n
			// If either condition is true, it is possible to form the permutations
			if (a + b + 2 <= n || (a == b && a == n)) {
				System.out.println("Yes"); // Output "Yes" if the permutations can be formed
			} else {
				System.out.println("No"); // Output "No" if the permutations cannot be formed
			}
		}
		scanner.close();
	}
}

// Time Complexity (TC): O(1)
// Space Complexity (SC): O(1)
