package Hospital;

import Basic.Date;
import Basic.Time;

public class OutdoorPateint extends Patient{

	private Date appointmentD;
	private Time appointmentT;
	private Doctor doc2;
	private int fee;
	OutdoorPateint(String name,String address,long cnic,long phone,int age,char gender,int fee,String date,String time,Doctor doctor)
	{
		super(name,address,cnic,phone,age,gender);
		appointmentD=new Date(date);
		appointmentT=new Time(time);
		this.fee=fee;
		this.doc2=doctor;
	}
	public void setFee(int fee) 
	{
		this.fee=fee;
	}
	public int getFee() 
	{
		return fee;
	}
	public Date getDate() 
	{
		return appointmentD;
	}
	public Doctor getDoctor() 
	{
		return doc2;
	}
	public void setDate(Date date) 
	{
		appointmentD=date;
	}
	public void setTime(Time time) 
	{
		appointmentT=time;
	}
	public String toString() 
	{
		return "Outdoor "+super.toString()+" treated by "+doc2+" on "+appointmentD+" at "+appointmentT;
	}
}