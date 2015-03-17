package MainPackage;

import org.junit.Test;

public class JUnit {
	@Test
	public void testReturnTrue() {
		assertTrue("ReturnTrue returns true.", MyClass.ReturnTrue());
	}

	private void assertTrue(String string, boolean returnTrue) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testAddTwoNumbers() {
		assertEquals(10, MyClass.AddTwoNumbers(5, 5));
	}

	private void assertEquals(int i, int addTwoNumbers) {
		// TODO Auto-generated method stub
		
	}
}