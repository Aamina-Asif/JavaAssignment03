package Hospital;

public class Doctor 
{
	private String dname;
	private long cnic;
	private long phoneNo;
	private char gender;
	private String department;
	private String specialization;
	
	public Doctor(String dname,String department,String specialization,long cnic,long phoneNo,char gender)
	{
		this.dname=dname;
		this.department=department;
		this.specialization=specialization;
		this.cnic=cnic;
		this.phoneNo=phoneNo;
		this.gender=gender;
	}
	void setDepartment(String department) {
		this.department=department;
	}
	void setSpecialization(String specialization) 
	{
		this.specialization=specialization;
	}
	void setPhone(long phoneNo) 
	{
		this.phoneNo=phoneNo;
	}
	String getName() 
	{
		return dname;
	}
	String getDepartment() 
	{
		return department;
	}
	String getSpecialization() 
	{
		return specialization;
	}
	long getCNIC() 
	{
		return cnic;
	}
	long getPhone() 
	{
		return phoneNo;
	}
	char getGender() 
	{
		return gender;
	}
	public String toString() 
	{
		return "Doctor "+dname+" ( "+gender+" ) has done specialization in "+specialization;
	}
}

