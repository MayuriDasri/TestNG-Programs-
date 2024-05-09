package TestNG_Programming;

import org.testng.annotations.Test;

public class BugReportingUsingTestNG {
	
	    @Test
	    public void reproduceBug() {
	        // Step 1: Perform actions to reproduce the bug
	        int result = divide(10, 0); // Trying to divide by zero to reproduce the bug

	        // Step 2: Verify bug behavior
	        assert result == -1 : "Bug: Division by zero should return -1";

	        // Step 3: Report the bug
	        reportBug("Division by zero results in negative value");
	    }

	    // Method to divide two numbers, but has a bug when dividing by zero
	    private int divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            // Return -1 to indicate a bug condition
	            return -1;
	        }
	        return dividend / divisor;
	    }

	    // Method to report the bug (can be replaced with actual bug reporting mechanism)
	    private void reportBug(String bugDescription) {
	        System.out.println("Bug Report: " + bugDescription);
	        // Additional code to log or report the bug to a bug tracking system
	    }
	}
