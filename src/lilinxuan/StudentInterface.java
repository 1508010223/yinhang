/**
 * 
 */
package lilinxuan;
/**
 * @author 敏儿
 *@package_name:lilinxuan
*@file_name:StudentInterface.java
*@date-time:2017年11月12日下午11:26:28
*@location:https://github.com/1508010223/yinhang.git
 */
public interface StudentInterface {
	void setFee(int fee);
    int getFee();
}
interface TeacherInterface{
    void setPay(int pay);
    int getPay();
}
class Graduate implements StudentInterface,TeacherInterface{
    private String name;
    private String sex;
    private int age;
    private int fee;
    private int pay;
    public Graduate(String name,int fee,int pay){
       super();
       this.name=name;
       this.fee=fee;
       this.pay=pay;
       if(this.pay-this.fee<2000)
           System.out.println("你需要贷款！");
       else
           System.out.println("你的收入足够了！");
    }
    public int getFee(){
       return this.fee;
    }
    public int getPay(){
       return this.pay;
    }
    public void setFee(int fee){
       this.fee=fee;
    }
    public void setPay(int pay){
       this.pay=pay;
    }
    public String getName(){
       return name;
    }
    public void setName(String name){
       this.name=name;
    }
    public String getSex(){
       return sex;
    }
    public int getAge(){
       return age;
    }
    public void setAge(int age){
       this.age=age;
    }
}
class Test02 {
    public static void main(String[] args) {
       new Graduate("zhangsan",5500,4500);
    }
 
}
