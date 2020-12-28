package dev.shadmanahmed;

public class Account {
    private String number ;
    private double balance ;
    private String customerName;
    private String email ;
    private String phoneNumber ;

    public Account( String number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println(customerName);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposited " + depositAmount + " Total Balance: " + this.balance);
    }

    public void withdraw(double withdrawlAmount) {
        if (this.balance - withdrawlAmount < 0 ){
            System.out.println("Insufficient Funds " + this.balance);
        }else {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrew " + withdrawlAmount + " Balance " + this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
