package com.caacetc.zhoutianlu.roseaccounts;


import java.time.LocalDate;

public class AccountRecord {
    private String AccountName;//账本名称
    private String ContentType;//账目内容类型
    private String Note;//账目备注
    private float Amount;//金额
    private LocalDate RecordTime;//记录时间
    private AccountType AccountType;//账目类型

    AccountRecord(AccountType accountType, String accountName, String contentType,
                  String note, float amount, LocalDate recordTime){
        this.AccountType = accountType;
        this.AccountName = accountName;
        this.ContentType = contentType;
        this.Note = note;
        this.Amount = amount;
        this.RecordTime = recordTime;
    }

    public AccountType getAccountType() {
        return AccountType;
    }

    public String getAccountName() {
        return AccountName;
    }

    public String getContentType() {
        return ContentType;
    }

    public String getNote() {
        return Note;
    }

    public float getAmount() {
        return Amount;
    }

    public LocalDate getRecordTime() {
        return RecordTime;
    }
    @Override
    public String toString(){
        return String.format("账目名称：%s;\n账目类型: %s;\n账目内容: %s;\n" +
                             "账目备注: %s;\n账目金额: %f;\n记账时间: %s。\n",
                             this.AccountName,this.AccountType,this.ContentType,
                             this.Note,this.Amount,this.RecordTime);
    }
}