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
}
