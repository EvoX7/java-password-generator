package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		String lastName = sc.nextLine();
		String favouriteColor = sc.nextLine();
		
		 int day = sc.nextInt();
		 int month = sc.nextInt();
		 int year = sc.nextInt();
		
		 System.out.println(name  + lastName + favouriteColor + (day + month + year) );
		
	}

}


