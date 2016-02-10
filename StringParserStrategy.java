import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;
/*
 * @StringParserStrategy define an abstract class for concrete string strategies. 
 * 						It uses abstract class to favor reuse of scanner code.
 */
public abstract class StringParserStrategy {
	
	private static Path path;
	
	public static void setPath(String fileName){
		StringParserStrategy.path = Paths.get(fileName);		
	}
	
	public  LinkedList<String> stringSeparator(){
		
        Scanner scanner = null;
        try {
			scanner = new Scanner(path);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		stringSeparatorElement(scanner);
		
		scanner.close();
		return getStringParsedList();
	}
	
	protected abstract void stringSeparatorElement(Scanner scanner);
    public abstract  LinkedList<String> getStringParsedList();
   
}
