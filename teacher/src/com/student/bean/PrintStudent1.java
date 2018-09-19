package com.student.bean;

import java.util.ArrayList;
import java.util.HashMap;

import javax.print.attribute.Size2DSyntax;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class PrintStudent1 {

	public static void main(String[] args) {
		Student studentOne = new Student();
		studentOne.setId(1);
		studentOne.setName("zhao");
		studentOne.setBirthday("2008/10/05");
		studentOne.setAge(9);
		studentOne.setScore(95.00);
		studentOne.setClassid(1);

		// 学生2の生成
		// int id, String name, String birthday, int age, double score, int classid
		Student studentTwo = new Student(2, "qian", "2007/06/05", 10, 80, 1);
		Student studentThree = new Student(3, "sun", "2009/01/05", 10, 92, 1);
		Student studentFour = new Student(4, "liu", "2009/04/15", 8, 0, 1);
		Student studentFive = new Student(5, "li", "2008/02/05", 9, 77, 1);

		System.out.println(studentOne);
		System.out.println(studentTwo);
		System.out.println(studentThree);
		System.out.println(studentFour);
		System.out.println(studentFive);

		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(studentOne);
		studentlist.add(studentTwo);
		studentlist.add(studentThree);
		studentlist.add(studentFour);
		studentlist.add(studentFive);
		System.out.println(studentlist);

		int sum = 0;
		int avr = 0;
		// 年齢の平均値
		for (Student stu : studentlist) {
			System.out.println("sum:" + sum);
			sum = sum + stu.getAge();
		}
		avr = sum / studentlist.size();

		System.out.println("学生の平均値" + avr);

		int max = 0;
		// 年齢の最大値
		for (Student stu : studentlist) {
			if (max < stu.getAge()) {
				max = stu.getAge();
			}
		}
		System.out.println("最大値" + max);

		HashMap<String,Student>studentmap=new HashMap<String,Student>();
		studentmap.put("1", studentOne);
		studentmap.put("2", studentTwo);
		studentmap.put("3", studentThree);
		studentmap.put("4", studentFour);
		studentmap.put("5", studentFive);
		int ave;
		int sumo=0;
		for (Student stu : studentmap.values()) {
			 System.out.println("map方法の学生のsum"+sumo);
			sumo = sumo + stu.getAge();


		}

	    ave=sumo/studentmap.size();
	    System.out.println("map方法の学生の平均値" + ave);




	}



}

// id name birthday age score classid
// 1 zhao 2008/10/05 9 95 1
// 2 qian 2007/06/05 10 80 1
// 3 sun 2009/01/05 10 92 1
// 4 liu 2009/04/15 8 ​(NULL)​ 1
// 5 li 2008/02/05 9 77 1
