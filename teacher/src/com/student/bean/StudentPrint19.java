package com.student.bean;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;

import teacher.printTeacher;

public class StudentPrint19 {

	// TODO 自動生成されたメソッド・スタブ
	public static void main(String[] args) {
	 Student studentOne=new Student();
     studentOne.setId(1);
     studentOne.setName("zhao");
     studentOne.setBirthday("2008-10-05");
     studentOne.setAge(9);
     studentOne.setScore(95);
     studentOne.setClassid(1);

    System.out.println("id:"+studentOne.getId());
    System.out.println("name:"+studentOne.getName());
    System.out.println("birthday:"+studentOne.getBirthday());
    System.out.println("age:"+studentOne.getAge());
    System.out.print("score:"+studentOne.getScore());
    System.out.println("classid:"+studentOne.getClassid());

    //学生2の作成
    //int id,string name,string birthday,int age,double score,int classid
    Student studentTwo = new Student(2,"qian","2007-06-05",10,80,1);
    Student studentThree = new Student(3, "sun", "2009/01/05", 10, 92, 1);
    Student studentFour = new Student(4,"liu", "2009/04/15", 8, 0, 1);
    Student studentFive = new Student(5,"li","2008/02/05",9,77,1);

    System.out.println(studentTwo);
    System.out.println(studentThree);
    System.out.println(studentFour);
    System.out.print(studentFive);

  ArrayList<student>studentList= new arraylist


	}

}

// id name birthday age score classid
// 1 zhao 2008/10/05 9 95 1
// 2 qian 2007/06/05 10 80 1
// 3 sun 2009/01/05 10 92 1
// 4 liu 2009/04/15 8 ​(NULL)​ 1
// 5 li 2008/02/05 9 77 1
