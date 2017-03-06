import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Exam {

	public static WebDriver driver;
	public static int reportFlag = 0;
	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException {
		// TODO Auto-generated method stub
		
		String dataPath = "C:/DRASHTI/TekArch/SeleniumTestCases/ExamTestSuite.xls";
		
		String[][] recData = ReUsableMethods_Exam.readSheet(dataPath, "Sheet1");
		for(int i = 1; i <recData.length; i++){
			
			if(recData[i][1].equalsIgnoreCase("Y")){
				
				/*Firefox*/
				if(recData[i][3].equalsIgnoreCase("Y")){
					driver = new FirefoxDriver();
					reportFlag = 0;  // Reset
					String testScript = recData[i][2];
					ReUsableMethods_Exam.startReport(testScript, "C:/Users/drpanchal93/workspace-Selenium/SeleniumExamPart1/Report/", "Firefox");
					
					/*Java Reflection or Reflexive API*/
					Method ts = AutomationScripts_Exam.class.getMethod(testScript);
					ts.invoke(ts);
					
					driver.close();
					if(reportFlag == 0){
						ReUsableMethods_Exam.writeExcel(dataPath, "Sheet1", i, 5, "Pass");
					}else{
						ReUsableMethods_Exam.writeExcel(dataPath, "Sheet1", i, 5, "Fail");
					}
				}
				Thread.sleep(10000);
				// Chrome..
				if(recData[i][4].equalsIgnoreCase("Y")){
				
					System.setProperty("webdriver.chrome.driver", "C:/DRASHTI/TekArch/Jar/chromedriver_win32/chromedriver.exe");
					driver = new ChromeDriver();
					
					reportFlag = 0;  // Reset
					String testScript = recData[i][2];
					ReUsableMethods_Exam.startReport(testScript, "C:/Users/drpanchal93/workspace-Selenium/SeleniumExamPart1/Report/", "Chrome");
					
					/*Java Reflection or Reflexive API*/
					Method ts = AutomationScripts_Exam.class.getMethod(testScript);
					ts.invoke(ts);
					
					driver.close();
					if(reportFlag == 0){
						ReUsableMethods_Exam.writeExcel(dataPath, "Sheet1", i, 6, "Pass");
					}else{
						ReUsableMethods_Exam.writeExcel(dataPath, "Sheet1", i, 6, "Fail");
					}
				}
				
				
				
			}else{
				System.out.println("Row number :" +i+ " script is not executed..");
				System.out.println();
				ReUsableMethods_Exam.writeExcel(dataPath, "Sheet1", i, 3, "NA");
			}
			
			//ReUsableMethods_Exam.bw.close();
		}
	}
}
