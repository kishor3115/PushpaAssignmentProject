package com.qa.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReleaseDatePage {
	WebDriver ldriver;
	public ReleaseDatePage(WebDriver rdriver)
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
	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")
	WebElement releaseDateWiki;
	public String getReleaseDateWiki()
	{
		String date_wiki=releaseDateWiki.getText();
		return date_wiki;
	}
	@FindBy(xpath="//h3[contains(text(),\"Pushpa: The Rise - Part 1 (2021) - IMDb\")]")
	WebElement link_imdb;
	public void clickOnLinkimdb()
	{
		link_imdb.click();
	}
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[10]/div[2]/ul/li[1]/div")
	WebElement releaseDateImdb;
	public String getReleaseDateImdb()
	{
		String date_imdb=releaseDateImdb.getText();
		return date_imdb;
	}
	

}
