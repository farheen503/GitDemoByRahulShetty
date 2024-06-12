package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.LoginPage;
import TestBase.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TC_001 extends BaseClass{
	
//	LoginPage lp;
	
	@Test(priority=0,dataProvider="dp")
	public void  DataProvider(String uname,String pass) {
		
		WebElement sauce_uname=driver.findElement(By.xpath("//input[@id='user-name']"));
		sauce_uname.sendKeys(uname);
		sauce_uname.clear();
		WebElement sauce_pass=driver.findElement(By.xpath("//input[@id='password']"));
		sauce_pass.sendKeys(pass);
		sauce_pass.clear();
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		boolean status=driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
		Assert.assertTrue(status);
		//		lp=new LoginPage(driver);
//		lp.setCredentials(prop.getProperty("uname"), prop.getProperty("pass"));
//		lp.setUsername().sendKeys(uname);
//		lp.setPassword().sendKeys(pass);
//		lp.setClick();
//		Assert.assertTrue(lp.setTitle());
		
	}
	
	@DataProvider(name="dp")
	String [][]loginData(){
		String data[][]= {
				{"abc","pandu"},
				{"visual_user","secret_sauce"},
				
				
		};
		return data;
	}
	
	
}
