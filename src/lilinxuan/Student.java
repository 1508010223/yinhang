/**
 * 
 */
package lilinxuan;

import lilinxuan.Graduate;
import lilinxuan.Student;
import lilinxuan.Undergraduate;

/**
 * @author ����
 *@package_name:lilinxuan
*@file_name:Student.java
*@date-time:2017��10��15������4:13:56
*@location:https://github.com/1508010223/yinhang.git
 */
public class Student {
	//Student��
	String name;
	int age;
	String education;
	public Student() {
	}
	public Student(String name, int age, String education) {
	super();
	this.name 

	 = name;
	this.age = age;
	this.education = education;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public String geteducation() {
	return education;
	}
	public void setDegree(String education) {
	this.education= education;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name 

	 = name;
	}
	//disPlayΪ��������ķ������贫��һ��Student����
	public void disPlay(Student s){
	System.out.println("name:"+s.getName()+",age:"+s.getAge()+",degree:"+s.geteducation());
	}
	}
	//Undergraduate ��
	 class Undergraduate extends Student{
	String specialty;
	// disPlayΪ��������ķ������贫��һ��Undergraduate����
	public void disPlay(Undergraduate u){
	System.out.println("name:"+u.getName()+",age:"+u.getAge()+",degree:"+u.geteducation()+",specialty:"+u.getSpecialty());
	}
	public String getSpecialty() {
	return specialty;
	}
	public void setSpecialty(String specialty) {
	this.specialty = specialty;
	}
	}
	//Graduate ��
   class Graduate extends Student{
	String studydirection;
	public String getStudydirection() {
	return studydirection;
	}
	public void setStudydirection(String studydirection) {
	this.studydirection = studydirection;
	}
	//disPlayΪ��������ķ������贫��һ��Graduate����
	public void disPlay(Graduate g){
	System.out.println("name:"+g.getName()+",age:"+g.getAge()+",degree:"+g.geteducation()+",studydirection:"+g.getStudydirection());
	}
}