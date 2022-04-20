package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		String add=junit.AddStrings("Tanishq ","Agarwal");
		assertEquals("Tanishq Agarwal",add);
	}

}
