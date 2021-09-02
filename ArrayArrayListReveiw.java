// Evan White
import java.util.Arrays;
import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayArrayListReveiw {

	public static void main(String[] args) throws IOException{
		
		int temp = 0;
		int num = 0;
		int counter = 0;
		
		
		Scanner input = new Scanner(new File("input.txt"));
		
		ArrayList <Integer> list1 = new ArrayList <Integer>();
		Integer []list2 = new Integer[15];
		
		while(input.hasNext())
		{
		       temp = Integer.parseInt(input.nextLine());
		       list2[counter] = temp;
		       list1.add(temp);

			   counter++;
			}
		
		
		for(int i = 0; i < list2.length; i++)
		{
			
			
			
			
			
		}
		System.out.println(Arrays.toString(list2));
		
	
		
		list2[3] = 9;
		list2[5] = 12;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Start Array List" + list1);
		
		if(list1.contains(19))
		{
		 list1.remove(list1.indexOf(19));
		 System.out.println("Element with value 19 removed " + list1);
		}
		
		else
		{
			System.out.println("No element with value 19 found ");
		}
		
		if(list1.contains(7))
		{
			list1.remove(list1.indexOf(7));
		}
		else 
		{
			System.out.println("No element with value 7 found ");
		}
		
		list1.set(3, 9);
		System.out.println("With 9 " + list1);
		
		list1.set(5, 12);
		System.out.println("With 12 " + list1);

		
	}

}
