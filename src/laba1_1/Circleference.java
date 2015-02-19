package laba1_1;

public class Circleference 
{
	private double radius;
	public Circleference (double radius)
	{
		this.radius=radius;
	}
	
	public double Area(double radius) 
	{
		return radius*radius*3.14;
	}
	
	public double Perimeter()
	{
		return radius*2*3.14;
	}
	
	public double CostBarriers()
	{
		return Perimeter()*10;
	}
	
	public double CostConcreting()
	{
		return Area(radius+1)-Area(radius);
	}
}
