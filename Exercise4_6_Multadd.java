public class Exercise4_6_Multadd {

    public static void main(String[] args) {
        // Test: 1 * 2 + 3
        System.out.println("Multadd(1, 2, 3) = " + multadd(1.0, 2.0, 3.0));

        // Bölüm 1: sin(pi/4) + cos(pi/4)/2
        double a1 = 1.0;
        double b1 = Math.sin(Math.PI / 4);
        double c1 = Math.cos(Math.PI / 4) / 2;
        System.out.println("sin(pi/4) + ... = " + multadd(a1, b1, c1));

        // Bölüm 2: log(10) + log(20)
        double a2 = 1.0;
        double b2 = Math.log(10);
        double c2 = Math.log(20);
        System.out.println("log(10) + log(20) = " + multadd(a2, b2, c2));

        // Bölüm 3: expSum
        System.out.println("expSum(2.0) = " + expSum(2.0));
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        // x * e^-x + sqrt(1 - e^-x)
        double eNegX = Math.exp(-x);
        return multadd(x, eNegX, Math.sqrt(1 - eNegX));
    }
}
