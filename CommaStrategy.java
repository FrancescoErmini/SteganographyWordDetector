import java.util.LinkedList;
import java.util.Scanner;
/*
 * @CommaStrategy	has the responsibility to separete each string using comma. 
 * 					This is useful in case a comma is taken as reference to find the hidden letter.
 * @stringSeparatorElement	is the method that parse the text and return pieces of text between commas. 
 * @getStringParsedList	is the method that return the list of string.
 */
public class CommaStrategy extends StringParserStrategy{
	private LinkedList <String> parsedStringList=new LinkedList<String>();
	public CommaStrategy() {	
	}

	@Override
	public void stringSeparatorElement(Scanner scanner) {
		
		 scanner.useDelimiter("\\s*,\\s*");
		 while(scanner.hasNext()){
				
				String s = scanner.next().toString();
				  parsedStringList.add(s);	 
			}
	}
	@Override
	public LinkedList<String> getStringParsedList() {
		
		return this.parsedStringList;
	}

}
