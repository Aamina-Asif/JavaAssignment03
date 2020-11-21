package Hospital;

import Basic.Date;
import Basic.Time;

public abstract class Patient {
	private String pname;
	private long cnic;
	private String address;
	private long phoneNo;
	private char gender;
	private int age;

	public Patient()
	{
		this.pname="";
		this.address="";
		this.cnic=0;
		this.phoneNo=0;
		this.age=0;
		this.gender='O';
	}
	public Patient(String pname,String address,long cnic,long phoneNo,int age,char gender)
	{
		this.pname=pname;
		this.address=address;
		this.cnic=cnic;
		this.phoneNo=phoneNo;
		this.age=age;
		this.gender=gender;
	}
	void setAddress(String address) 
	{
		this.address=address;
	}
	void setPhone(long phoneNo) 
	{
		this.phoneNo=phoneNo;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	String getName() 
	{
		return pname;
	}
	String getAddress() 
	{
		return address;
	}
	long getCNIC() 
	{
		return cnic;
	}
	long getPhone() 
	{
		return phoneNo;
	}
	int getAge() 
	{
		return age;
	}
	char getGender() 
	{
		return gender;
	}
	abstract Date getDate(); 
	abstract Doctor getDoctor();
	abstract void setDate(Date date);
	abstract void setTime(Time time);
	public String toString() 
	{
		return "Patient: "+pname+" ( "+gender+" ) "+age+" years old";
	}
}
