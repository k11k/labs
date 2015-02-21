package laba1_2;

public class Rectangle 
{
	int weight,hight;
	public Rectangle(int weight,int hight)
	{
		this.weight=weight;
		this.hight=hight;
	}
	
	public int Area()
	{
		return weight*hight;
	}
	 public int Perimetr()
	 {
		 return (weight+hight)*2;
	 }
}
