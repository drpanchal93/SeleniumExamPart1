import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XeroProfileSettingsPage extends ReUsableMethods_Exam
{
	public void clickUploadImageButton() throws IOException
	{
		WebElement UploadImageButton = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#button-1041-btnInnerEl")));
		clickButton(UploadImageButton, "UploadImage");
	}
	public void BrowsePhoto(String path)
	{
		new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#filefield-1174-button-fileInputEl"))).sendKeys(path);
	}
	public void clickUploadButton() throws IOException
	{
		WebElement UploadButton = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#button-1178")));
		clickButton(UploadButton, "Upload");
	}
	public void clickCancelButton() throws IOException
	{
		WebElement CancelButton = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#button-1179")));
		clickButton(CancelButton, "Cancel");
	}
}

