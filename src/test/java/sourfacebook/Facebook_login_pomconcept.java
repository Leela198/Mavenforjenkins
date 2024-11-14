package sourfacebook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login_pomconcept 

{
	
	

	
	//step 1
		WebDriver driver;
		@FindBy(id="email") 
		WebElement username_tf;
		
		@FindBy(name="pass") 
		WebElement password_tf;
		
		@FindBy(xpath="//button[@name='login']") 
		WebElement login_button;
		
		//step 2
		public void un()
		{
			username_tf.sendKeys("leela.rani2@gmail.com");
		}
		public void pwd()
		{
			password_tf.sendKeys("bgy65redcfvgh");
		}
		public void login()
		{
			login_button.click();
		}
		//step 3
		public Facebook_login_pomconcept(WebDriver driver)
		{
			PageFactory.initElements(driver,this );
		}
		
	}


