package se.iths;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
public class Lab1Test {
	public static Lab1 lab;

	
	@BeforeClass
	public static void start(){
	 lab = new Lab1();
	}
	
	@Category(MathematicTest.class)
	@Test
	public void addtest() {
	  int result = lab.add(3,5);
	  assertEquals(8, result);
	}
	
	@Category(MathematicTest.class)
	@Test
	public void subtracttest(){
		int result = lab.subtract(5, 3);
		assertEquals(2, result);
	}
	
	@Category(MathematicTest.class)
	@Test
	public void multiplytest(){
		int result = lab.multiply(3, 3);
		assertEquals(9, result);
	}
	
	@Category(MathematicTest.class)
	@Test
	public void dividetest(){
		int result = lab.divide(6, 2);
		assertEquals(3, result);
	}
	
	@Category(MathematicTest.class)
	@Test(expected=ArithmeticException.class)
	public void dividetest1(){
		int result = lab.divide(6, 0);
		assertEquals(0, result);
	}
	
	@Test
	public void reversetest(){
		String result = lab.reverse("java");
		assertEquals("avaj", result);
	}
	
	@Test
	public void quotetest(){
		String result = lab.quote();
		assertNotNull(result);
	}
	
	@Test
	public void quotetest1(){
		boolean a = false;
		String str1 = "We cannot solve our problems with the same thinking we used when we created them. - Albert Einstein";
		String result = "";
		while(a != true){
			result = lab.quote();
		    a = result.equals(str1);
			}
		     assertEquals(str1, result);
		}
	
	@Test
	public void quotetest2(){
		boolean a = false;
		String str2 = "A fool thinks himself to be wise, but a wise man knows himself to be a fool. - William Shakespeare";
		String result = "";
		while(a != true){
			result = lab.quote();
		    a = result.equals(str2);
		}	
				assertEquals(str2, result);
			}
		
	@Test
	public void quotetest3(){
		boolean a = false;
		String str3 = "You must be the change you wish to see in the world. - Mahatma Gandhi";
		String result = "";
		while(a != true){
			result = lab.quote();
		    a = result.equals(str3);
		}		
				assertEquals(str3, result);
			}
		
	@Test
	public void quotetest4(){
		boolean a = false;
		String str4 = "In the End, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King, Jr.";
		String result = "";
		while(a != true){
			//counter ++;
			result = lab.quote();
		    a = result.equals(str4);
		}		
				assertEquals(str4, result);
			}
		
	@Test
	public void quotetest5(){
		boolean a = false;
		String str5 = "Choose a job you love, and you will never have to work a day in your life. - Confucius";
		String result = "";
		while(a != true){
			//counter ++;
			result = lab.quote();
		    a = result.equals(str5);
		}		
				assertEquals(str5, result);
			}
		
	@Test
	public void quotetest6(){
		boolean a = false;
		String str6 = "To expect the unexpected shows a thoroughly modern intellect. - Oscar Wilde";
		String result = "";
		while(a != true){
			//counter ++;
			result = lab.quote();
		    a = result.equals(str6);
		}	
				assertEquals(str6, result);
			}
		
	@Test
	public void quotetest7(){
		boolean a = false;
		String str7 = "Without music, life would be a mistake. - Friedrich Nietzsche";
		String result = "";
		while(a != true){
			//counter ++;
			result = lab.quote();
		    a = result.equals(str7);
		}	
				assertEquals(str7, result);
			}
		
	@Test
	public void quotetest8(){
		boolean a = false;
		String strdf = "I love deadlines. I like the whooshing sound they make as they fly by. - Douglas Adams";
		String result = "";
		while(a != true){
			result = lab.quote();
		 a = result.equals(strdf);
		}
			assertEquals(strdf, result);
		 }
		 
	@Test
	public void accounttest(){
		int count = lab.getCounter();
		lab.add(1, 2);
		count ++;
		assertEquals(count, lab.getCounter());
		lab.subtract(2,1);
		count ++;
		assertEquals(count, lab.getCounter());
		lab.divide(5, 2);
		count ++;
		assertEquals(count, lab.getCounter());
		lab.multiply(2, 2);
		count ++;
		assertEquals(count, lab.getCounter());
		lab.reverse("hi");
		count ++;
		assertEquals(count, lab.getCounter());
		lab.quote();
		count ++;
		assertEquals(count, lab.getCounter());
		
	}
		
	

	}
	

