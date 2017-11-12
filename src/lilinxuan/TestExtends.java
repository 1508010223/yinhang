/**
 * 
 */
package lilinxuan;

import lilinxuan.Graduate;
import lilinxuan.Student;
import lilinxuan.TestExtends;
import lilinxuan.Undergraduate;

/**
 * @author 晨晨
 *@package_name:lilinxuan
*@file_name:TestExtends.java
*@date-time:2017年10月15日下午4:19:26
*@location:https://github.com/1508010223/yinhang.git
 */
public class TestExtends {
	//测试类（创建对象，调用方法，输出参数）
	//测试类（创建对象，调用方法，输出参数）
	Student s = new Student();
	Undergraduate u = new Undergraduate();
	Graduate g = new Graduate();
	public void doTest(){
	//设置3个对象的参数
	s.setName("李林轩");
	s.setAge(19);
	s.setDegree("本科");
	s.disPlay(s);
	u.setName("晨晨");
	u.setAge(20);
	u.setDegree("硕士");
	u.setSpecialty("math");
	u.disPlay(u);
	g.setName("哇哈哈");
	g.setAge(22);
	g.setDegree("yanjiusheng");
	g.setStudydirection("EC");
	g.disPlay(g);
	}
	public static void main(String args[]) {
		 TestExtends t = new  TestExtends();
	     t.doTest();
	}
}

