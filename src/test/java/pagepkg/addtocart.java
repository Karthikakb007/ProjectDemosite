
package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button")
	List<WebElement>addcart;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[3]/a")
	WebElement viewcrt;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[2]/button[2]")
	WebElement chekout;
	
	public addtocart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void add()
	{
		for(WebElement cartele: addcart)
		{
			String text=cartele.getText();
			if(text.equals("Add to cart")) 
        	{
        		cartele.click();
        	}
		}
			
	}
	public void viewcart()
	{
		viewcrt.click();
	}
	
	public void checkout()
	{
		chekout.click();
	}
}
