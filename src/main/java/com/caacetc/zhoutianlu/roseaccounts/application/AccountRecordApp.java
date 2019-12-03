package com.caacetc.zhoutianlu.roseaccounts.application;


import com.caacetc.zhoutianlu.roseaccounts.entities.Account;
import com.caacetc.zhoutianlu.roseaccounts.entities.AccountRecord;
import com.caacetc.zhoutianlu.roseaccounts.entities.AccountRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

@Repository
public class AccountRecordApp extends Account {
    @Autowired
    private AccountRecordMapper mapper;

    @Override
    public BigDecimal profitByMonth(int month) {
        return totalIncomeByMonth(month).subtract(totalSpendingByMonth(month));
    }

    @Override
    public BigDecimal totalIncomeByMonth(int month) {
        return calculateBy(preMonth -> preMonth.getRecordTime().getMonthValue() == month,
                preAccountType -> preAccountType.isIncome());
    }

    @Override
    public BigDecimal totalSpendingByMonth(int month) {
        return calculateBy(preMonth -> preMonth.getRecordTime().getMonthValue() == month,
                preAccountType -> preAccountType.isSpending());
    }

    public List<AccountRecord> allRecords(){
        return  mapper.queryAllRecords();
    }

    public void addRecord(AccountRecord record){mapper.addRecord(record);}

    private BigDecimal calculateBy(Predicate<AccountRecord> predicateMonth, Predicate<AccountRecord> predicateAccountType) {
        if (predicateMonth == null && predicateAccountType == null) {
            System.out.print("*** There have no accountRecord in this month  ***");
        }
        return mapper.queryAllRecords().stream()
                .filter(predicateMonth)
                .filter(predicateAccountType)
                .map(obj -> obj.getAmount())
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b));
    }
}
