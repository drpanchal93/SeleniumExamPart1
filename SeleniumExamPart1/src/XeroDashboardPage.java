import java.io.IOException;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XeroDashboardPage extends ReUsableMethods_Exam
{
	public void clickUserMenu() throws IOException
	{
		WebElement UserMenu = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".username")));
		clickButton(UserMenu, "Usermenu");
	}
	public void clickLogout() throws IOException
	{
		WebElement LogoutButton = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".xn-h-profile-card-navigation-item.grid-3.logout>a")));
		clickButton(LogoutButton, "Logout");
	}
	
	public void clickProfile() throws IOException
	{
		WebElement ProfileButton = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".xn-h-profile-card-navigation-item.grid-3.profile>a")));
		clickButton(ProfileButton, "Profile");
	}
	public void clickAccount() throws IOException
	{
		WebElement AccountButton = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".xn-h-profile-card-navigation-item.grid-3.settings>a")));
		clickButton(AccountButton, "Account");
	}
	
	public void clickOrgName() throws IOException
	{
		WebElement OrgNameMenu = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".org-name")));
		clickButton(OrgNameMenu, "OrgMenu");
	}
	public void clickMyXero() throws IOException
	{
		WebElement MyXeroLink = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".myxero-link")));
		clickButton(MyXeroLink, "MyXero");
	}
}
