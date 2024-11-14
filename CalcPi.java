/// Computes an approximation of PI.
public class CalcPi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0;
        double a = 1;
        int d = 3;
        boolean even = true;

        for (i = 0; i < n; i++) {
            if (even) {
                a -= 1.0 / d;
            } else {
                a += 1.0 / d;
            }
            d += 2;
            even = !even;
        }

        double b = a * 4.0;
        System.out.println("pi according to Java: 3.141592653589793");
        System.out.println("pi, approximated:     " + b);
    }
}
