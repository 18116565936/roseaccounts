//package com.caacetc.zhoutianlu.roseaccounts;
//
//import java.time.LocalDate;
//
////import static com.caacetc.zhoutianlu.roseaccounts.Calculations.accountList;
//import static com.caacetc.zhoutianlu.roseaccounts.Calculations.*;
//
//
//public class MainAccount{
//    private AccountRecord accountItem001 = new AccountRecord("Spengding","Rose",
//            "Shopping","apple",19.8f, LocalDate.of(2019,9,19));
//    private AccountRecord accountItem002 = new AccountRecord("Spengding","Rose",
//            "Shopping","clothes",199f, LocalDate.of(2019,8,14));
//    private AccountRecord accountItem003 = new AccountRecord("Spengding","Rose",
//            "Shopping","pen",58f, LocalDate.of(2019,9,29));
//    private AccountRecord accountItem004 = new AccountRecord("Spengding","Rose",
//            "Travel","chengdu",433f, LocalDate.of(2019,11,15));
//    private AccountRecord accountItem005 = new AccountRecord("Spengding","Rose",
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