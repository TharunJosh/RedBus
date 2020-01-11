package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.base.ProjectSpecificMethods;


public class SearchPage extends ProjectSpecificMethods {

		public SearchPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);		
		}

	
	@FindBy(how=How.ID,using="src")
	private WebElement eleSource;

	public SearchPage enterSource(String source) throws InterruptedException{
		eleSource.sendKeys(source);
		Thread.sleep(3000);
		eleSource.sendKeys(Keys.TAB);		
		return this;
	}
	
	
	@FindBy(how=How.ID,using="dest")
	private WebElement eleDestination;

	public SearchPage enterDestination(String destination) throws InterruptedException{
		eleDestination.sendKeys(destination);
		Thread.sleep(3000);
		eleDestination.sendKeys(Keys.TAB);		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="(//td[@class='current day'])[2]")
	private WebElement onwardDate;

	public SearchPage enterDate(){
			onwardDate.click();	
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[@id='search_btn']")
	private WebElement searchButton;

	public SearchResultsPage clickSearch(){
		searchButton.click();	
		return new SearchResultsPage (driver);
	}

	
	
}
