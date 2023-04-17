package keywords;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	  @DataProvider(name="inputs")
	  public String[][] getData()
	  {
		  return new String[][] {
			  {"lalita","121"},
			  {"Sonam","122"},
			  {"Dainy","123"}
			  
		  };
	  }
	  
	  @DataProvider(name="data")
	  public String[][] setData()
	  {
		  return new String[][] {
			  {"abc","000"},
			  {"xyz","111"},
			  {"pqr","222"}
			  
		  };
	  }

}
