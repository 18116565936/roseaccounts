package com.caacetc.zhoutianlu.roseaccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RegularAccount extends Account{
    private List<AccountRecord> accountRecords= new ArrayList();

    @Override
    public  BigDecimal profitByMonth(int date){
        return totalIncomeByMonth(date).subtract(totalSpendingByMonth(date));
    }

    @Override
    public  BigDecimal totalIncomeByMonth(int date){
        return calculateBy(preMonth ->preMonth.getRecordTime().getMonthValue() == date,
                         preAccountType ->preAccountType.isIncome());
    }

    @Override
    public BigDecimal totalSpendingByMonth(int date){
        return calculateBy(preMonth ->preMonth.getRecordTime().getMonthValue() == date,
                          preAccountType ->preAccountType.isSpending());
    }

    public void showMessage(int month) {
        for (AccountRecord accountRecord : accountRecords) {
            if (accountRecord.getRecordTime().getMonthValue() == month) {
                System.out.print(accountRecord);
            }
        }
    }

    private BigDecimal calculateBy(Predicate<AccountRecord> predicateMonth, Predicate<AccountRecord> predicateAccountType) {
        if (predicateMonth == null && predicateAccountType == null) {
            System.out.print("*** There have no accountRecord in this month  ***");
        }
        return accountRecords.stream()
                .filter(predicateMonth)
                .filter(predicateAccountType)
                .map(obj->obj.getAmount())
                .reduce(BigDecimal.ZERO,(a,b)->a.add(b));
    }
}
