import java.util.LinkedList;
/*
 * @CharacterParserStrategy has the responsibility to implements all methods of concrete character strategy.
 * 
 * @Note CharacterParserStrategy  is the 'Strategy' of the Strategy pattern.  
 */
public interface CharacterParserStrategy {
	
	
	public void setCharacterParserStrategy(LinkedList<String> listofString);
	
	public LinkedList<Character> getCharacterParserList();
		

}
