package com.caacetc.zhoutianlu.roseaccounts;


import java.time.LocalDate;

public class AccountItem {
    private String Category;
    private String Name;
    private String Content;
    private String Note;
    private float Amount;
    private LocalDate OccuredTime;

    AccountItem(String category,String name,String content,
                String note,float amount,LocalDate OccuredTime){
        this.Category = category;
        this.Name = name;
        this.Content = content;
        this.Note = note;
        this.Amount = amount;
        this.OccuredTime = OccuredTime;
    }

    public String getCategory() {
        return Category;
    }

    public String getName() {
        return Name;
    }

    public String getContent() {
        return Content;
    }

    public String getNote() {
        return Note;
    }

    public float getAmount() {
        return Amount;
    }

    public LocalDate getOccuredTime() {
        return OccuredTime;
    }
    @Override
    public String toString(){
        return String.format("账目名称：%s;\n账目类型: %s;\n账目内容: %s;\n" +
                             "账目备注: %s;\n账目金额: %f;\n记账时间: %s。\n",
                             this.Name,this.Category,this.Content,
                             this.Note,this.Amount,this.OccuredTime);
    }
}

//账目名称Name
//
//        账目类型Category：支出（Spending）或收入（Income）
//
//        账目内容Content
//
//        账目备注Note
//
//        金额Amount
//
//        记账时间OccuredTime
