package com.demonstration.banks;

import com.demonstration.model.BankCustomer;

final public class ICICIBank extends Bank{

    public ICICIBank(){
        name = "ICICI Bank";
        interestRate = 11.5f;
    }

    public ICICIBank(float interestRate){
        name = "ICICI Bank";
        this.interestRate = interestRate;
    }

    @Override
    void employeeHiring() {
        System.out.println("Step1 exam");
        System.out.println("Step2 interview");
        System.out.println("Step3 result");
        System.out.println("Step4 Appointment");
        System.out.println("Add selected employee into list of bankEmployees");
    }

    @Override
    public void balanceDeposit(int accountNo,float amount) {
        System.out.println("By Cash");
        System.out.println("By ATM swap");
        System.out.println("By net banking");

        try{
            BankCustomer bankCustomer = bankCustomers.get(accountNo-1);
            bankCustomer.setBalance(bankCustomer.getBalance()+amount);
            System.out.println("deposite amount "+amount+" successful");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Account does not exists");
        }

    }
}
