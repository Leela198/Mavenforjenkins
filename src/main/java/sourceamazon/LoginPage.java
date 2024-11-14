package sourceamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	WebElement signin;
	
	@FindBy(xpath="//span[@id=\"continue\"]") 
	WebElement continue_button;
	
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	WebElement password;
	
	@FindBy(xpath="//span[@id=\"auth-signin-button\"]")
	WebElement signin_pwd_buttn;
	
	
	//Komma£1234	
	
	public void signin()
	{
		signin.sendKeys("leela.rani2@gmail.com");
	}
	
	public void continue_button()
	{
		continue_button.click();
	}
	
	public void password()
	{
		password.sendKeys("Reddy@143");
	}
	public void signin_pwd_buttn() throws InterruptedException
	{
		signin_pwd_buttn.click();
		Thread.sleep(3000);
	}
	
}
