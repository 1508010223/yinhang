/**
 * 
 */
package lilinxuan;

import lilinxuan.Graduate;
import lilinxuan.Student;
import lilinxuan.TestExtends;
import lilinxuan.Undergraduate;

/**
 * @author ����
 *@package_name:lilinxuan
*@file_name:TestExtends.java
*@date-time:2017��10��15������4:19:26
*@location:https://github.com/1508010223/yinhang.git
 */
public class TestExtends {
	//�����ࣨ�������󣬵��÷��������������
	//�����ࣨ�������󣬵��÷��������������
	Student s = new Student();
	Undergraduate u = new Undergraduate();
	Graduate g = new Graduate();
	public void doTest(){
	//����3������Ĳ���
	s.setName("������");
	s.setAge(19);
	s.setDegree("����");
	s.disPlay(s);
	u.setName("����");
	u.setAge(20);
	u.setDegree("˶ʿ");
	u.setSpecialty("math");
	u.disPlay(u);
	g.setName("�۹���");
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

