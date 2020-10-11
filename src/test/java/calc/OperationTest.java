package calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class OperationTest {
	private static Operation op;
	
	@BeforeAll
	static void initialize() {
		op = new Operation();
	}
	
	@Test
	void tester_plus() {
		assertEquals(8, op.plus(5, 3));
	}
	
	@Test
	void tester_moins() {
		assertEquals(2, op.moins(5, 3));
	}
	
	@Test
	void tester_mul() {
		assertEquals(15, op.mul(5, 3));
	}
	
	@Test
	void tester_div() {
		assertEquals(1, op.div(5, 3));
	}
	
	@Test
	void tester_mod() {
		assertEquals(2, op.mod(5, 3));
	}
}
