package com.caacetc.zhoutianlu.roseaccounts;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class CalculationsTest {
    private AccountItem accountItem001 = new AccountItem("Spending","Rose",
            "Shopping","apple",19.8f, LocalDate.of(2019,9,19));
    private AccountItem accountItem002 = new AccountItem("Spending","Rose",
            "Shopping","clothes",199f, LocalDate.of(2019,8,14));
    private AccountItem accountItem003 = new AccountItem("Spending","Rose",
            "Shopping","pen",58f, LocalDate.of(2019,9,29));
    private AccountItem accountItem004 = new AccountItem("Income","Rose",
            "Travel","chengdu",433f, LocalDate.of(2019,11,15));
    private AccountItem accountItem005 = new AccountItem("Spending","Rose",
            "Travel","chongqing",800f, LocalDate.of(2019,7,9));
    private List<AccountItem> accountList = new ArrayList<AccountItem>();

    public CalculationsTest(){
        accountList.add(accountItem001);
        accountList.add(accountItem002);
        accountList.add(accountItem003);
        accountList.add(accountItem004);
        accountList.add(accountItem005);
    }

    @Test
    public void should_calcuate_totalSpending(){
        float sum =Calculations.totalSpending(9,accountList);
//        System.out.print(sum);
        assertThat(sum).isEqualTo(77.8f);
    }



    @Test
    public void should_calcuate_totalIncome(){
        float sum =Calculations.totalIncome(11,accountList);
//        System.out.print(sum);
        assertThat(sum).isEqualTo(433.0f);
    }

    @Test
    public void should_calcuate_Profit(){
        float sum =Calculations.Profit(9,accountList);
        assertThat(sum).isEqualTo(-77.8f);
    }

    @Test
    public void should_showMessage(){
        Calculations.showMessage(9,accountList);
    }
}