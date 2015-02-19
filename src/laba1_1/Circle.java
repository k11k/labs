package laba1_1;

public class Circle 
{
	public static void main(String[] args) 
	{
		Read read=new Read();
		int radius=read.Reading(); 
        Circleference circleference=new Circleference(radius);
        System.out.println("Стоимость ограды");
        System.out.println(circleference.CostBarriers());
        System.out.println("стоимость дорожки");
        System.out.println(circleference.CostConcreting()); 
	}

}
