//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        //percent - ежегодный процент
        //amount - сумма
        //term - срок кредитования

        double payment = (int) service.calculate(9.99, 1000000, 12);
        System.out.println("Ежемесячный платеж по кредиту сроком на 1 год составит " + payment + " рублей");

        double payment1 = (int) service.calculate(9.99, 1000000, 24);
        System.out.println("Ежемесячный платеж по кредиту сроком на 2 года составит " + payment1 + " рублей");

        double payment2 = (int) service.calculate(9.99, 1000000, 36);
        System.out.println("Ежемесячный платеж по кредиту сроком на 3 года составит " + payment2 + " рублей");

    }


}