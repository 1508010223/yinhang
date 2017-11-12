/**
 * 
 */
package lilinxuan;

import lilinxuan.Car;
import lilinxuan.Computer;
import lilinxuan.ComputerWeight;
import lilinxuan.Television;
import lilinxuan.WashMachine;

/**
 * @author ����
 *@package_name:lilinxuan
*@file_name:ComputerWeight.java
*@date-time:2017��11��12������11:28:29
*@location:https://github.com/1508010223/yinhang.git
 */
public interface ComputerWeight {
	public double computerWeight();
}
class Television implements ComputerWeight { 
	public double computerWeight() {  
		return 150;   
		} 
	}  
class Computer implements ComputerWeight { 
	public double computerWeight() {
		return 100;   
		} 
	}  
class WashMachine implements ComputerWeight 
{
	public double computerWeight() { 
		return 50;    
		}
	} 
class Car {  
	ComputerWeight[] goods;
	double totalWeights=0;
	Car(ComputerWeight[] goods){
		this.goods=goods;  
		}  
	public double getTotalWeights() {
		totalWeights=0; 
		for(int i=0;i<goods.length;i++) {    
			totalWeights+=goods[i].computerWeight();  
			}   
		return totalWeights; 
		} 
	}  
class Road {
	public static void main(String args[]) { 
		ComputerWeight[] goodsOne=new ComputerWeight[50], 
				goodsTwo=new ComputerWeight[22]; 
		for(int i=0;i<goodsOne.length;i++) {  
			if(i%3==0)    
				goodsOne[i]=new Television();
			else if(i%3==1)    
				goodsOne[i]=new Computer();  
			else if(i%3==2)      
				goodsOne[i]=new WashMachine(); 
			}     
		for(int i=0;i<goodsTwo.length;i++)    {  
			if(i%3==0)    
				goodsTwo[i]=new Television();  
			else if(i%3==1)     
				goodsTwo[i]=new Computer();  
			else if(i%3==2)       
				goodsTwo[i]=new WashMachine(); 
			}    
		Car bigcar=new Car(goodsOne); 
		System.out.println("�����װ�صĻ�������:"+bigcar.getTotalWeights()); 
		Car smallcar=new Car(goodsTwo);  
		System.out.println("С����װ�صĻ�������:"+smallcar.getTotalWeights());  
		} 
	}
