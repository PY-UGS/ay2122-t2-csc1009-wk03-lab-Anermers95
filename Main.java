import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Loan loan = new Loan();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        loan.SetAnnualInterestRate(sc.nextDouble()); 

        System.out.print("Enter number of years as integer: ");
        loan.SetNumberOfYears(sc.nextInt());

        System.out.print("Enter Loan amount: ");
        loan.setLoanAmount(sc.nextDouble());
        
        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.printf("The monthly payment is %.2f\n", loan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f", loan.getTotalPayment());

        sc.close();
    }
}
