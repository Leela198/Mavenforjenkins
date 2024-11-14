package testfacebook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sourfacebook.Facebook_login_pomconcept;


public class login_facebook
{
	


		@Test
		public void login_to_facebook_with_valid_data() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			Facebook_login_pomconcept f1=new Facebook_login_pomconcept(driver);
			f1.un();
			f1.pwd();
			Thread.sleep(2000);
			f1.login();
			
			
			
		}
	}
