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
	    
	    // возвращает истинну если с потока ввода можно считать целое число
	   if(sc.hasNextInt()) 
	    { 
	    	i = sc.nextInt(); // считывает целое число с потока ввода и сохран€ем в переменную	    	
	    	//sc.close();
	        return i;
	    } 

	    System.out.println("¬ы ввели не целое число"); 
	    //sc.close();
	    return 0;
	}
}