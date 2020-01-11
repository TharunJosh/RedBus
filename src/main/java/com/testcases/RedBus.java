package com.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.base.ProjectSpecificMethods;
import com.pages.SearchPage;


public class RedBus extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		dataSheetName = "TC_01";
	}
	
	
	@Test(dataProvider="fetchData")
	public void printOpenSeats(String source , String destination) throws InterruptedException
	{
		new SearchPage(driver)
		.enterSource(source)
		.enterDestination(destination)
		.enterDate()
		.clickSearch()
		.clickViewSeat()
		.printAvailableSeats();


	}

}