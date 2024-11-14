package sourceamazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddtoWishlist 
{
	//constructor
	WebDriver driver;
public AddtoWishlist(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//@FindBy(xpath="(//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"])[1]")
//WebElement item1;

//@FindBy(xpath="//span[normalize-space()='Mirana C-Type USB Rechargeable Battery Powered Hover Football Indoor Floating Hoverball Soccer | Air Football Smart | Original Made in India Fun Toy for Boys and Kids (Red)']")
//WebElement item1;
@FindBy(id="add-to-wishlist-button-submit")

WebElement addwishlist_bttn;
@FindBy(xpath="//span[@id=\"huc-view-your-list-button\"]")
WebElement view_cart;
@FindBy(xpath="//span[@id=\"pab-I3PG137T9H68NN\" and @class=\"a-button a-button-normal a-button-primary a-button-icon wl-info-aa_add_to_cart\"]")
WebElement add_to_cart;
@FindBy(xpath="(//span[.=\"View Cart\"])")
WebElement view_cart2;


@FindBy(xpath="//span[@class=\"a-size-small sc-action-delete\" and @data-action=\"delete\"]")
WebElement delete;


//input[@name="submit.delete.477c1747-cab5-4c56-8b9d-2307ae152dda" and @data-feature-id="item-delete-button"]//span[@id="pab-I3PG137T9H68NN" and @class="a-button a-button-normal a-button-primary a-button-icon wl-info-aa_add_to_cart"]

 /* @FindBy(xpath="(//span[@class=\"a-button a-button-primary g-cart-checkout-btn\"])")
WebElement proceed_to_checkout;
//(//span[@class="a-button a-button-primary g-cart-checkout-btn"])
@FindBy(linkText="Edit quantity")
WebElement edit_qty;*/


public void newwindow(WebDriver driver) throws InterruptedException
{
	Set<String> s1=driver.getWindowHandles();
	 System.out.println(s1);
		Iterator<String>  li=s1.iterator();
		String parentid=li.next();
		String childid=li.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
	
	
}

public void view_cart() throws InterruptedException
{
	Thread.sleep(2000);
	view_cart.click();
}
public void addwishlist_bttn() throws InterruptedException
{
	//addwishlist_bttn.click();
Thread.sleep(2000);

addwishlist_bttn.click();
	
}

public void add_to_cart() throws InterruptedException
{
	Thread.sleep(2000);
	add_to_cart.click();
}

public void view_cart2() throws InterruptedException
{
	Thread.sleep(2000);
	view_cart2.click();
}

public void delete() throws InterruptedException
{
	Thread.sleep(2000);
	delete.click();
}
/*public void edit_qty()
{
	edit_qty.click();
}
public void proceed_to_checkout() throws InterruptedException
{
	Thread.sleep(2000);
	proceed_to_checkout.click();
}
*/


}
