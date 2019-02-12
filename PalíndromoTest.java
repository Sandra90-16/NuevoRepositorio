import junit.framework.TestCase;

public class PalíndromoTest extends TestCase {

	public PalíndromoTest(String name) {
		super(name);
	}
//12 feb 10.05 kigkyu
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	

	 public void testEspalindromoVacio() {
		 Palindromo palindromo = new Palindromo();
	        assertTrue(Palindromo.funcion(" "));
	
	       

	    }
	 public void testNoEspalindromoImpar() {
		 Palindromo palindromo = new Palindromo();
		 assertFalse(Palindromo.funcion("lkjhg"));
		
	    }
	 public void testEspalindromoImpar() {
		 Palindromo palindromo = new Palindromo();
		 assertTrue(Palindromo.funcion("ana"));
		
	    }
	 public void testEspalindromoPar() {
		 Palindromo palindromo = new Palindromo();
		 assertTrue(Palindromo.funcion("123321"));
		
	    }
	 public void testNoEspalindromoPar() {
		 Palindromo palindromo = new Palindromo();
		 assertFalse(Palindromo.funcion("12345678"));
		
	    }
	}