package maven_code;

import org.testng.annotations.Test;

public class Grouping_TestCases
{
	@Test (groups= {"smoke"})
	public void testcase1()
	{
		System.out.println("Divanshu");
	}

	@Test (groups= {"smoke","system"})
	public void testcase2()
	{
		System.out.println("Rupa");
	}

	@Test (groups= {"smoke"})
	public void testcase3()
	{
		System.out.println("Choudhary");
	}

	@Test (groups= {"system"})
	public void testcase4()
	{
		System.out.println("Nagauri Marwadi Munch");
	}

}
