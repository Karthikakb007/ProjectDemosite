package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class information {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\'first-name\']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\'last-name\']")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\'postal-code\']")
	WebElement zipcode;
	
	@FindBy(xpath = "//*[@id=\'continue\']")
	WebElement continu;
	
	public information (WebDriver driver)
	{	
			this.driver=driver;
			PageFactory.initElements(driver,this);
	}
	
	public void informtndata(String fname, String lname, String zcode)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		zipcode.sendKeys(zcode);
		continu.click();
	}

}
