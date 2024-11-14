package beforePOM;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class BrokenLinks
{
	
	public static void main(String[] args)
	{
		
	
	ChromeDriver driver = new ChromeDriver();

    // Maximize Window
    driver.manage().window().maximize();

    // Launch Google
    driver.get("https://www.google.co.in/");

    List<WebElement> links = driver.findElements(By.tagName("a"));

    System.out.println("Total links are " + links.size());

    for (int i = 0; i <= links.size(); i++)
    {
        try 
        {
            String nextHref = links.get(i).getAttribute("href");
            // System.out.println(nextHref);
          
            URL url = new URL(nextHref);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
           /* connection.setRequestMethod("GET");
            connection.connect();*/
            
            int code = connection.getResponseCode();
            String msg=connection.getResponseMessage();
            System.out.println("msg");
            System.out.println("code: " + code + "Url" + url);
            
              if (code == 200) 
              {
            	  System.out.println("Valid Link:" +nextHref);
              }
              
              else 
              { 
            	  System.out.println("INVALID Link:" +nextHref);
              }

             
        } 
              
       catch (Exception e) 
       {
            System.out.println("In Exception");
        }
    }
    // Close the browser
    driver.quit();
}
}

