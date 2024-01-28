import static org.junit.Assert.*;

import org.junit.Test;

import MyPack1.MyCalc;

public class MyCalcTest {
	
	@Test
	public void test1()
	{
		MyCalc mc=new MyCalc();
		assertEquals(30,mc.sum(10, 20));
	}

}
