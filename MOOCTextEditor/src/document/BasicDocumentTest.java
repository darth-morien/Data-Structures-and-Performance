package document;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BasicDocumentTest extends BasicDocument {
		
	public BasicDocumentTest() {
		super("Test");
		
	}

	BasicDocument doc= new BasicDocument("Test");
	
	@Test
	public void testGetNumSyllables() {
		//assertEquals(3, doc.countSyllables("Hello world!"));
		//assertEquals(32, doc.countSyllables("Lorem ipsum dolor sit amet, qui ex choro quodsi moderatius, nam dolores explicari forensibus ad."));
	}
	
	@Test
	public void testGetNumSyllablesMore() {
		assertEquals(32, doc.countSyllables("Lorem ipsum dolor sit amet, qui ex choro quodsi moderatius, nam dolores explicari forensibus ad."));
	}
	
		
	@Test
	public void testGetNumSyllablesMore2() {
		assertEquals(9, doc.countSyllables("Lorem ipsum dolor sit amet"));
		assertEquals(6, doc.countSyllables("many???  Senteeeeeeeeeences are"));
		/*assertEquals(49, doc.countSyllables("Here is a series of test sentences. Your program should "
				+ "find 3 sentences, 33 words, and 49 syllables. Not every word will have "
				+ "the correct amount of syllables (example, for example), "
				+ "but most of them will."));*/
		/*assertEquals(16, doc.countSyllables("This is a test.  How many???  "
		        + "Senteeeeeeeeeences are here... there should be 5!  Right?"));*/
		//assertEquals(12, doc.countSyllables("This is a test. How many???  Senteeeeeeeeeences are here..."));
		assertEquals(1, doc.countSyllables("are"));
		assertEquals(1, doc.countSyllables("here"));
		assertEquals(2, doc.countSyllables("Segue"));
	}
	
	
	

}