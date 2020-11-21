public class Circle extends Shape 
{
	private double radius;
	public Circle()
	{
		this.radius=1.0;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius, String c, boolean f)
	{
		super(c,f);
		this.radius=radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
    public double getArea()
	{
		return (3.14*radius*radius);
	}
	public double getPerimeter()
	{
		return(2*3.14*radius);
	}
	
	public String toString()
	{
		return "A Circle with radius "+this.radius+" , which is a subclass of "+super.toString();	
	}

}