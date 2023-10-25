package BasicProgram;

public class task1 {
	// add 2 matricies
	public static int[][] add(int[][] a, int[][] b) {
		int n1 = a.length;
		int n2 = a[0].length;
		int[][] result = new int[n1][n2];

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				result[i][j] = a[i][j] + b[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		return result;
	}

	// subtract 2 matricies
	public static int[][] subtract(int[][] a, int[][] b) {
		int n1 = a.length;
		int n2 = a[0].length;
		int[][] result = new int[n1][n2];

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				result[i][j] = a[i][j] - b[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		return result;

	}

	// multiply 2 matricies
	public static int[][] multiply(int[][] a, int[][] b) {
		int n1 = a.length;
		int n2 = b[0].length;
		int[][] result = new int[n1][n2];
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				for (int k = 0; k < a[0].length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		return result;
	}

	// tranpose a matrix
	public static int[][] transpose(int[][] a) {
		int n1 = a.length;
		int n2 = a[0].length;
		int result[][] = new int[n2][n1];
		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < n1; j++) {
				result[i][j] = a[j][i];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] a = { { 7, 2 }, { 5, 3 } };
		int[][] b = { { 2, 1 }, { 3, 1 } };

		int[][] a1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] b1 = { { 1, 3, 5 }, { 2, 4, 6 } };
		add(a, b);
		System.out.println("---------------------");
		subtract(a, b);
		System.out.println("---------------------");
		multiply(a, b);
		System.out.println("---------------------");
		transpose(a1);
		System.out.println("b1 la: ");
		transpose(b1);
	}
}
