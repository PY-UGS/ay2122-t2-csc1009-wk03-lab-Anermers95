import java.util.Date;

public class Loan{
    private double annualInterestRate, loanAmount;
    private int numberOfYears;
    private Date date;

    Loan()
    {
        this.annualInterestRate = 0;
        this.loanAmount = 0;
        this.numberOfYears = 0;
        date = new Date();
    }

    Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        date = new Date();
        
    }

    double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }

    int getNumberOfYears()
    {
        return this.numberOfYears;
    }

    double getLoanAmount()
    {
        return this.loanAmount;
    }

    double getMonthlyPayment()
    {
        double monthlyInterestRate = (getAnnualInterestRate()/100)/12;

        double monthlyPayment = (getLoanAmount() * monthlyInterestRate)/
                                (1 - (1/Math.pow(1+monthlyInterestRate, getNumberOfYears()*12)));
        return monthlyPayment;
    }

    double getTotalPayment()
    {
        return getMonthlyPayment() * getNumberOfYears() * 12;
    }

    Date getLoanDate()
    {
        return this.date;
    }
    
    void SetAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    void SetNumberOfYears(int numberOfYears)
    {
        this.numberOfYears = numberOfYears;
    }

    void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }
    


}