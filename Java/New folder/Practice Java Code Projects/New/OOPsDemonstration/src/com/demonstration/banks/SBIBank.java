package com.demonstration.banks;

import com.demonstration.model.BankCustomer;

public class SBIBank extends Bank{


    public SBIBank(){
        this.name = "SBI Bank";
        this.interestRate = 10.5f;
    }

    public SBIBank(float interestRate){
        this.name = "SBI Bank";
        this.interestRate = interestRate;
    }

    @Override
    final void employeeHiring() {
        System.out.println("Step1 exam1");
        System.out.println("Step2 exam2");
        System.out.println("Step3 interview1");
        System.out.println("Step4 interview4");
        System.out.println("Step5 result");
        System.out.println("Step6 Appoinment");
        System.out.println("Add selected employee into list of bankEmployees");
    }

    @Override
    public void balanceDeposit(int accountNo,float amount) {
        System.out.println("By Cash");
        System.out.println("By ATM swap");
        System.out.println("By Deposit Machine");

        try{
            BankCustomer bankCustomer = bankCustomers.get(accountNo-1);
            bankCustomer.setBalance(bankCustomer.getBalance()+amount);
            System.out.println("deposite amount "+amount+" successful");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Account does not exists");
        }

    }
}
