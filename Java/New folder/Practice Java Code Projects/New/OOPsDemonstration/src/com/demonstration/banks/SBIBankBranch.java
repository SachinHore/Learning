package com.demonstration.banks;

import com.demonstration.model.BankCustomer;

final public class SBIBankBranch extends SBIBank{
    private String branch;

    public SBIBankBranch(){
        branch = "SBI bank branch";
    }

    public SBIBankBranch(String branch, float interestRate){
        this.branch = branch;
        this.interestRate = interestRate;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public void balanceDeposit(int accountNo,float amount) {
        System.out.println("By Cash");
        System.out.println("By ATM swap");
        try{
            BankCustomer bankCustomer = bankCustomers.get(accountNo-1);
            bankCustomer.setBalance(bankCustomer.getBalance()+amount);
            System.out.println("deposite amount "+amount+" successful");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Account does not exists");
        }
    }
}
