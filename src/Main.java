public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int accountRefill = 1190;
        int bonus;

        if (accountRefill > 1000) {
            bonus = accountRefill / 100;
        } else {
            bonus = 0;
        }

        int newAccountBalance = accountBalance + accountRefill + bonus;

        System.out.println("Бонус равен " + bonus + " рублям, итоговая сумма на счету клиента — " + newAccountBalance + " рублей");
    }
}