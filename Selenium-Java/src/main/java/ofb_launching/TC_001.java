package ofb_launching;

import java.io.IOException;

public class TC_001 extends BaseTest
{
	

	public static void main(String[] args) throws IOException 
	{
		
		dataFile();
		launchBrowser("chromebrowser");
		getUrl("certificateurl");
		

	}

}
