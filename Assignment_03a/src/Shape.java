public abstract class Shape {
	private String color;
	private boolean filled;
	public Shape()
	{
		color="green";
		filled=true;
	}
	public Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public String toString()
	{
		if(isFilled())
			return "A Shape with color of "+this.color+" and filled";
		else 
			return "A Shape with color of "+this.color+" and not filled";
	}
	public abstract double getArea();
	public abstract double getPerimeter();

}
