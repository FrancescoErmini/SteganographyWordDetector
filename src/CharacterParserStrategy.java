import java.util.LinkedList;

public abstract class CharacterParserStrategy {
	LinkedList <Character> listofCharacter=new LinkedList <Character>();
	public CharacterParserStrategy() {
		
		
	}
	public abstract void setCharacterParserStrategy(LinkedList<String> listofString);
	
	
	public LinkedList<Character> getCharacterParserList(){
		return listofCharacter;
	}

}
