import java.util.*;
import java.lang.Math;


public class Loan
{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan()
    {
        this.annualInterestRate = 2.5 / 100;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date();

    }

    public Loan(double interestRate, int numOfYears, double loan)
    {
        this.annualInterestRate = interestRate / 100;
        this.numberOfYears = numOfYears;
        this.loanAmount = loan;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears)
    {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment()
    {
        return (loanAmount*(annualInterestRate/12) )/( 1 - (1/Math.pow( 1+ (annualInterestRate/12) ,numberOfYears * 12 ) ));
    }

    public double getTotalPayment()
    {
      return getMonthlyPayment() * numberOfYears * 12;
    }

}

class Main2
{
    public static void main(String[] args)

    {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example, 8.25:");
        double annualinterest = newScanner.nextDouble();
        System.out.println("Enter number of years as an integer:");
        int years = newScanner.nextInt();
        System.out.println("Enter loan amount, for example, 120000. 95:");
        double loanamt = newScanner.nextDouble();

        Loan imagineborrowingmoney = new Loan(annualinterest,years,loanamt);
        System.out.println("The loan was created.");
        System.out.println(String.format("The monthly payment is %.2f",imagineborrowingmoney.getMonthlyPayment()));
        System.out.println(String.format("The total payment is %.2f",imagineborrowingmoney.getTotalPayment()));

        newScanner.close();
    }

}
