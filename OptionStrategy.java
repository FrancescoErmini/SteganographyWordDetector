import java.util.LinkedList;
import java.util.Scanner;

public class OptionStrategy extends StringParserStrategy{
	private LinkedList <String> parsedText=new LinkedList<String>();
	public OptionStrategy() {
		
	}

	@Override
	public void stringSeparatorElement(Scanner scanner) {
		
		 scanner.useDelimiter("\\s*,|.|;\\s*"); //TODO: ??? check regex syntax
		 while(scanner.hasNext()){
				
				String s = scanner.next().toString();
				  parsedText.add(s);
				 
			}
	}

	@Override
	public LinkedList<String> getStringParsedList() {
		// TODO Auto-generated method stub
		return this.parsedText;
	}

}
