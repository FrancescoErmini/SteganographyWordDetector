import java.util.LinkedList;
/*
 * @UpperCaseStrategy	has the responsibility to apply the parsing strategy
 * 						that pick every UpperCase letter of every string.
 * @setCharacterParserStrategy	is the method that receive in input a list of string 
 * 								and give on output a list of character.
 * @getCharacterParserList		is the method used to return the list of character
 */
public class UpperCaseStrategy implements CharacterParserStrategy{
	private LinkedList <Character> listofCharacter; 
	
	public UpperCaseStrategy() {
		
	}

	public void setCharacterParserStrategy(LinkedList<String> listofString) {
		listofCharacter = new LinkedList <Character>(); 
		
		String currentString;
		Character currentCharacter;
		for(int i=0; i<listofString.size(); i++){
			currentString =listofString.get(i);
			for(int l=0;l< currentString.length(); l++){
				currentCharacter = currentString.charAt(l);
				if(Character.isUpperCase(currentCharacter)==true){
					currentCharacter=Character.toLowerCase(currentCharacter.charValue());
					listofCharacter.add(currentCharacter);
				}
			}
			
		}
		
	}

	public LinkedList<Character> getCharacterParserList() {
		// TODO Auto-generated method stub
		return listofCharacter;
	}

}
