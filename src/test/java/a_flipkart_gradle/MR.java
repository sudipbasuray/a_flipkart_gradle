package a_flipkart_gradle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MR 
{

	static WebDriver driver;
	
	public void Applaunch() throws InterruptedException
	{
		driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
	}
	
	public void AppClose()
	{
		driver.close();
	}
	public void AppLogin(String Email , String Password) throws InterruptedException, AWTException
	{
		WebElement email =driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		email.sendKeys(Email);
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		password.sendKeys(Password);
		Thread.sleep(4000);
		WebElement login =driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		login.click();
		Thread.sleep(4000);
	}
	public boolean VerifyLogin()
	{
		WebElement button =driver.findElement(By.xpath("//[contains(text(),'Login & Signup']"));
		if (button.isDisplayed())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
