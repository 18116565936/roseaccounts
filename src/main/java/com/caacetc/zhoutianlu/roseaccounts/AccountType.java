package com.caacetc.zhoutianlu.roseaccounts;

public enum AccountType {
    Spending("Spending"),
    Income("Income");
    private String value;
    AccountType(String value){
        this.value=value;
    }
}
