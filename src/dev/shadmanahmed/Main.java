package dev.shadmanahmed;

public class Main {

    public static void main(String[] args) {
	Account bobsAccount = new Account("2324466", 1000, "Bob", "bob@email.com", "2126667777" );

        System.out.println(bobsAccount.getBalance());

	bobsAccount.deposit(500);
	bobsAccount.withdraw(100);

	VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

    VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

    VipCustomer person3 = new VipCustomer("Tim", 30000.00, "tim@email.com");
        System.out.println(person3.getName() + person3.getCreditLimit() + person3.getEmail());



    }
}
