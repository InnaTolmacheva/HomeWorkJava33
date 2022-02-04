public class CreditPaymentService {
    public double calculate(int SumCredit, float percent, int year) {

        float MonthPayment = SumCredit * (percent / 100 / 12) / (1 - (1 / (float) Math.pow(1 + percent / 100 / 12, year * 12)));

        return (int) MonthPayment;

    }


}
