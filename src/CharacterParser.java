import java.util.LinkedList;

public class CharacterParser {
	public CharacterParserStrategy charstrategy;
	
	public CharacterParser(CharacterParserStrategy charstrategy) {
		
		this.charstrategy=charstrategy;
	}
	public void useCharacterParser(LinkedList<String> stringlist){
		charstrategy.setCharacterParserStrategy(stringlist);
		
	}
	LinkedList <Character> getParsedChar(){
	return charstrategy.getCharacterParserList();
	}
	
}
