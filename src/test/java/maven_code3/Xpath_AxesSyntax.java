package maven_code3;

public class Xpath_AxesSyntax
{
	// 1. Ancestor

	             // TN[AN=AV]/ancestor::select

	// 2. Ancestor-or-self

	             // TN[AN=AV]/ancestor-or-self::*        (Change * if know the name)

	// 3. Descendant

	             // Select[ID='value']/descendant::option

	// 4. Descendant-oself

                    // Select[ID='value']/descendant-or-self::option

	// 5. Child

	              // div/child::span

	// 6. Parent

	              // input/parent::div

	// 7. Following

	               // div/following::*

	// 8. Following-Sibling

                   // div/following-sibling::*

	// 9. Preceding

	               // div/preceding::*

	// 10. Preceding-sibling

	               // div/preceding-sibling::*


}
