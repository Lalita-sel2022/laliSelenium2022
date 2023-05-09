package Project;


import java.util.Arrays;

import org.testng.TestNG;

public class RunSuiteParallel extends BaseClass
{

	public static void main(String[] args) {
		
		TestNG obj= new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {projectPath+"\\meghasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
		

	}

}
