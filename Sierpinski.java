/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		double x1 = 0;
        double x2 = 0.5;
        double x3 = 1;
        double y1 = 0;
        double y2 = Math.sqrt(1 - 0.25);
        double y3 = 0;
        StdDraw.line(x3, y3, x1, y1);
        StdDraw.line(x2, y2, x1, y1);
        StdDraw.line(x3, y3, x2, y2);
        sierpinski(n - 1, x1, x2, x3, y1, y2, y3);
	}
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if (n == 0) {
            return;
        }
        double x12 = (x1 + x2) / 2;
        double x13 = (x1 + x3) / 2;
        double x23 = (x2 + x3) / 2;

        double y12 = (y1 + y2) / 2;
        double y13 = (y1 + y3) / 2;
        double y23 = (y2 + y3) / 2;

        StdDraw.line(x12, y12, x23, y23);
        StdDraw.line(x13, y13, x12, y12);
        StdDraw.line(x23, y23, x13, y13);

        sierpinski(n - 1, x1, x12, x13, y1, y12, y13);
        sierpinski(n - 1, x2, x12, x23, y2, y12, y23);
        sierpinski(n - 1, x3, x23, x13, y3, y23, y13);

    }
	  }

