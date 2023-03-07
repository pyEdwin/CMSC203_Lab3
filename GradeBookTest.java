/**
 * author :Cyr Edwin Yapnounkie
 * Date:3/6/2023
 */



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {

	GradeBook gradeBookOne;
	GradeBook gradeBookTwo;
	
	@Before
	public void setUp() throws Exception {
		gradeBookOne = new GradeBook(5);
		gradeBookTwo=new GradeBook(5);
		gradeBookOne.addScore(12.0);
		gradeBookOne.addScore(13.0);
		gradeBookOne.addScore(14.0);
		gradeBookOne.addScore(15.0);
		gradeBookOne.addScore(16.0);
		gradeBookTwo.addScore(17.0);
		gradeBookTwo.addScore(18.0);
		
	}

	@After
	public void tearDown() throws Exception {
		gradeBookTwo = null;
		gradeBookOne = null;
	}

	@Test
	public void testAddScore() {
		//fail("Not yet implemented");
		assertEquals(5, gradeBookOne.getScoreSize());
		//assertEquals(2, gradeBookTwo.getScoreSize());
		//System.out.println(gradeBookOne);
		assertTrue(gradeBookOne.toString().equals("12.0 13.0 14.0 15.0 16.0 "));
		//assertTrue(gradeBookTwo.toString().equals("17.0 18.0 "));
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSum() {
		//fail("Not yet implemented");
		assertEquals(70.0, gradeBookOne.sum(),0.0001);
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMinimum() {
		//fail("Not yet implemented");
		//assertEquals(12.0 , gradeBookOne.minimum() );
		assertEquals(12.0, gradeBookOne.minimum(),.001);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testFinalScore() {
		//fail("Not yet implemented");
		assertEquals(58, gradeBookOne.finalScore(),.001);
	}

	@Test
	public void testGetScoreSize() {
		//fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
		
	}

}
