package laba1_1;
import java.util.Scanner;
public class Read 
{
	int Reading(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner
	    int i = 2;
	    System.out.print("������� ������ ��������(����� �����): ");
	    // ���������� ������� ���� � ������ ����� ����� ������� ����� �����
	    if(sc.hasNextInt()) 
	    { 
	    	i = sc.nextInt(); // ��������� ����� ����� � ������ ����� � ��������� � ����������
	    	sc.close();
	        return i;
	    } 
	    else 
	    {
	    	System.out.println("�� ����� �� ����� �����"); 
	    	sc.close();
	    	return 0;
	    }
	}
}