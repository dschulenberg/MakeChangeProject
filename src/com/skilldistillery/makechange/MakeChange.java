package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How much was the item?");
		double cost = scan.nextDouble();

		System.out.println("How much money was given?");
		double given = scan.nextDouble();

		if (cost > given || cost == given) {
			System.out.println(notEnough(cost, given));
		}
		System.out.println();
		System.out.println("CHA CHING. The amount refunded is:");
		System.out.println();
		changeLeft(cost, given);

		scan.close();
	}

	public static String notEnough(double cost, double given) {
		if (cost > given) {
			return		"You provided too little money. Please try again.";
		} else {
			return		"Thank you for providing the exact amount.";
		}
	}
	

	public static void changeLeft(double cost, double given) {
		double remainder = given - cost, ten = 10, five = 5, one = 1, quarter = .25, dime = .10, nickle = .05, penny = .01;
		while (remainder != 0 && remainder > 0) { 
			double divide = Math.floor(remainder / ten);
			if (divide >= 1) {
				double leftover = remainder - ten * divide;
				remainder = leftover;
				if (divide == 1) {
					System.out.println(divide + " ten dollar bill ");
				} else {
					System.out.println(divide + " ten dollar bills ");
				}
				continue; 						
			} else if (remainder > five) {
				divide = Math.floor(remainder / five);
				if (divide >= 1) {
					double leftover = remainder - five * divide;
					remainder = leftover;
					if (divide == 1) {
						System.out.println(divide + " five dollar bill ");
					} else {
						System.out.println(divide + " five dollar bills ");
					}
					continue;
				}
			} else if (remainder > one) {
				divide = Math.floor(remainder / one);
				if (divide >= 1) {
					double leftover = remainder - one * divide;
					remainder = leftover;
					if (divide == 1) {
						System.out.println(divide + " one dollar bill");
					} else {
						System.out.println(divide + " one dollar bills ");
					}
					continue;
				}
			} else if (remainder > quarter) {
				divide = Math.floor(remainder / quarter);
				if (divide >= 1) {
					double leftover = remainder - quarter * divide;
					remainder = leftover;
					if (divide == 1) {
						System.out.println(divide + " quarter ");
					} else {
						System.out.println(divide + " quarters ");
					}
					continue;
				}
			} else if (remainder > dime) {
				divide = Math.floor(remainder / dime);
				if (divide >= 1) {
					double leftover = remainder - dime * divide;
					remainder = leftover;
					if (divide == 1) {
						System.out.println(divide + " dime ");
					} else {
						System.out.println(divide + " dimes");
					}
					continue;
				}
			} else if (remainder > nickle) {
				divide = Math.floor(remainder / nickle);
				if (divide >= 1) {
					double leftover = remainder - nickle * divide;
					remainder = leftover;
					if (divide == 1) {
						System.out.println(divide + " nickle ");
					} else {
						System.out.println(divide + " nickles");
					}
					continue;
				}
			} else if (remainder > penny || remainder > 0.001) {
				divide = Math.round(remainder/penny);
				if (divide >= 1) {
					double leftover = remainder - penny * divide;
					remainder = leftover;
					if (divide == 1) {
						System.out.println(divide + " penny ");
					} else {
						System.out.println(divide+ " pennies");
					}
				}
			}
		break;	
		}
	}
}