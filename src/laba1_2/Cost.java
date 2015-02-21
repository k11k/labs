package laba1_2;

public class Cost 
{
	Rectangle rectanglewall;
	Rectangle rectangledoor;
	public Cost(Rectangle rectanglewall, Rectangle rectangledoor)
	{
		this.rectanglewall=rectanglewall;
		this.rectangledoor=rectangledoor;
	}
	public int Sheathing()
	{
		return rectanglewall.Area()-rectangledoor.Area();
	}
	public int Jamb()
	{
		return rectanglewall.Perimetr()+rectangledoor.Perimetr();
	}
}
