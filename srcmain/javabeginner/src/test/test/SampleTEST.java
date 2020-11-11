package test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SampleTEST {
	
	TempCon calcTemp = new TempCon();
	
	@BeforeAll
	public void init() {
	System.out.println("Beginning Test");
	
	}
	@Test
	public void test1() {
		calcTemp = new TempCon();
		
	}
	@AfterAll
	public void finalise() {
	System.out.println("Done");
	}
	 
	
	
		
}
