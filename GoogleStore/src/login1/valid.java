package login1;

import org.testng.annotations.DataProvider;

public class valid{
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0]="1300nehasingh@gmail.com";
		data[0][1]="Neha#321";
		
		data[1][0]="500069028@stu.upes.ac.in";
		data[1][1]="Neha#321";
		
		data[2][0]="1322neha.singh@gmail.com";
		data[2][1]="Neha#321";
		
		return data;		
	}
}