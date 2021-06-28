import java.util.*;
import java.io.*;
class Matrix3 {
	static int[][] x;
	static int[][] y;
	static int[][] z;

	static {
		x = new int[3][];
		y = new int[3][];
		z = new int[3][];
		for (int i = 0; i < 3; i++) {
			x[i] = new int[3];
			y[i] = new int[3];
			z[i] = new int[3];
		}
	}

	static void input(int[][] a) {
		int i = 0, j = 0;
		Scanner sc = new Scanner(System.in);
		while (i < 3) {
			while (i < 3) {
				System.out.println("Data[" + i + "][" + j + "]");
				try {
					a[i][j] = sc.nextInt();
				} catch (Exception e) {
				}
				j++;
			}
			i++;
		}
	}

	static String matrixToString(int[][] a) {
		String k = "\nMatrix\n:";
		int i = 0;
		while (i < 3) {
			k = k + Arrays.toString(a[i]) + "\n";
			i++;
		}
		return k;
	}

	static void add() {
		int i = 0, j = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
	}

	static void sub() {
		int i = 0, j = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				z[i][j] = x[i][j] - y[i][j];
			}
		}
	}

	static void mul() {
		int i = 0, j = 0, k = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				z[i][j] = 0;
				for (k = 0; k < 3; k++) {
					z[i][j] += (x[i][j] * y[i][j]);
				}
			}
		}
	}
		public static void main(String[]args)
		{
			int choice = 0;
			while (true) {
				System.out.println("Menue\n1:Data\n2:Data y\3:Add\n4:Sub\n5:Mul\n6:Output\n7:Exit");
				try {
					choice = System.in.read() - 48;
					System.in.skip(6);
				}
				catch(Exception e){}
				if (choice == 7)
					break;
				switch (choice) {
					case 1:
						input(x);
						break;
					case 2:
						input(y);
						break;
					case 3:
						add();
						break;
					case 4:
						sub();
						break;
					case 5:
						mul();
						break;
					case 6:
						String a = matrixToString(x) + matrixToString(y) + matrixToString(z);
						System.out.println(a);
				}
			}
		}
}
