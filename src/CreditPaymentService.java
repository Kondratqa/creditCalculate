public class CreditPaymentService {
    public double calculateMonthlyPayment(double loanAmount, double annualInterestRate, int loanTermMonths) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double monthlyPayment = loanAmount * (monthlyInterestRate + monthlyInterestRate /
                (Math.pow(1 + monthlyInterestRate, loanTermMonths) - 1));
        return monthlyPayment;
    }
}