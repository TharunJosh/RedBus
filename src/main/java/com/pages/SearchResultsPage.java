package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.base.ProjectSpecificMethods;

public class SearchResultsPage extends ProjectSpecificMethods {


	public SearchResultsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);		
		}

	
	@FindBy(how=How.XPATH,using="(//div[@class='button view-seats fr'])[1]")
	private WebElement viewSeat;

	public SeatPage clickViewSeat(){
		viewSeat.click();		
		return new SeatPage(driver);
	}
	

}
