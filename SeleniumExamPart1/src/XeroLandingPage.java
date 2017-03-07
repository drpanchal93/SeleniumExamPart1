import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XeroLandingPage extends ReUsableMethods_Exam
{
	public void launchBrowser()
	{
		Driver_Exam.driver.get("https://www.xero.com/us/");
		Driver_Exam.driver.manage().window().maximize();
	}
	public void clickLoginButton() throws IOException
	{
		WebElement LoginButton = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.glh-wrapper ul.glh-categories li a.glh-mainlink[href='https://login.xero.com/']")));
		clickButton(LoginButton, "Login");
	}
}
