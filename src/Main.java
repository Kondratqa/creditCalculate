public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        double loanAmount = 1000000; // сумма кредита
        double annualInterestRate = 9.99; // годовая процентная ставка
        int loanTermMonths = 12; // срок кредита в месяцах

        double monthlyPayment = creditPaymentService.calculateMonthlyPayment(loanAmount, annualInterestRate, loanTermMonths);

        System.out.println("Ежемесячный платеж: " + monthlyPayment);
    }
}
