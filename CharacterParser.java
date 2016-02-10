import java.util.LinkedList;
/* 
 * @CharacterParser has the responsibility to decide which concrete strategies are used for parsing character.
 * @buildAll is used to create strategies for parsing characters, and apply those strategy.
 * @getParsedCharacter return a list of all list of characters parsed with each strategy. 
 * 
 * @Note: CharacterParser act as 'Context' in the pattern Strategy. 
 */
public class CharacterParser {
	private LinkedList<LinkedList<Character>> listOfCharacter = new LinkedList<LinkedList<Character>>();
	//public CharacterParserStrategy charstrategy;
	
	public CharacterParser() {	
	}
    
	public void buildAll(LinkedList<LinkedList<String>> stringSources){
		
		CharacterParserStrategy[] characterStrategies = {
			new FixedIndexStrategy(0),
			new FixedIndexStrategy(1),
			new FixedIndexStrategy(2),
			new UpperCaseStrategy()
			
		};
		for(LinkedList<String> l : stringSources){
			
			for(CharacterParserStrategy characterStrategy : characterStrategies){
				
				characterStrategy.setCharacterParserStrategy(l);
				listOfCharacter.add(characterStrategy.getCharacterParserList());
			}
		}
	}
	
	LinkedList<LinkedList<Character>> getParsedCharacter(){
		 return listOfCharacter;
	 }
	
}
