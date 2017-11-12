/**
 * 
 */
package lilinxuan;

import lilinxuan.Graduate;
import lilinxuan.Student;
import lilinxuan.Undergraduate;

/**
 * @author 晨晨
 *@package_name:lilinxuan
*@file_name:Student.java
*@date-time:2017年10月15日下午4:13:56
*@location:https://github.com/1508010223/yinhang.git
 */
public class Student {
	//Student类
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
	//disPlay为输出参数的方法，需传入一个Student对象。
	public void disPlay(Student s){
	System.out.println("name:"+s.getName()+",age:"+s.getAge()+",degree:"+s.geteducation());
	}
	}
	//Undergraduate 类
	 class Undergraduate extends Student{
	String specialty;
	// disPlay为输出参数的方法，需传入一个Undergraduate对象。
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
	//Graduate 类
   class Graduate extends Student{
	String studydirection;
	public String getStudydirection() {
	return studydirection;
	}
	public void setStudydirection(String studydirection) {
	this.studydirection = studydirection;
	}
	//disPlay为输出参数的方法，需传入一个Graduate对象。
	public void disPlay(Graduate g){
	System.out.println("name:"+g.getName()+",age:"+g.getAge()+",degree:"+g.geteducation()+",studydirection:"+g.getStudydirection());
	}
}