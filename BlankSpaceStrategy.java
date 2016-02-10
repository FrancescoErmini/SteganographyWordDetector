import java.util.LinkedList;
import java.util.Scanner;
/*
 * @BlankSpaceStrategy	has the responsibility to separate each string using blank spaces, 
 * 						or in other word to pick every word in the text.
 * @stringSeparatorElement	uses the scanner Java utility to separe words and
 * 							add those word to a list of string.
 * @getStringParsedList	return the list of string parsed from text with the blank strategy. 
 */
public class BlankSpaceStrategy extends StringParserStrategy{
	private LinkedList <String> parsedStringList=new LinkedList<String>();
	public BlankSpaceStrategy() {
		
	}
	@Override
	protected void stringSeparatorElement(Scanner scanner) {
		
		  scanner.useDelimiter("\\p{javaWhitespace}+");
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
