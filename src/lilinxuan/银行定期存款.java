/**
 * 
 */
package lilinxuan;

import lilinxuan.DepositAccount;

/**
 * @author ����
 *@package_name:lilinxuan
*@file_name:���ж��ڴ��.java
*@date time:2017��10��13������4:47:52
*@location: https://github.com/1508010223/yinhang.git
 */
public class ���ж��ڴ�� {
	 public static void main(String arg[]){
	 		DepositAccount man=new DepositAccount("1234567890","Zhang San",5000);
	 		DepositAccount.setInterest(0.023);//����������
	 		man.queryBanlance();//��ѯ���
	 		man.deposit(2000);//����2000Ԫ
	 		System.out.println("�������ǣ�"+man.calyearInterest());
	 		System.out.println("�������ǣ�"+man.calmonthInterest());
	 	}
	 }
	 class DepositAccount{
	 	private String Number;//�˺�
	 	private String name;//����
	 	private double balance;//���
	 	static double interest;//������
	 	public static void setInterest(double d){ 
	 	interest=d;
	 }
	 public DepositAccount(String num, String chenchen,double money){//����
	 	Number=num;
	 	name=chenchen;
	 	balance=money;
	 }
	 	public void deposit (double cash){//���
	 		System.out.println("���˻�ԭ����"+balance);
	 		System.out.println("�����ڴ��룺"+cash);
	 		balance+=cash;
	 		System.out.println("���ɹ����������ǣ�"+balance);
	 	}
	 	public void queryBanlance(){//��ѯ���
	 		System.out.println("�������ǣ�"+balance);	
	 	}
	 	 public double calyearInterest(){//��������Ϣ
	 	 	return balance*interest;
	 	 }
	 	 public double calmonthInterest(){//��������Ϣ
		 	 	return balance*interest/12;
	 	 }
}
