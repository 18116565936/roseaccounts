package com.caacetc.zhoutianlu.roseaccounts.entities;

public enum AccountType {
    Spending("Spending"),
    Income("Income");
    private String value;
    AccountType(String value){
        this.value=value;
    }
}
