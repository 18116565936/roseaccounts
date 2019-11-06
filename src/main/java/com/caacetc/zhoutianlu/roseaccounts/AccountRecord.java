package com.caacetc.zhoutianlu.roseaccounts;


import java.math.BigDecimal;
import java.time.LocalDate;


public class AccountRecord {
    private String accountName;//账本名称
    private String contentType;//账目内容类型
    private String note;//账目备注
    private BigDecimal amount;//金额   把金融概念写进去
    private LocalDate recordTime;//记录时间
    private AccountType accountType;//账目类型

    AccountRecord(AccountType accountType, String accountName, String contentType,
                  String note, BigDecimal amount, LocalDate recordTime){
        this.accountType = accountType;
        this.accountName = accountName;
        this.contentType = contentType;
        this.note = note;
        this.amount = amount;
        this.recordTime = recordTime;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public LocalDate getRecordTime() {
        return recordTime;
    }

    public boolean isIncome() {
        return accountType == accountType.Income;
    }

    public boolean isSpending() {
        return accountType == accountType.Spending;
    }



    @Override
    public String toString(){
        return String.format("账目名称：%s;\n账目类型: %s;\n账目内容: %s;\n" +
                             "账目备注: %s;\n账目金额: %f;\n记账时间: %s。\n",
                             accountName,accountType,contentType,
                             note,amount,recordTime);
    }
}