package document;

import static org.junit.Assert.*;

import org.junit.Test;

public class DocumentTest {
	
	Document doc= new Document("Test") {
		
		@Override
		public int getNumWords() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getNumSyllables() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getNumSentences() {
			// TODO Auto-generated method stub
			return 0;
		}
	};

	@Test
	public void testIsVowelCorrect() {
		
		assertTrue(doc.isVowel("Test", 1));
		assertTrue(doc.isVowel("Equals", 0));
		assertTrue(doc.isVowel("Equals", 2));
	
	}
	
	@Test
	public void testIsVowelIncorrect() {
		assertFalse(doc.isVowel("Test", 0));
		assertFalse(doc.isVowel("Equals", 4));
		//assertFalse(doc.isVowel("", 0));
	}

	@Test
	public void testCountSyllablesCorrect() {
		assertEquals(1, doc.countSyllables("The"));
		assertEquals(1, doc.countSyllables("Then"));
		assertEquals(1, doc.countSyllables("Here"));
		assertEquals(2, doc.countSyllables("Hello"));
		assertEquals(4, doc.countSyllables("Identical"));
		assertEquals(4, doc.countSyllables("Literature"));
		
	}
	
	@Test
	public void testCountSyllablesDupl() {
		assertEquals(1, doc.countSyllables("Theee"));
		assertEquals(2, doc.countSyllables("Heello"));
		assertEquals(2, doc.countSyllables("Segue"));
		
		
	}
	
public void testIsNotVowelCorrect() {
		
		assertFalse(doc.isNotVowel("Test", 1));
		assertFalse(doc.isNotVowel("Equals", 0));
		assertFalse(doc.isNotVowel("Equals", 2));
	
	}
	
	@Test
	public void testIsNotVowelIncorrect() {
		assertTrue(doc.isNotVowel("Test", 0));
		assertTrue(doc.isNotVowel("Equals", 4));
		//assertFalse(doc.isVowel("", 0));
	}

}
