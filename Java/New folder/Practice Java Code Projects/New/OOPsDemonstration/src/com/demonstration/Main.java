package com.demonstration;

import com.demonstration.banks.ICICIBank;
import com.demonstration.banks.SBIBank;
import com.demonstration.banks.SBIBankBranch;

public class Main {

    public static void main(String[] args) {

        SBIBank obj = new SBIBank();
        //SBIBank obj = new SBIBank(12.5f);

        System.out.println("Bank Name: "+obj.getName());
        System.out.println("Bank Interest Rate: "+obj.getInterestRate());
        obj.customerAccountOpen("cust1name",25,"male","cust1userID","cust1password");
        obj.checkBalance(1,"cust1userID","cust1password");
        obj.balanceDeposit(1,1000f);
        obj.checkBalance(1,"cust1userID","cust1password");
        obj.balanceWithdraw(1,"cust1userID","cust1password",500f);
        obj.checkBalance(1,"cust1userID","cust1password");


        System.out.println("\n\n");
        SBIBankBranch obj1 = new SBIBankBranch();
        //SBIBankBranch obj1 = new SBIBankBranch();

        System.out.println("Bank branch Name: "+obj1.getBranch());

        System.out.println("Bank Name: "+obj1.getName());
        System.out.println("Bank Interest Rate: "+obj1.getInterestRate());
        obj1.customerAccountOpen("cust1name",25,"male","cust1userID","cust1password");
        obj1.checkBalance(1,"cust1userID","cust1password");
        obj1.balanceDeposit(1,1000f);
        obj1.checkBalance(1,"cust1userID","cust1password");
        obj1.balanceWithdraw(1,"cust1userID","cust1password",500f);
        obj1.checkBalance(1,"cust1userID","cust1password");



        System.out.println("\n\n");
        ICICIBank obj2 = new ICICIBank();
        //ICICIBank obj2 = new ICICIBank(13.5f);

        System.out.println("Bank Name: "+obj2.getName());
        System.out.println("Bank Interest Rate: "+obj2.getInterestRate());
        obj2.customerAccountOpen("cust1name",25,"male","cust1userID","cust1password");
        obj2.checkBalance(1,"cust1userID","cust1password");
        obj2.balanceDeposit(1,1000f);
        obj2.checkBalance(1,"cust1userID","cust1password");
        obj2.balanceWithdraw(1,"cust1userID","cust1password",500f);
        obj2.checkBalance(1,"cust1userID","cust1password");



    }
}
