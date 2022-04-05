package launching;

import java.io.IOException;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws IOException 
	{
	     
		init();
		launcher("chromebrowser");
		navigateUrl("certificateurl");

	}

}
