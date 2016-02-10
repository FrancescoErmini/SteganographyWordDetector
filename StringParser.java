import java.util.LinkedList;
/*
 * @StringParser has the responsibility to decide which concrete strategies are used for parsing strings.
 * @buildAll is used to create strategies for parsing string, and apply those strategy.
 * @getParsedString return a list of all list of string parsed with each strategy. 
 * 
 * @Note: StringParser act as 'Context' in the pattern Strategy. 
 */
public class StringParser {
	LinkedList<LinkedList<String>> listOfString = new LinkedList<LinkedList<String>>();
	
	public StringParser() {
	}

	public void setSourcePath(String filePath){
		
		StringParserStrategy.setPath(filePath);
	}
	 
	 public  void buildAll(){
		 StringParserStrategy[] stringStrategies = {
					new BlankSpaceStrategy(),
					new CommaStrategy()
			};
		 for(StringParserStrategy stringStrategy : stringStrategies){
			 
			 listOfString.add(stringStrategy.stringSeparator());
		 } 
		 
	 }
	 public LinkedList<LinkedList<String>> getParsedString(){
		 return listOfString;
	 }
	
}
