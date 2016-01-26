

public class StringParser {
	
	StringParserStrategy strategy;
	public StringParser(StringParserStrategy strategy) {
		
		this.strategy=strategy;
		
	}
	public void useStringParser(String path){
		strategy.stringSeparator(path);
	}
	
	
}
