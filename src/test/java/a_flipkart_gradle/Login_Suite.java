package a_flipkart_gradle;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Suite 
{

	WebDriver driver;
	MR mr =new MR();
	
	@BeforeMethod
	public void applaunch() throws InterruptedException
	{
		mr.Applaunch();
	}
	
	@Test(priority=0)
	public void login()
	{
		try {
		mr.AppLogin("sudip00780@gmail.com", "sudbasuray");
		Assert.assertEquals(true, mr.VerifyLogin());
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}
	@Test(priority=1)
	public void failedlogin()
	{
		try {
			mr.AppLogin("asdasd", "sdsad");
			Assert.assertEquals(false, mr.VerifyLogin());
		}
		catch(Exception e)
		{
			System.out.println("Login Unsuccesful");
		}
	}
	@AfterMethod()
	public void appclose()
	{
		mr.AppClose();
	}
}
