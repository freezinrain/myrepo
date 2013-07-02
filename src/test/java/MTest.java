

import org.junit.*;

import sample.test.MyFirst;
import static junit.framework.Assert.*;

public class MTest { 
	private MyFirst first;
	
	@Before
	public void setUp() {
		first = new MyFirst();
	}
	
	@Test
	public void testDoSoth() {
		assertEquals("no equal", "x",  first.doSoth(2));
	}
}
