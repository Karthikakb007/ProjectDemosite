package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class back {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\'finish\']")
	WebElement finish;
	
	@FindBy(xpath="//*[@id=\'back-to-products\']")
	WebElement backhm;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")
	WebElement menu;
	
	@FindBy(xpath="//*[@id=\'logout_sidebar_link\']")
	WebElement logut;
	
	public back(WebDriver driver)
	{	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void fnish()
	{
		finish.click();
	}
	
	public void backhome()
	{
		backhm.click();
	}
	
	public void hamenu()
	{
		menu.click();
	}
	
	public void logout()
	{
		logut.click();
	}
	
	

}
