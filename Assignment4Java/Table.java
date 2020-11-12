package Assignment4;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	int a, i, table;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	a=sc.nextInt();
	
	 System.out.println("Table of " + a + " is: ");
     for(i=1; i<=10; i++)
     {
         table = a*i;
         System.out.println(a + " * " + i + " = " + table);
sc.close();
}
}
}
