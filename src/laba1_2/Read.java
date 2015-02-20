package laba1_2;
import java.util.Scanner;
public class Read 
{
	public int Reading(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
	    int i = 2;
	    System.out.print(args);
	    
	    // возвращает истинну если с потока ввода можно считать целое число
	   if(sc.hasNextInt()) 
	    { 
	    	i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
	    	sc.close();
	        return i;
	    } 

	    System.out.println("Вы ввели не целое число"); 
	    sc.close();
	    return 0;
	}
}