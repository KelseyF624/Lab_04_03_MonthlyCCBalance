//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthyBalance {
    public static void main(String[] args) {
        int CREDIT_BALANCE = 5000;
        double interestRate = .17;
        double firstMonth = CREDIT_BALANCE + (CREDIT_BALANCE * interestRate);
        double secondMonth = firstMonth + (firstMonth * interestRate);
        System.out.println("Your interest due after one month is " + firstMonth +" dollars.");
        System.out.println ("Your interest due after two months is " + secondMonth +" dollars.");
        }
    }