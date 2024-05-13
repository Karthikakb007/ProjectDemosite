package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(id="login-button")
	WebElement loginb;
	
	public  login(WebDriver driver)
	{
			this.driver=driver;
			PageFactory.initElements(driver,this);
	}
	
	public void setvalue(String user, String pass)
	{
		userName.clear();
		userName.sendKeys(user);
		passWord.clear();
		passWord.sendKeys(pass);
	}
	public void log()
	{
		loginb.click();
	}

}
