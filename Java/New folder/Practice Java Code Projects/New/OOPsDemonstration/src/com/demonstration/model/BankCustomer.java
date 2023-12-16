package com.demonstration.model;

public class BankCustomer extends Person{
    private int accountNo;
    private String userId;
    private String password;
    private float balance;
    private String accountStatus;

    public BankCustomer(){

    }

    public BankCustomer(String name, int age, String gender, String userId, String password) {
        super(name, age, gender);
        this.userId = userId;
        this.password = password;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}
