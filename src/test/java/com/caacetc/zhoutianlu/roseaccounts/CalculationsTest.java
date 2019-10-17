package com.caacetc.zhoutianlu.roseaccounts;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class CalculationsTest {
    private AccountType spending = AccountType.Spending;
    private AccountType income = AccountType.Income;
    private AccountRecord accountRecord001 = new AccountRecord(spending,"Rose",
            "Shopping","apple",19.8f, LocalDate.of(2019,9,19));
    private AccountRecord accountRecord002 = new AccountRecord(income,"Rose",
            "Allowance","living allowances",199f, LocalDate.of(2019,9,14));
    private AccountRecord accountRecord003 = new AccountRecord(spending,"Rose",
            "Shopping","pen",10f, LocalDate.of(2019,9,29));
    private AccountRecord accountRecord004 = new AccountRecord(income,"Rose",
            "Allowance","Travel allowances ",433f, LocalDate.of(2019,11,15));
    private AccountRecord accountRecord005 = new AccountRecord(spending,"Rose",
            "Travel","chongqing",800f, LocalDate.of(2019,7,9));
    private List<AccountRecord> accountList = new ArrayList<AccountRecord>();


    @Before
    public void setAccountRecords(){
        Calculations.add(accountRecord001);
        Calculations.add(accountRecord002);
        Calculations.add(accountRecord003);
        Calculations.add(accountRecord004);
        Calculations.add(accountRecord005);
    }

    @Test
    public void should_calculate_the_totalSpending_of_september(){
        float sum =Calculations.totalSpending(9);
        assertThat(sum).isEqualTo(29.8f);
    }



    @Test
    public void should_calculate_the_totalIncome_of_november(){
        float sum =Calculations.totalIncome(11);
        assertThat(sum).isEqualTo(433.0f);
    }

    @Test
    public void should_calculate_the_Profit_of_september(){
        float sum =Calculations.Profit(9);
        assertThat(sum).isEqualTo(169.2f);
    }

    @Test
    public void should_showMessage_of_september(){
        Calculations.showMessage(9);
    }
}