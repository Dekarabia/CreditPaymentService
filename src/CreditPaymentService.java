public class CreditPaymentService {

    public double calculate(double percent, int amount, int term) {

        double percentM = percent / 100 / 12; // ежемесячная процентная ставка
        double ratio = ((percentM * Math.pow((1 + percentM), term * 12)) / (Math.pow((1 + percentM), term * 12) - 1));
        double payment = amount * ratio;
        return (int) payment;


    }
}






