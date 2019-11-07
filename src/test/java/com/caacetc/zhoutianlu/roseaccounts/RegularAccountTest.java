package com.caacetc.zhoutianlu.roseaccounts;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.caacetc.zhoutianlu.roseaccounts.AccountType.Income;
import static com.caacetc.zhoutianlu.roseaccounts.AccountType.Spending;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class RegularAccountTest{
    private List<AccountRecord> accountRecords = new ArrayList<>();
    private Account account = new RegularAccount();


    @Before
    public void setUp(){
        accountRecords = addAccountRecords();
        //give
        account.addAll(accountRecords);
    }

    @Test
    public void should_calculate_profitByMonth(){
        //when
        BigDecimal sum = account.profitByMonth(9);

        //then
        assertThat(sum).isEqualTo(new BigDecimal(-759.5));
    }

    @Test
    public void should_calculate_totalIncomeByMonth(){
        //when
        BigDecimal sum = account.totalIncomeByMonth(9);

        //then
        assertThat(sum).isEqualTo(new BigDecimal(50.5));
    }

    @Test
    public void should_calculate_totalSpendingByMonth(){
        //when
        BigDecimal sum = account.totalSpendingByMonth(9);

        //then
        assertThat(sum).isEqualTo(new BigDecimal(810));
    }

    private List<AccountRecord> addAccountRecords(){
        AccountRecord accountRecord001 = new AccountRecord(Income,"Rose",
                "Shopping","apple",new BigDecimal(15.5), LocalDate.of(2019,9,19));
        AccountRecord accountRecord002 = new AccountRecord(Income,"Rose",
                "Allowance","living allowances",new BigDecimal(20), LocalDate.of(2019,9,14));
        AccountRecord accountRecord003 = new AccountRecord(Spending,"Rose",
                "Shopping","pen",new BigDecimal(10), LocalDate.of(2019,9,29));
        AccountRecord accountRecord004 = new AccountRecord(Income,"Rose",
                "Allowance","Travel allowances ",new BigDecimal(15), LocalDate.of(2019,9,15));
        AccountRecord accountRecord005 = new AccountRecord(Spending,"Rose",
                "Travel","chongqing",new BigDecimal(800), LocalDate.of(2019,9,9));
        accountRecords.add(accountRecord001);
        accountRecords.add(accountRecord002);
        accountRecords.add(accountRecord003);
        accountRecords.add(accountRecord004);
        accountRecords.add(accountRecord005);
        return accountRecords;
    }
}