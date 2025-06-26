package maven_code3;

public class Jenkins_CronSyntax
{

	  // 1. * -> Minute(0-59)
	  // 2. * -> Hour(0-23)
	  // 3. * -> Day of month(1-31)
	  // 4. * -> Month(1-12)
	  // 5. * -> Day of week(1-7)


	          // * -> means every (what we choose like hour day etc.)


	// 1. Run at 9.30am

	       // 30 9 * * *

	// 2. Today at 16.05pm

	       // 05(minute) 16(hour) 15(date) 06(month) *(day of week)

	// 3. Run 11.45pm last day of month

	       // 45 23 L * *

	              // L -> For last day of month




}
