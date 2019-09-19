import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudent {

	@Test
	public void testMarks() {
		assertEquals("Fail",Student.marks(33));
		assertEquals("Pass",Student.marks(73));
	}
	
	@Test
	public void testResult() {
		assertEquals("B",Student.result(83));
		assertEquals("C",Student.result(73));
		assertEquals("Work Hard!!!!Aukha tera",Student.result(33));
	}
	

}
