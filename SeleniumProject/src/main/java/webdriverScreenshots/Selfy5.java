package webdriverScreenshots;

import java.util.Date;

public class Selfy5 
{

	public static void main(String[] args) 
	{
		Date date= new Date();
		System.out.println(date);
		
		String res = date.toString().replace(":", "_").replace(" ", "_");
		System.out.println(res);
	}

}
