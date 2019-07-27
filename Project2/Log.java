package project6011;

import java.util.Scanner;

public class Log {
	/**
	 * The following function is used to implement the Logarithmic function Use
	 * Taylor's expansion
	 * 
	 * @param a
	 * @return
	 */
	public static double Mylog(double a) {
		double r = 0;
		try {
			int N = 100000;
			int k, nk;
			double x, y;
			x = (a - 1) / (a + 1);
			nk = 2 * N + 1;
			y = 1.0 / nk;
			for (k = N; k > 0; k--) {
				nk = nk - 2;
				y = 1.0 / nk + x * x * y;
				r = 2.0 * x * y;
			}

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		return r;
	}

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the base");
			double q = sc.nextDouble();
			try {
				if (q <= 0 || q == 1) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Please enter the base which is >0 and not equal 1");
				continue;
			}
			System.out.println("Please enter the x");
			double w = sc.nextDouble();
			try {
				while (w <= 0) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Please enter the x which is >0");
				System.out.println("Please enter the x");
				w = sc.nextInt();
			}
			String result = String.format("%.5f", Mylog(w) / Mylog(q));
			System.out.println("result=" + result);
			sc.close();
			break;
		}
	}
}
