import java.io.*;

public class Student implements Serializable{
	final static long serialVersionUID=1L; //L表示是一个长整形
	String name;
	int age;
	
	public Student(){
		
	}
	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void printInfo(){
		System.out.println(name+","+age);   //打印方法
	}
}
