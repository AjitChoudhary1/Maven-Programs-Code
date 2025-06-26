package maven_code1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertHard_Mthd_SoftAssert_Mthd_Assertion_Mthd
{
	          //AssertHard Method

	   @Test
	   public void assertHard0()
	   {
		   Assert.assertTrue(true);
	   }

	   @Test
	   public void assertHard1()
	   {
		   Assert.assertTrue(false);
	   }

	   @Test
	   public void assertHard2()
	   {
		   Assert.assertFalse(false);
	   }

	   @Test
	   public void assertHard3()
	   {
		   Assert.assertFalse(true);                       // All 5 are AssertHard Method
	   }

	   @Test
	   public void assertHard4()
	   {
		   Assert.assertNotEquals(getClass(), getClass());
		   Assert.assertEquals("", "");
	   }




	          // SoftAssert Method

	   @Test
	   public void SOftassert()
	   {
	            SoftAssert s1= new SoftAssert();
	                s1.assertAll();
	                  s1.assertAll("");
	                    s1.assertEquals("", "");
	                      s1.assertNotEquals("", "");
	   }



	          // HardAssert(Assertion) Method

	   @Test
	   public void Assertion()
	   {
		   Assertion a1= new Assertion();
		          a1.assertEquals("", "");
		             a1.assertNotEquals("", "");
	   }



}
