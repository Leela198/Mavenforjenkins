package amazontest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sourceamazon.Home_page_Amazon;
import sourceamazon.LoginPage;
import sourceamazon.SearchAmazon;

//login--search---logout
public class Testcase2

{
	static WebDriver driver;
@BeforeMethod
public void driverinitiation()
{
	driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
}
@Test
public void search() throws InterruptedException
{
	Home_page_Amazon h1=new Home_page_Amazon(driver);
	 h1.accountandlist(driver);
	 h1.signinbutton();
	 LoginPage lp=new LoginPage(driver);
	 lp.signin();
	 lp.continue_button();
	 lp.password();
	 lp.signin_pwd_buttn();
	 SearchAmazon sa=new SearchAmazon(driver);
	 sa.search_textfield();
}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
}
