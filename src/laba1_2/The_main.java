package laba1_2;

import java.util.Scanner;

public class The_main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner
		Read readwallweight=new Read("������� ������ �����");
		Read readwallhight=new Read("������� ������ �����");
		Read readdoorweight=new Read("������� ������ �����");
		Read readdoorhight=new Read("������� ������ �����");
		Rectangle rectanglewall=new Rectangle(readwallweight.Reading(sc),readwallhight.Reading(sc));
		Rectangle rectangledoor=new Rectangle(readdoorweight.Reading(sc),readdoorhight.Reading(sc));
		sc.close();
		Cost cost=new Cost(rectanglewall,rectangledoor);
		System.out.println("��������� �������");
	    System.out.println(cost.Sheathing());
	    System.out.println("��������� ����������");
	    System.out.println(cost.Jamb());
	}

}
