import java.util.Scanner;

public class del {
    static double eps = 0.00000001;
    public static double fx(double x){

        return (Math.pow(x, 3) + 2 * Math.pow(x, 2) - 5 * x - 6);
    }
    public static void solveRec(double m, double n){
        System.out.println((m+n)/2);
        if (Math.abs(n-m) > eps){
            double x = (m+n)/2;
            if (fx(m)*fx(n) > 0){
                m=x;
            }
            else {
                n = x;
            }
            solveRec(m, n);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input m: ");
        double m = sc.nextDouble();
        System.out.println("Input n: ");
        double n = sc.nextDouble();
        solveRec(m, n);

    }
}
