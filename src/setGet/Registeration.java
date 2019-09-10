package setGet;

public class Registeration 
{
	private String fname;
	private String lname;
	private int eid;
	private int mno;
	private String mail;
	private String password;
	private String gender;
	private String desg;
	private String city;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String toString() {
		return "Registration [fname=" + fname + ", lname=" + lname + ", eid=" + eid + ", mno=" + mno + ", mail=" + mail
				+ ", password=" + password + ", gender=" + gender + ", desg=" + desg + ", city=" + city + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGen() {
		return gender;
	}
	public void setGen(String gender) {
		this.gender = gender;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
