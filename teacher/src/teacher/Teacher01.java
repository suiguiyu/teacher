/**
 *
 */
package teacher;

/**
 * @author jiangdang
 *
 */
public class Teacher01 {
	private Integer id;
private String name;
private String birthday;
private int age;
private double score;
private String sex;
private String country;
private String myNumber;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getMyNumber() {
	return myNumber;
}
public void setMyNumber(String myNumber) {
	this.myNumber = myNumber;
}

public Teacher01(Integer id, String name, String birthday, int age, double score, String sex, String country, String myNumber) {
	this.id = id;
	this.name = name;
	this.birthday = birthday;
	this.age = age;
	this.score = score;
	this.sex = sex;
	this.country = country;
	this.myNumber = myNumber;
	// TODO 自動生成されたコンストラクター・スタブ
}
}
