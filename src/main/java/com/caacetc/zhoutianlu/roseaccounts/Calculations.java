package com.caacetc.zhoutianlu.roseaccounts;

import java.util.ArrayList;
import java.util.List;

public class Calculations {


    public static float totalSpending(int month, List<AccountItem> accountList) {
        float sum = 0f;
        for (AccountItem accountItem : accountList) {
            if ((accountItem.getOccuredTime().getMonthValue() == month) &&( accountItem.getCategory() == "Spending")) {
                sum += accountItem.getAmount();
            }
        }
        return sum;
    }

    public static float totalIncome(int month, List<AccountItem> accountList) {
        float sum = 0f;
        for (AccountItem accountItem : accountList) {
            if (accountItem.getOccuredTime().getMonthValue() == month && accountItem.getCategory() == "Income") {
                sum += accountItem.getAmount();
            }
        }
        return sum;
    }

    public static float Profit(int month, List<AccountItem> accountList) {
        float sum = 0f;
        for (AccountItem accountItem : accountList) {
            if (accountItem.getOccuredTime().getMonthValue() == month && accountItem.getCategory() == "Income") {
                sum += accountItem.getAmount();
            }
        }
        for (AccountItem accountItem : accountList) {
            if (accountItem.getOccuredTime().getMonthValue() == month && accountItem.getCategory() == "Spending") {
                sum -= accountItem.getAmount();
            }
        }
        return sum;
    }

    public static void showMessage(int month, List<AccountItem> accountList) {
        for (AccountItem accountItem : accountList) {
            if (accountItem.getOccuredTime().getMonthValue() == month) {
                System.out.print(accountItem);
            }
        }
    }
}


