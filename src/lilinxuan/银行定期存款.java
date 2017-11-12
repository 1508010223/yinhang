/**
 * 
 */
package lilinxuan;

import lilinxuan.DepositAccount;

/**
 * @author 晨晨
 *@package_name:lilinxuan
*@file_name:银行定期存款.java
*@date time:2017年10月13日下午4:47:52
*@location: https://github.com/1508010223/yinhang.git
 */
public class 银行定期存款 {
	 public static void main(String arg[]){
	 		DepositAccount man=new DepositAccount("1234567890","Zhang San",5000);
	 		DepositAccount.setInterest(0.023);//设置年利率
	 		man.queryBanlance();//查询余额
	 		man.deposit(2000);//存入2000元
	 		System.out.println("年利率是："+man.calyearInterest());
	 		System.out.println("月利率是："+man.calmonthInterest());
	 	}
	 }
	 class DepositAccount{
	 	private String Number;//账号
	 	private String name;//姓名
	 	private double balance;//余额
	 	static double interest;//年利率
	 	public static void setInterest(double d){ 
	 	interest=d;
	 }
	 public DepositAccount(String num, String chenchen,double money){//开户
	 	Number=num;
	 	name=chenchen;
	 	balance=money;
	 }
	 	public void deposit (double cash){//存款
	 		System.out.println("你账户原有余额："+balance);
	 		System.out.println("你现在存入："+cash);
	 		balance+=cash;
	 		System.out.println("存款成功，你的余额是："+balance);
	 	}
	 	public void queryBanlance(){//查询余额
	 		System.out.println("你的余额是："+balance);	
	 	}
	 	 public double calyearInterest(){//计算年利息
	 	 	return balance*interest;
	 	 }
	 	 public double calmonthInterest(){//计算年利息
		 	 	return balance*interest/12;
	 	 }
}
