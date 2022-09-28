package com.qa.testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageObject.ReleaseDatePage;
import com.qa.pageObject.ReleasedCountry;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReleaseDateTest {
	@Test
	public void verifyCountryName() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		ReleaseDatePage page=new ReleaseDatePage(driver);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		page.enterMovieName("pushpa wiki");
		page.clickOnLink();
		Thread.sleep(5000);
		String date_wiki = page.getReleaseDateWiki();
		System.out.println("release date on wiki=" +date_wiki);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		page.enterMovieName("pushpa imdb");
		page.clickOnLinkimdb();
		
		Thread.sleep(3000);
		
		
		String date_imd=page.getReleaseDateImdb();
		System.out.println("release date on imd=" +date_imd);
		Assert.assertEquals(date_imd, date_wiki);
	}


}
