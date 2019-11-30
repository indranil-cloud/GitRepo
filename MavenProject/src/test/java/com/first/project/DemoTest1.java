package com.first.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	
	@Test
		public void sum() {
		System.out.println("Sum1");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);		
	}
	
	@Test
	public void sub() {
		System.out.println("Sub1");
	int a=10;
	int b=20;
	Assert.assertEquals(10, b-a);		
}
	
	@Test
	public void div() {
		System.out.println("Div1");
	int a=10;
	int b=20;
	Assert.assertEquals(2, b/a);		
}
	@Test
	public void mul() {
		System.out.println("Mul1");
	int a=10;
	int b=20;
	Assert.assertEquals(200, b*a);		
}

	

}
