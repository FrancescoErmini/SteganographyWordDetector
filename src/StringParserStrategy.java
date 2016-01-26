import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public abstract class StringParserStrategy {
	/*
	 * @TODO sposta questa lista da qui a un altro posto?.
	 */
	LinkedList <String> parsedText = new LinkedList<String>();
	public StringParserStrategy() {
		
	}
	public  void stringSeparator(String fileName){
		
        Path path = Paths.get(fileName);
        Scanner scanner = null;
        try {
			scanner = new Scanner(path);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		stringSeparatorElement(scanner);
		while(scanner.hasNext()){
			
			String s = scanner.next().toString();
			  parsedText.add(s);
			 
		}
		scanner.close();
	}
	/*
	 * @TODO Fragile base class? How to close possible extension of this method?
	 */
	protected abstract void stringSeparatorElement(Scanner scanner);
	public LinkedList<String> getParsedList(){
		/*
		 * TODO guardia, se la lista è vuota
		 */
		return this.parsedText;
	}
}
