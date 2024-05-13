package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.addtocart;
import pagepkg.back;
import pagepkg.information;
import pagepkg.login;
import utilities.excelutilities;

public class saucedemologin {

	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}
	@Test(priority =1)
	public void loginWithCred() throws Exception
	{
		login p1 = new login(driver);
        String xl = "C:\\Users\\karth\\Desktop\\credentials.xlsx";
        String Sheet1="Sheet1";
        int rowCount = excelutilities.getRowCount(xl, Sheet1);

        for (int i=1;i<=rowCount;i++)

        {
        	
                    String username=excelutilities.getCellValue(xl, Sheet1, i, 0);
                    String password=excelutilities.getCellValue(xl, Sheet1, i, 1);                    
                    p1.setvalue(username,password);
                     p1.log();                                               
        }

		
	}
	@Test(priority =2)
	public void addcart()
	{
		addtocart p2= new addtocart(driver);
		p2.add();
		p2.viewcart();
		p2.checkout();
	}
	
	@Test(priority =3)
	public void infmtn()
	{
		information p3 = new information(driver);
		p3.informtndata("Karthika", "KB", "679121");
		
	}
	
	@Test(priority = 4)
	public void finishpage()
	{
		back p4 = new back(driver);
		p4.fnish();
		p4.backhome();
		p4.hamenu();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		p4.logout();
	}
}
