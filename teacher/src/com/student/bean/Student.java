/**
 *
 */
package com.student.bean;

/**
 * �w����Bean�N���X
 *
 * @author jiangdang
 *
 */
public class Student {
	int id;// id
	String name;// ����
	String birthday;// ���N����
	int age;// �N��
	double score;// ����
	int classid;// ����

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            �Z�b�g���� id
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
	 *            �Z�b�g���� name
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
	 *            �Z�b�g���� birthday
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
	 *            �Z�b�g���� age
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
	 *            �Z�b�g���� score
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
	 *            �Z�b�g���� classid
	 */
	public void setClassid(int classid) {
		this.classid = classid;
	}

	/**
	 * �V�K�w���𐶐����鎞�Ɏg�p����郁�\�b�h(method)
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
	 * * �V�K�w���𐶐����鎞�Ɏg�p����郁�\�b�h(method)
	 *
	 */
	public Student() {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	public Student(int id2, String name2, String birthday2, int i, int score2, int classid2) {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	/*
	 * (�� Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + ", score=" + score
				+ ", classid=" + classid + "]";
	}

}
