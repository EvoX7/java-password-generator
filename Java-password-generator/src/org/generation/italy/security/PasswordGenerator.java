package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("LastName: ");
		String lastName = sc.nextLine();
		
		System.out.print("FavouriteColor: ");
		String favouriteColor = sc.nextLine();
		
		System.out.print("Day: ");
		int day = sc.nextInt();
		 
	    System.out.print("Month: ");
		int month = sc.nextInt();
		 
		System.out.print("Year: ");
		int year = sc.nextInt();
		
		int sum = day + month + year;
		String password = name + "-" + lastName + "-" + favouriteColor + "-" + sum;
		
		System.out.println(password);
		
	}

}


