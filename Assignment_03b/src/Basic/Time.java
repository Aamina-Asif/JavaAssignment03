package Basic;

public class Time {
	private int hours;
	private int min;
	private String am_pm;
	public Time(String time) 
	{
		String s[]=time.split(":");
		this.hours=Integer.parseInt(s[0]);
		String s1[]=s[1].split(" ");
		this.min=Integer.parseInt(s1[0]);
		this.am_pm=s1[1];
	}
	void setHours(int hours)
	{
		this.hours=hours;
	}
	void setMin(int min) 
	{
		this.min=min;
	}
	void setAmPm(String am_pm) 
	{
		this.am_pm=am_pm;
	}
	int getHours() 
	{
		return hours;
	}
	int getMin() 
	{
		return min;
	}
	String getAmPm() 
	{
		return am_pm;
	}
	public String toString() 
	{
		if(min==0)
			return (this.hours+":"+this.min+"0 "+this.am_pm);
		else
			return (this.hours+":"+this.min+" "+this.am_pm);
	}	
}
