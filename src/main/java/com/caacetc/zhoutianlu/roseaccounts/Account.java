package com.caacetc.zhoutianlu.roseaccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class Account {
    private List<AccountRecord> accountRecords= new ArrayList();

    public void add(AccountRecord accountRecord){
        accountRecords.add(accountRecord);
    }

    public void addAll(List<AccountRecord> accountList){
        accountRecords.addAll(accountList);
    }

    public abstract BigDecimal profitByMonth(int date);

    public abstract BigDecimal totalIncomeByMonth(int date);

    public abstract BigDecimal totalSpendingByMonth(int date);

    public List<AccountRecord> allIncomeRecords() {
        return accountRecordsBy(accountRecord -> accountRecord.isIncome());
    }

    public List<AccountRecord> allSpendingRecords() {
        return accountRecordsBy(accountRecord -> accountRecord.isSpending());
    }

    public List<AccountRecord> accountRecordsByMonth(int date) {
        return accountRecords.stream().filter(M ->M.getRecordTime().getMonthValue()==date).collect(Collectors.toList());
    }

    private List<AccountRecord> accountRecordsBy(Predicate<AccountRecord> predicate) {
        if (predicate == null) {
            System.out.print("*** The Account have No Record ***");
        }
        return accountRecords.stream().filter(predicate).collect(Collectors.toList());
    }
}
