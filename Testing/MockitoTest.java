import java.util.ArrayList;
import static org.junit.Assert.assertEquals;				
import static org.junit.Assert.assertFalse;				

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.mockito.Mock;

import junit.framework.TestCase;

import org.junit.*;
public class MockitoTest {				

	@Mock
	ArrayList<String> list;				

    @BeforeClass		
    public static void m1() {							
        System.out.println("Using @BeforeClass , executed before all test cases ");					
    }		

    @Before		
    public void m2() {					
        list = new ArrayList<String>();					
        System.out.println("Using @Before annotations ,executed before each test cases ");					
    }		

    @AfterClass		
    public static void m3() {							
        System.out.println("Using @AfterClass ,executed after all test cases");					
    }		

    @After		
    public void m4() {					
        list.clear();			
        System.out.println("Using @After ,executed after each test cases");					
    }		

    @Test		
    public void m5() {					
        list.add("test");					
        assertFalse(list.isEmpty());			
        assertEquals(1, list.size());			
    }		
    @Test
    public void m9() {
    	 SampleCLass s=new SampleCLass();
   	  assertEquals(10, s.methodA(10));
    	
    }


    @Test(timeout = 10)			
    public void m7() {					
        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");					
    }		

    @Test(expected = NoSuchMethodException.class)					
    public void m8() {					
        System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");					

    }		
    
	
	 
	/*
	 * public static void main(String args[]) {
	 * 
	 * Result result = JUnitCore.runClasses(SampleTest.class); for (Failure failure
	 * : result.getFailures()) { System.out.println(failure.toString()); }
	 * System.out.println("Result=="+result.wasSuccessful()); }
	 */

}		