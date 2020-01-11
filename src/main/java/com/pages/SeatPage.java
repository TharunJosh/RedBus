package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.base.ProjectSpecificMethods;

public class SeatPage extends ProjectSpecificMethods {


	public SeatPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);		
		}

	
	@FindBy(how=How.XPATH,using="(//div[@class='seat-left m-top-30'])[1]")
	private WebElement openSeats;

	public SeatPage printAvailableSeats(){
		String availSeat = openSeats.getText();	
		System.out.println(availSeat);
		return this;
	}
	
}
