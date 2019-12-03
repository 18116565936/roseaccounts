package com.caacetc.zhoutianlu.roseaccounts.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class Account {
    protected List<AccountRecord> accountRecords= new ArrayList();

    public void add(AccountRecord accountRecord){
        accountRecords.add(accountRecord);
    }

    public void addAll(List<AccountRecord> accountList){
        accountRecords.addAll(accountList);
    }

    public abstract BigDecimal profitByMonth(int month);

    public abstract BigDecimal totalIncomeByMonth(int month);

    public abstract BigDecimal totalSpendingByMonth(int month);

    public List<AccountRecord> allIncomeRecords() {
        return accountRecordsBy(accountRecord -> accountRecord.isIncome());
    }

    public List<AccountRecord> allSpendingRecords() {
        return accountRecordsBy(accountRecord -> accountRecord.isSpending());
    }

    public List<AccountRecord> accountRecordsByMonth(int month) {
        return accountRecordsBy(M ->M.getRecordTime().getMonthValue()==month);
    }

    private List<AccountRecord> accountRecordsBy(Predicate<AccountRecord> predicate) {
        if (predicate == null) {
            System.out.print("*** The Account have No Record ***");
        }
        return accountRecords.stream().filter(predicate).collect(Collectors.toList());
    }
}
