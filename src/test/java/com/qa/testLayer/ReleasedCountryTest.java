package com.qa.testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageObject.ReleasedCountry;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReleasedCountryTest {
	@Test
	public void verifyCountryName() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		ReleasedCountry page=new ReleasedCountry(driver);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		page.enterMovieName("pushpa wiki");
		page.clickOnLink();
		Thread.sleep(5000);
		String country_wiki = page.getCountryNameWiki();
		System.out.println("release country name on wiki is  " +country_wiki);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		page.enterMovieName("pushpa imdb");
		page.clickOnLinkimdb();
		
		Thread.sleep(3000);
		
		
		String country_imd=page.getCountryNameImdb();
		System.out.println("release name on imdb is " +country_imd);
		Assert.assertEquals(country_wiki, country_imd);
	}

}
