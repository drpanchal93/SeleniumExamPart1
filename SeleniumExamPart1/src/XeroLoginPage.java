import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XeroLoginPage extends ReUsableMethods_Exam {
	
	
	public void launchBrowser()
	{
		Driver_Exam.driver.get("https://login.xero.com/");
		Driver_Exam.driver.manage().window().maximize();
	}
	public void enterEmailAddress(String textVal) throws IOException
	{
		WebElement EmailId = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#email")));
		String objName = "EmailAddress";
		enterText(EmailId, textVal, objName);
	}
	
	public void enterPwd(String textval) throws IOException
	{
		WebElement Password = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#password")));
		enterText(Password, textval, "Password");
		
		boolean isEncrypted = Password.getAttribute("type").equals("password");
		if(isEncrypted)
		{
			Update_Report("Pass", "Verify that password is encrypted", "The password entered is encrypted");
		}
		else
		{
			Update_Report("Fail", "Verify that password is encrypted", "The password entered is NOT encrypted");
		}
	}
	
	public void clickLoginButton() throws IOException
	{
		WebElement LoginButton = new WebDriverWait(Driver_Exam.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#submitButton")));
		clickButton(LoginButton, "LoginButton");
	}
	
	public void forgotPasswordLink() throws IOException
	{
		WebElement ForgotPwdLink = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".forgot-password-advert")));
		clickButton(ForgotPwdLink, "ForgotPassword");
	}
}
