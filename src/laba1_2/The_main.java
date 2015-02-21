package laba1_2;

import java.util.Scanner;

public class The_main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
		Read readwallweight=new Read("введите ширину стены");
		Read readwallhight=new Read("введите высоту стены");
		Read readdoorweight=new Read("введите ширину двери");
		Read readdoorhight=new Read("введите высоту двери");
		Rectangle rectanglewall=new Rectangle(readwallweight.Reading(sc),readwallhight.Reading(sc));
		Rectangle rectangledoor=new Rectangle(readdoorweight.Reading(sc),readdoorhight.Reading(sc));
		sc.close();
		Cost cost=new Cost(rectanglewall,rectangledoor);
		System.out.println("Стоимость обшивки");
	    System.out.println(cost.Sheathing());
	    System.out.println("стоимость наличников");
	    System.out.println(cost.Jamb());
	}

}
