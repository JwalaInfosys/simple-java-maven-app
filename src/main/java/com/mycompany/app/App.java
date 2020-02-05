package com.mycompany.app;
import java.util.*;

/**
 * Hello world!
 */
public class App
{

	public static void main(String[] args){
    String s2="James Gosling";
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Who is the Inverntor of Java??");
			
			Scanner s=new Scanner(System.in);
			
			String s1=s.nextLine();
			
			if(s2.equalsIgnoreCase(s1))
			{
				System.out.println("Yes correct");
				System.exit(0);
			}
			else{
				
				System.out.println("Try Again");
			}
			
		}
		System.out.println(s2);
		}

}
