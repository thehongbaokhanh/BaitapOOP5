import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        quadraticEquation.handleQuadraticEquation(a ,b ,c);
        System.out.println(quadraticEquation.getDiscriminant(a,b,c));
    }

    public double getDiscriminant(double a,double b,double c){
        double Delta = (b * b) - (4 * a * c);
        return Delta;
    }

    public double getRoot1(double a, double b, double c){
        return ((-b + Math.sqrt(getDiscriminant(a,b,c) )) / (2*a));
    }
    public double getRoot2(double a, double b, double c){
        return ((-b - Math.sqrt(getDiscriminant(a,b,c))) / (2*a) );
    }
    public void handleQuadraticEquation(double a, double b, double c) {
        double delta = getDiscriminant(a, b, c);
        double doubleRoot = -b / (2 * a);
        if (delta < 0) {
            System.out.println("The quadratic equation don't have root.");
        }
        if (delta == 0) {
            System.out.println("The quadratic equation have double root; " + doubleRoot);
        }
        if (delta > 0){
            System.out.println("The quadrtic equation have 2 root: " + getRoot1(a,b,c) + "; " + getRoot2(a,b,c) + ".");
        }
    }
}
