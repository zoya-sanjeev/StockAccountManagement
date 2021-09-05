package com.bridgelabz.stockmanagement;

import java.util.*;	

public class StockPortfolio {

	List<Stock> listOfStocks;
	
	public StockPortfolio() {
		this.listOfStocks=new ArrayList<>();
	}	
	
	public void addStock(Stock stock) {
		listOfStocks.add(stock);
	}
	
	public double totalStocks() {
		Double totalStocks=0.0;
		for(Stock stock: listOfStocks) {
			totalStocks+=stock.valueOfStock();
		}
		return totalStocks();	
	}
}
