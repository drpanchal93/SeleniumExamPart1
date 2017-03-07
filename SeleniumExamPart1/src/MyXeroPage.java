import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyXeroPage extends ReUsableMethods_Exam 
{
	public void clickAddOrg() throws IOException
	{
		WebElement AddOrg = new WebDriverWait(Driver_Exam.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#ext-gen1043")));
		clickButton(AddOrg, "AddOrganization");
	}
}
