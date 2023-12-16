package com.demonstration.banks;

import com.demonstration.model.BankCustomer;
import com.demonstration.model.BankEmployee;

import java.util.ArrayList;

public abstract class Bank {

    protected String name;
    protected float interestRate;
    protected ArrayList<BankCustomer> bankCustomers = new ArrayList<>();
    protected ArrayList<BankEmployee> bankEmployees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void customerAccountOpen(String name, int age, String gender, String userId, String password){
        BankCustomer bankCustomer = new BankCustomer(name,age,gender,userId,password);
        bankCustomer.setAccountNo(bankCustomers.size()+1);
        bankCustomer.setBalance(0f);
        bankCustomer.setAccountStatus("Active");
        bankCustomers.add(bankCustomer);
        System.out.println("Bank account of "+bankCustomer.name + " open");
    }

    abstract public void balanceDeposit(int accountNo,float amount);
    abstract void employeeHiring();


    public void balanceWithdraw(int accountNo,String userId,String password, float amount ){
        try{
            BankCustomer bankCustomer = bankCustomers.get(accountNo-1);
            if((bankCustomer.getUserId().equals(userId)) & (bankCustomer.getPassword().equals(password))){
                bankCustomer.setBalance(bankCustomer.getBalance()-amount);
                System.out.println("Withdraw amount "+amount+" successful");
            }else {
                System.out.println("Credentials are not valid");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Account does not exists");
        }
    }

    public void checkBalance(int accountNo,String userId,String password){
        try{
            BankCustomer bankCustomer = bankCustomers.get(accountNo-1);
            if((bankCustomer.getUserId().equals(userId)) & (bankCustomer.getPassword().equals(password))){

                System.out.println("Available balance = "+bankCustomer.getBalance());
            }else {
                System.out.println("Credentials are not valid");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Account does not exists");
        }
    }



}

