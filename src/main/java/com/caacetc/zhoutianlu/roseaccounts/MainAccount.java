//package com.caacetc.zhoutianlu.roseaccounts;
//
//import java.time.LocalDate;
//
////import static com.caacetc.zhoutianlu.roseaccounts.Calculations.accountList;
//import static com.caacetc.zhoutianlu.roseaccounts.Calculations.*;
//
//
//public class MainAccount{
//    private AccountItem accountItem001 = new AccountItem("Spengding","Rose",
//            "Shopping","apple",19.8f, LocalDate.of(2019,9,19));
//    private AccountItem accountItem002 = new AccountItem("Spengding","Rose",
//            "Shopping","clothes",199f, LocalDate.of(2019,8,14));
//    private AccountItem accountItem003 = new AccountItem("Spengding","Rose",
//            "Shopping","pen",58f, LocalDate.of(2019,9,29));
//    private AccountItem accountItem004 = new AccountItem("Spengding","Rose",
//            "Travel","chengdu",433f, LocalDate.of(2019,11,15));
//    private AccountItem accountItem005 = new AccountItem("Spengding","Rose",
//            "Travel","chongqing",800f, LocalDate.of(2019,7,9));
//
//    public static void main(String[] args) {
//        MainAccount mainAccount = new MainAccount();
//        mainAccount.setAccountList();
//        float sum =Calculations.totalSpending(9);
//        System.out.print(sum);
//    }
//
//    private void setAccountList(){
//        accountList.add(accountItem001);
//        accountList.add(accountItem002);
//        accountList.add(accountItem003);
//        accountList.add(accountItem004);
//        accountList.add(accountItem005);
//    }
//}