package com.bridgelabz.stockmanagement;

import java.util.Scanner;

public class StockMain {
	
	static Scanner scanner=new Scanner(System.in);
	

	public static Stock readStock() {
			
		System.out.println("Enter name of stock");
		String name=scanner.next();
		System.out.println("Enter number of shares");
		int shares=scanner.nextInt();
		System.out.println("Enter share price");
		double sharePrice=scanner.nextDouble();
		Stock newStock=new Stock(name,shares,sharePrice);
		
		return newStock;
		
	}

	public static void main(String[] args) {
		StockPortfolio stockPortfolio=new StockPortfolio();
		
		System.out.println("Enter number of stocks");
		int noOfStocks=scanner.nextInt();
		
		for(int count=0;count<noOfStocks;count++) {
			Stock newStock=readStock();
			stockPortfolio.addStock(newStock);
		}

	}


}
