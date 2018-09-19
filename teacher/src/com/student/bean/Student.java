/**
 *
 */
package com.student.bean;

/**
 * 学生のBeanクラス
 *
 * @author jiangdang
 *
 */
public class Student {
	int id;// id
	String name;// 氏名
	String birthday;// 生年月日
	int age;// 年齢
	double score;// 成績
	int classid;// 授業

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            セットする birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score
	 *            セットする score
	 */
	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * @return classid
	 */
	public int getClassid() {
		return classid;
	}

	/**
	 * @param classid
	 *            セットする classid
	 */
	public void setClassid(int classid) {
		this.classid = classid;
	}

	/**
	 * 新規学生を生成する時に使用するるメソッド(method)
	 *
	 * @param id
	 * @param name
	 * @param birthday
	 * @param string
	 * @param score
	 * @param classid
	 */
	public Student(int id, String name, String birthday, String string, double score, int classid) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.age = string;
		this.score = score;
		this.classid = classid;
	}

	/**
	 * * 新規学生を生成する時に使用するるメソッド(method)
	 *
	 */
	public Student() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Student(int id2, String name2, String birthday2, int i, int score2, int classid2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + ", score=" + score
				+ ", classid=" + classid + "]";
	}

}
