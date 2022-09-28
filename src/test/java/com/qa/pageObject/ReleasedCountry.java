package com.qa.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReleasedCountry 
{
	WebDriver ldriver;
	public ReleasedCountry(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement searchbox_google;
	public void enterMovieName(String movieName)
	{
		searchbox_google.sendKeys(movieName + Keys.ENTER);
	}
	@FindBy(xpath="//h3[contains(text(),\"Pushpa: The Rise - Wikipedia\")]")
	WebElement link;
	public void clickOnLink()
	{
		link.click();
	}
	@FindBy(xpath="//th[contains(text(),'Country')]")
	WebElement country;
	public String getCountryNameWiki()
	{
		String country_wiki=country.getText();
		return country_wiki;
	}
	@FindBy(xpath="//h3[contains(text(),\"Pushpa: The Rise - Part 1 (2021) - IMDb\")]")
	WebElement link_imdb;
	public void clickOnLinkimdb()
	{
		link_imdb.click();
	}
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[10]/div[2]/ul/li[2]/div/ul/li/a")
	WebElement countryNameImdb;
	public String getCountryNameImdb()
	{
		String country_imdb=countryNameImdb.getText();
		return country_imdb;
	}
	
	
}
