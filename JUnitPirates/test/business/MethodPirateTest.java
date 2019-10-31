package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodPirateTest {

	@Test
	public void isDead() {
		Pirate p = new Pirate("Captain Crunch");
		assertFalse(p.isDead());
	}

}
