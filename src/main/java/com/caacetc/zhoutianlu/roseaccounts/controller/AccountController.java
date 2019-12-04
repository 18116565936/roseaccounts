package com.caacetc.zhoutianlu.roseaccounts.controller;

import com.caacetc.zhoutianlu.roseaccounts.application.AccountRecordApp;
import com.caacetc.zhoutianlu.roseaccounts.entities.AccountRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountRecordApp accountRecordApp;

    public BigDecimal queryProfitByMonth(int month){return accountRecordApp.profitByMonth(month);}

    public BigDecimal queryTotalIncomeByMonth(int month){return accountRecordApp.totalIncomeByMonth(month);}

    public BigDecimal queryTotalSpendingByMonth(int month){return accountRecordApp.totalSpendingByMonth(month);}

    public List<AccountRecord> queryAllRecord(){
        List<AccountRecord> accountRecords = accountRecordApp.allRecords();
        for (AccountRecord record : accountRecords){
            System.out.println(record);
        }
        return accountRecords;
    }
}
