/**
 *
 */
package com.student.bean;

/**
 * @author jiangdang
 *
 */
public class PrintStudent {

	/**
	 *学生の表示クラス
	 * main Method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 学生1の生成
		Student studentOne = new Student();
		studentOne.setAge(9);
		studentOne.setId(1);
		studentOne.setName("zhao");
		studentOne.setBirthday("2008-10-5");
		studentOne.setScore(95);

		System.out.println("id:" + studentOne.getId());
		System.out.println("年齢”:" + studentOne.getAge());
		System.out.println("氏名" + studentOne.getName());
		System.out.println("生年月日" + studentOne.getBirthday());
		System.out.println("成績" + studentOne.getScore());
		System.out.println("授業id:" + studentOne.getClassid());

		// 学生2の生成
		Student studentTwo = new Student();
		studentTwo.setAge(10);
		studentTwo.setId(2);
		studentTwo.setName("qian");
		studentTwo.setBirthday("2007-06-05");
		studentTwo.setScore(80);

		System.out.println("id:" + studentTwo.getId());
		System.out.println("年齢”:" + studentTwo.getAge());
		System.out.println("氏名" + studentTwo.getName());
		System.out.println("生年月日" + studentTwo.getBirthday());
		System.out.println("成績" + studentTwo.getScore());
		System.out.println("授業id:" + studentTwo.getClassid());

		// 学生3の生成
		Student studentThree = new Student();
		studentThree.setAge(10);
		studentThree.setId(3);
		studentThree.setName("sun");
		studentThree.setBirthday("2009-01-05");
		studentThree.setScore(92);

		System.out.println("id:" + studentThree.getId());
		System.out.println("年齢”:" + studentThree.getAge());
		System.out.println("氏名" + studentThree.getName());
		System.out.println("生年月日" + studentThree.getBirthday());
		System.out.println("成績" + studentThree.getScore());
		System.out.println("授業id:" + studentThree.getClassid());

		// 学生4の生成
		Student studentFour = new Student();
		studentFour.setAge(8);
		studentFour.setId(4);
		studentFour.setName("liu");
		studentFour.setBirthday("2009-04-15");
		studentFour.setScore(0);
		System.out.println("学生4");
		System.out.println("id:" + studentFour.getId());
		System.out.println("年齢”:" + studentFour.getAge());
		System.out.println("氏名" + studentFour.getName());
		System.out.println("生年月日" + studentFour.getBirthday());
		System.out.println("成績" + studentFour.getScore());
		System.out.println("授業id:" + studentFour.getClassid());

		//学生5の生成
		Student studentFive=new Student (5,"li","2008-02-05",9,77,1);
		System.out.println("学生5");
		System.out.println("id:" + studentFive.getId());
		System.out.println("年齢”:" + studentFive.getAge());
		System.out.println("氏名" + studentFive.getName());
		System.out.println("生年月日" + studentFive.getBirthday());
		System.out.println("成績" + studentFive.getScore());
		System.out.println("授業id:" + studentFive.getClassid());
		System.out.println("id:" + studentFive.toString());

		// id name birthday age score classid
		// 1 zhao 2008/10/05 9 95 1
		// 2 qian 2007/06/05 10 80 1
		// 3 sun 2009/01/05 10 92 1
		// 4 liu 2009/04/15 8 ​(NULL)​ 1
		// 5 li 2008/02/05 9 77 1

	}

}
