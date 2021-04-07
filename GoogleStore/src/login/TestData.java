package login;
import org.testng.annotations.DataProvider;

public class TestData{
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0]="mngr318884";
		data[0][1]="nEnYjyj";
		
		data[1][0]="mngr318885";
		data[1][1]="AtEmuha";
		
		data[2][0]="mngr318887";
		data[2][1]="ahEmevA";
		
		return data;		
	}
}