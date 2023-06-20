import java.util.*;

public class loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the tenure in months: ");
        int tenure = scanner.nextInt();

        System.out.print("Enter the annual interest rate (%): ");
        double interestRate = scanner.nextDouble();

        double monthlyInterestRate = interestRate / 12 / 100;
        double emi = calculateEMI(principal, tenure, monthlyInterestRate);

        System.out.println("EMI: " + emi);
    }

    public static double calculateEMI(double principal, int tenure, double monthlyInterestRate) {
        double emi;
        double temp = Math.pow(1 + monthlyInterestRate, tenure);
        emi = (principal * monthlyInterestRate * temp) / (temp - 1);
        return emi;
    }
}
