public class Rectangle extends Shape{
	private double width;
	private double length;
	Rectangle()
	{
		width=1.0;
		length=1.0;
	}
	
	public Rectangle(double width, double length)
	{
		this.width=width;
		this.length=length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	
	public void setWidth(double width)
	{
		this.width=width;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public void setLength(double length)
	{
		this.length=length;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getArea()
	{
		return (length*width);
	}
	
	public double getPerimeter()
	{
		return (2*(length+width));
	}
	
	public String toString()
	{
		return ("A Rectangle with width "+this.width+" and length "+this.length+" which is a subclass of "+super.toString());
	}
}
