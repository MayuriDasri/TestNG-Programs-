package TestNG_Programming;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BugReportUsingTestNG2 {
	 @Test
	    public void testBug() {
	        // Simulating a bug by comparing two unequal values
	        int actualResult = calculateSomething();
	        int expectedResult = 20;

	        // Assertion: Check if actualResult equals expectedResult
	        Assert.assertEquals(actualResult, expectedResult, "Bug: Actual result does not match expected result");
	    }

	    // Method to simulate calculation
	    private int calculateSomething() {
	        return 10; // Simulated incorrect result
	    }
	}

