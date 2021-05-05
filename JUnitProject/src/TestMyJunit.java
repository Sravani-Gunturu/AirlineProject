import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
/*import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;*/
import org.junit.Test;
public class TestMyJunit {
    @Test
    public void testWelcome1() {
        //String welcomeMessage ="Welcome to Junit";
    	GreetMessenger greetMsg = new GreetMessenger("Welcome to JUnit");
        assertEquals("Welcome to JUnit",greetMsg.getGreeting());
    }
    @Test
    public void testSomeAssertions()
    {
    	int empno = 7839;
    	String empname = "KING";
    	String empjob = "PRESIDENT";
    	
    	assertEquals("PRESIDENT", empjob);
    	System.out.println("empjob passed");
    	
    	assertTrue(empno > 1000);
    	System.out.println("empno passed..");
    	
    	assertNotNull(empname);
    	System.out.println("empname passed...");
    	
    	System.out.println("testSomeAssertions is over...");
    }
    @SuppressWarnings("deprecation")
	@Test
    public void testWithdraw() {
    	SavingsAccount savObj = new SavingsAccount(85000);
    	assertNotNull(savObj);
    	savObj.withdraw(15000);
    	assertEquals("MSG",new Double(70000.0), new Double(savObj.getBankBalance()));
    	//assertEquals(70000,savObj.getBankBalance(),"Balance is not matching");
    }
   
   
}