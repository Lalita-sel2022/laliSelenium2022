package Listeners_Demo;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project.BaseClass;
@Listeners(Listeners_Demo.TestListener.class)

public class HighlightElement extends BaseClass
{
  @Test
  public void highlightFailedEle() throws IOException {
	  
	    init();
		launchBrowser("firefox");
		navigateUrl("amazonurl");
		selectOption("amazondropdown_id", "Books");
		enterText("searchtext_id", "Harry potter");
  }
}
