package amazontest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import sourceamazon.Home_page_Amazon;
import sourceamazon.LoginPage;

public class Testcase1 
{
	WebDriver driver;
 @Test
 public void logintoamazon() throws InterruptedException
 {
	  driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 Home_page_Amazon h1=new Home_page_Amazon(driver);
	 h1.accountandlist(driver);
	 h1.signinbutton();
	 LoginPage lp=new LoginPage(driver);
	 lp.signin();
	 lp.continue_button();
	 lp.password();
	 lp.signin_pwd_buttn();
 }
 
}
