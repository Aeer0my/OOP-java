package Practice1;

public class AddingInterest {
    public static void main(String[] args){

        double old_balance = 100000;
        double interest_value = 0.07;

        double new_balance = old_balance+(old_balance * interest_value);

        System.out.println("Old balance: " + old_balance + " KZT" + "\nInterest: 7%" + "\nNew balance: " + new_balance + " KZT");

    }
}
