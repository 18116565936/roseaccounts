package com.caacetc.zhoutianlu.roseaccounts;

import java.util.ArrayList;
import java.util.List;

public class Calculations {
    private static List<AccountRecord> accountRecords= new ArrayList();

    public static void add(AccountRecord accountRecord){
        accountRecords.add(accountRecord);
    }

    public static void addAll(List<AccountRecord> accountList){
        accountRecords.addAll(accountList);
    }

    public static float totalSpending(int month) {
        float sum = 0f;
        for (AccountRecord accountRecord : accountRecords) {
            if ((accountRecord.getRecordTime().getMonthValue() == month) &&( accountRecord.getAccountType() == AccountType.Spending)) {
                sum += accountRecord.getAmount();
            }
        }
        return sum;
    }

    public static float totalIncome(int month) {
        float sum = 0f;
        for (AccountRecord accountRecord : accountRecords) {
            if (accountRecord.getRecordTime().getMonthValue() == month && accountRecord.getAccountType()==AccountType.Income ) {
                sum += accountRecord.getAmount();
            }
        }
        return sum;
    }

    public static float Profit(int month) {
        float sum = 0f;
        sum = totalIncome(month) - totalSpending(month);
        return sum;
    }

    public static void showMessage(int month) {
        for (AccountRecord accountRecord : accountRecords) {
            if (accountRecord.getRecordTime().getMonthValue() == month) {
                System.out.print(accountRecord);
            }
        }
    }
}


