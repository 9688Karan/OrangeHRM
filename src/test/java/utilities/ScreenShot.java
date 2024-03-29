package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void captureScreen(WebDriver driver, String name) throws IOException, InterruptedException {
		
				
				//capture screenshot
						TakesScreenshot tss=(TakesScreenshot)driver;
						
						File source=tss.getScreenshotAs(OutputType.FILE);
						
						File file=new File(System.getProperty("user.dir")+"\\Screenshot\\"+name+".png");
						
						FileHandler.copy(source, file);
						
						System.out.println("ScreenShot captured successfully");

	}

	
}
	
