package laba1_2;
import java.util.Scanner;
public class Read 
{
	public int Reading(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner
	    int i = 2;
	    System.out.print(args);
	    
	    // ���������� ������� ���� � ������ ����� ����� ������� ����� �����
	   if(sc.hasNextInt()) 
	    { 
	    	i = sc.nextInt(); // ��������� ����� ����� � ������ ����� � ��������� � ����������
	    	sc.close();
	        return i;
	    } 

	    System.out.println("�� ����� �� ����� �����"); 
	    sc.close();
	    return 0;
	}
}