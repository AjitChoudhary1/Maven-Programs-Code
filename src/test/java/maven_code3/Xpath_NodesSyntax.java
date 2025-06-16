package maven_code3;

public class Xpath_NodesSyntax 
{
	// 1. Parent Node
	
	           //Tagname/parent::parentTagName
	
	// 2. Child Node
	
	           //ParentTagname/child::ChildTagname
	
	// 3. Sibling Node
	
	           //Label/following-Sibling::input
	
	// 4. Attribute Node
	
	          //Tagname/@ Attributename
	
	// 5. Cooment Node
	
	          //comment()
	
	// 6. Root Node
	
	         //      / or     /html
	
	// 7. Element Node
	
	         //Tagname
	
	//8. Text Node
	
	        // Tagname[.='value']     or    Tagname[text()='value']

}
