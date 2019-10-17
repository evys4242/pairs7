package evys42.pairs7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P7StrategyTest {

	private static final Integer[] SAMPLE = {1, 2, 3, 4, 5, 6, 7, 0, -3, -5, -11, 12};

	@Test
	void testNestedLoop() {
		System.out.println();
		int fc = P7App.asNestedLoops(SAMPLE);
		Assertions.assertEquals(5, fc);
		System.out.println();
	}
	
	@Test
	void testStream() {
		System.out.println();
		int fc = P7App.asStreams(SAMPLE);
		Assertions.assertEquals(5, fc);
		System.out.println();
	}
}
