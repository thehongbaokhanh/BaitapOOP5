import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class temperature {
    double K, F, C;
    temperature(double C, double F, double K){
        this.C = C;
        this.F = F;
        this.K = K;
    }

    public double CToF(double C){
        double F = 0;
        F = (C * 1.8) + 32;
        return F;
    }

    public double CToK(double C){
        double K = 0;
        K = C + 273.15;
        return K;
    }
    public double FToC(double F){
        double C = 0;
        C = (F -32) / 1.8;
        return C;
    }
    public double FToK(double F){
        double K = 0;
        K = ( ( F - 32 ) / 1.8 ) + 273.15;
        return K;
    }
    public double KToC(double K){
        double C = 0;
        C = K - 273.15;
        return C;
    }
    public double KToF(double K){
        return (K - 273.15) * 1.8  + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check , check2;
        double C = 0, F = 0, K = 0;
        System.out.println("Temperature");
        System.out.println("----------------------------");
        System.out.println("Menu");
        System.out.println("1. To calculate with *C");
        System.out.println("2. To calculate with *F");
        System.out.println("3. To calculate with *K");
        System.out.print("enter the choose: ");
        check = scanner.nextInt();
        while (check <= 0 || check > 3) {
            System.out.println("Don't have the choice " + check + ". Please choose again!");
            System.out.println("Temperature");
            System.out.println("----------------------------");
            System.out.println("Menu");
            System.out.println("1. To calculate with *C");
            System.out.println("2. To calculate with *F");
            System.out.println("3. To calculate with *K");
            System.out.print("enter the choose: ");
            check = new Scanner(System.in).nextInt();
        }
        switch (check){
            case 1:
                System.out.print("Then enter your temperature *C: ");
                C = new Scanner(System.in).nextInt();
            case 2:
                System.out.print("Then enter your temperature *F: ");
                F = new Scanner(System.in).nextInt();
            case 3:
                System.out.print("Then enter your temperature *K: ");
                K = new Scanner(System.in).nextInt();
        }
        temperature temperature = new temperature(C, F, K);
        System.out.println("Now you need to choose what type do you want to change: ");
        System.out.println("1. To change *C to *F");
        System.out.println("2. To change *C to *F");
        System.out.println("3. To change *F to *C");
        System.out.println("4. To change *F to *K");
        System.out.println("5. To change *K to *C");
        System.out.println("6. To change *K to *F");
        System.out.print("Please choose your choice: ");
        check2 = new Scanner(System.in).nextInt();
        while (check2 < 1 || check2 > 6){
            System.out.println("This choice it not work with this app; please enter again.");
            System.out.println("Now you need to choose what type do you want to change: ");
            System.out.println("1. To change *C to *F");
            System.out.println("2. To change *C to *K");
            System.out.println("3. To change *F to *C");
            System.out.println("4. To change *F to *K");
            System.out.println("5. To change *K to *C");
            System.out.println("6. To change *K to *F");
            System.out.print("Please choose your choice: ");
            check2 = new Scanner(System.in).nextInt();
        }
        switch (check2){
            case 1:
                System.out.println("So your temperture you enter it " + C +" *C and after change you got" + temperature.CToF(C) + " *F");
                break;
            case 2:
                System.out.println("So your temperture you enter it " + C +" *C and after change you got" + temperature.CToK(C) + " *K");
                break;
            case 3:
                System.out.println("So your temperture you enter it " + F +" *F and after change you got" + temperature.FToC(F) + " *C");
                break;
            case 4:
                System.out.println("So your temperture you enter it " + F +" *F and after change you got" + temperature.FToK(F) + " *K");
                break;
            case 5:
                System.out.println("So your temperture you enter it " + K +" *K and after change you got" + temperature.KToC(K) + " *C");
                break;
            case 6:
                System.out.println("So your temperture you enter it " + K +" *K and after change you got" + temperature.KToF(K) + " *F");
                break;
        }
    }
}
