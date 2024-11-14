package sourceamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_Amazon 
{
	//step 1 locate the elements
	WebDriver driver;
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
	WebElement accountandlist;
	@FindBy(xpath="//span[@class=\"nav-action-inner\"]")
	WebElement signinbutton;
	
	
	
	
	//step 2 each component will have separate method
	public void accountandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	
	
	public void signinbutton()
	{
		signinbutton.click();
	}
	
	//step 3 initializing using pagefactory and constructor
	public Home_page_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
}
