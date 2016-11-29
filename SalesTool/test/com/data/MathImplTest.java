package com.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathImplTest {
	MathImpl math;
	Double par1 = 23.0, par2 =12.0;
	
	@Before
	public void setUp() throws Exception {
		math = new MathImpl();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertTrue(math.add(par1, par2) == par1 + par2);
	}

	@Test
	public void testSub() {
		assertTrue(math.sub(par1, par2) == par1 - par2);
	}

	@Test
	public void testRem() {
		assertTrue(math.add(par1, par2) == par1 % par2);
	}

	@Test
	public void testDiv() {
		assertTrue(math.add(par1, par2) == par1 / par2);
	}

	@Test
	public void testMult() {
		assertTrue(math.add(par1, par2) == par1 * par2);
	}

}
