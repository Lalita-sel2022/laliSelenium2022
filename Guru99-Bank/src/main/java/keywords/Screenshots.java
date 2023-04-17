package keywords;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import reportings.BaseClass;

public class Screenshots extends BaseClass {
	
	public static String takeScreenshot() throws IOException
	{
		  String file=".png";
		  String directory=projectPath+"\\Screenshots\\";
		  System.out.println("Project path is ::"+directory);
		  File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File(directory+file));
		  String dest=directory+file;
		  return dest;
	}
	

}
