
public class Factorial {
    public static int fac(int n) {
        int result = 1;
        for (int x = 2; x<=n; x++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
