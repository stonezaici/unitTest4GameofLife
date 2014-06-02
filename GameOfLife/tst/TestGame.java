
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestGame {
	int[][] testCase = {{1,1,0},{0,1,0},{1,0,1}};
	surviveGame g = new surviveGame(testCase,3,3);

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test 
	public void testisLive(){
		int[][] testCase = {{}};
		surviveGame g = new surviveGame(testCase,3,3);
		boolean rlt = g.isLive(true, 3);
		org.junit.Assert.assertTrue(rlt);
	}
	@Test 
	public void testisLiveShoudDie(){
		int[][] testCase = {{}};
		surviveGame g = new surviveGame(testCase,3,3);
		boolean rlt = g.isLive(true, 6);
		org.junit.Assert.assertFalse(rlt);
	}
	

	@Test
	public void testcountN() {	
		int rlt = g.countN(0, 0);
		org.junit.Assert.assertEquals(2, rlt);	
	}	
	@Test
	public void testcountN2() {
		int rlt = g.countN(2, 2);
		org.junit.Assert.assertEquals(1, rlt);
		
	}	

	@Test
	public void testnextG(){
		int[][] expectRlt = {{1,1,0},{0,0,1},{0,1,0}};
		int[][] rlt = g.nextG();
		org.junit.Assert.assertArrayEquals(expectRlt, rlt);
	}
}
