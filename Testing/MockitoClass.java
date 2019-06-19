import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class MockitoClass {
	 @Test
	    public void fooGreets() {
	        Foo foo = mock(Foo.class);
	        when(foo.greet()).thenReturn("HELLO_WORLD");
	        System.out.println("Foo greets: " + foo.greet());
	        assertEquals(foo.greet(), "HELLO_WORLD");
	    }

}
