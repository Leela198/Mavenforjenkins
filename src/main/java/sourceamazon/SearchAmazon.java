package sourceamazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAmazon 

{
	WebDriver driver;
	public SearchAmazon(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_textfield;
	@FindBy(xpath="(//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"])[1]")
	WebElement item1;
	//@FindBy(xpath=("//span[normalize-space()='Skybags Casual Backpack 28L, 2 Main Compartments, Bottle Pocket, Front Pocket, Padded Shoulder Strap']"))
	//WebElement item1;
	/*@FindBy(xpath=("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"))
	WebElement item1;*/
	
	public void search_textfield()
	{
		search_textfield.sendKeys("toys"+Keys.ENTER);
	}
	public void item1()
	{
		item1.click();
	}
}
