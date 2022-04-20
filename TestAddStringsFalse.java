package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStringsFalse {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		String add=junit.AddStrings("Tanishq ","Agarwal E20cse175");
		assertEquals("Tanishq Agarwal",add);
	}

}
