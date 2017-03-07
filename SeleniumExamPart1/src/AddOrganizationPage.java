import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddOrganizationPage extends ReUsableMethods_Exam
{
	public void enterOrgName(String name) throws IOException
	{
		WebElement OrgName = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#text-1022-inputEl")));
		enterText(OrgName, name, "OrganizationName");
	}
	
	public void enterCountryWhichPaysTaxes(String CName) throws IOException
	{
		WebElement CountryName = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#countryCmb-inputEl")));
		CountryName.clear();
		enterText(CountryName,CName, "CountryName");
	}
	public void enterTimeZone(String timeZone) throws IOException
	{
		//div#cmbTimeZone-boundlist-listEl ul li:nth-child(125)
		WebElement TimeZone = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#cmbTimeZone-inputEl")));
		TimeZone.clear();
		enterText(TimeZone, timeZone, "TimeZone");
	}
}
