package eql.ai108.khaled;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {
	private CalculMetier metier;

	protected void setUp() throws Exception {
		super.setUp();
		metier = new CalculMetier();
	}

	public void testSomme() {
		assertTrue(metier.somme(9, 10)==19);
	}
	public void testProduit() {
		assertTrue(metier.produit(9, 10)==90);
	}

}
