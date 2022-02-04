public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // 1 год
        float MonthPayment1 = (float) service.calculate(1_000_000, 9.99f, 1);
        System.out.println("Ежемесячный платеж составит " + MonthPayment1 + " рублей");

        // 2 года
        float MonthPayment2 = (float) service.calculate(1_000_000, 9.99f, 2);
        System.out.println("Ежемесячный платеж составит " + MonthPayment2 + " рублей");

        // 3 года
        float MonthPayment3 = (float) service.calculate(1_000_000, 9.99f, 3);
        System.out.println("Ежемесячный платеж составит " + MonthPayment3 + " рублей");


    }
}
