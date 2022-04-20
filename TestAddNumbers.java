package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		int add=junit.AddNumbers(175,175);
		assertEquals(350,add);
	}

}
