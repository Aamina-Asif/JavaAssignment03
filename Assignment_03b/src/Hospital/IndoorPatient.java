package Hospital;

import Basic.Date;
import Basic.Time;

public class IndoorPatient extends Patient{
	private int wardNo;
	private int roomNo;
	private int bedNo;
	private Doctor doc1;
	private Date admission;
	private int fee;
	public IndoorPatient(String name,String address,long cnic,long phone,int age,char gender,int wn,int bn,int rn,int fee,String date,Doctor doctor)
	{
		super(name,address,cnic,phone,age,gender);
		this.wardNo=wn;
		this.roomNo=bn;
		this.bedNo=rn;
		this.fee=fee;
		this.admission=new Date(date);
		this.doc1=doctor;
	}
	public void setFee(int fee) 
	{
		this.fee=fee;
	}
	public int getFee() 
	{
		return fee;
	}
	public void setWardNo(int wardNo) 
	{
		this.wardNo=wardNo;
	}
	public int getWardNo() 
	{
		return wardNo;
	}
	public void setRoomNo(int roomNo) 
	{
		this.roomNo=roomNo;
	}
	public int getRoomNo() 
	{
		return roomNo;
	}
	public void setBedNo(int bedNo) 
	{
		this.bedNo=bedNo;
	}
	public int getBedNo() 
	{
		return bedNo;
	}
	public Date getDate()
	{
		return admission;
	}
	public Doctor getDoctor() 
	{
		return doc1;
	}
	public void setDate(Date date)
	{
		admission=date;
	}
	public void setTime(Time time)
	{
	}
	public String toString() 
	{
		return "Indoor "+super.toString()+" treated by "+doc1+" on "+admission;
	}
}
