import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner1 {
	public static void main(String[] args)
	{
		System.out.println("Running test class...");
		Result result = JUnitCore.runClasses(TestMyJunit.class);
		System.out.println("Getting failure if it has....");
		for(org.junit.runner.notification.Failure failure  : result.getFailures())
		{
			System.out.println(failure.toString());
			System.out.println("-----------");
		}
		System.out.println("Status :"+result.wasSuccessful());
	}
}
