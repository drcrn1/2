import java.util.Scanner;

public class newton {
    static double eps = 0.00000001;
    public static double fx(double x){

        return (Math.pow(x, 3) + 2 * Math.pow(x, 2) - 5 * x - 6);
    }
    public static double dfx(double x) {

        return (3 * x * x + 4 * x - 5);
    }
    public static void solve(double x0){
        double x1 = x0 - fx(x0)/dfx(x0);
        System.out.println(x1);
        x1 = x0 - fx(x0)/dfx(x0);
        if (Math.abs(x1-x0)>eps){
            x0 = x1;
            x1 = x0 - fx(x0)/dfx(x0);
            solve(x0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x0");
        double x0 = sc.nextDouble();
        solve(x0);
    }
}
