package laba1_2;
import java.util.Scanner;
public class Read 
{
	String args;
	public Read(String args)
	{
		this.args=args;
	}
	public int Reading(Scanner sc) 
	{		 
	    int i = 2;
	    System.out.println(this.args);
	    
	    // ���������� ������� ���� � ������ ����� ����� ������� ����� �����
	   if(sc.hasNextInt()) 
	    { 
	    	i = sc.nextInt(); // ��������� ����� ����� � ������ ����� � ��������� � ����������	    	
	    	//sc.close();
	        return i;
	    } 

	    System.out.println("�� ����� �� ����� �����"); 
	    //sc.close();
	    return 0;
	}
}