//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000; //сумма кредита
        double percent = 9.99; //процентная ставка
        int term = 1;//срок страхования

        double payment = (int) service.calculate(percent, amount, term);
        System.out.println("Ежемесячный платеж по кредиту сроком на 1 год составит " + payment + " рублей");

        double payment1 = (int) service.calculate(percent, amount, term);
        System.out.println("Ежемесячный платеж по кредиту сроком на 2 года составит " + payment1 + " рублей");

        double payment2 = (int) service.calculate(percent, amount, term);
        System.out.println("Ежемесячный платеж по кредиту сроком на 3 года составит " + payment2 + " рублей");

    }


}