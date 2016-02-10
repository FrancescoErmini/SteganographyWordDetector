import java.util.LinkedList;
/*
 * @FixedIndexStrategy has the responsibility to apply the parsing strategy
 * 				       that pick each letter at a given index of every string
 * @setParserCharacterStrategy is the method that receive in input a list of string
 *  and give in output a list of character
 *  @getCharacterParsedList is the method used to access the parsed list of character
 */
public class FixedIndexStrategy implements CharacterParserStrategy{
	
	private LinkedList <Character> listofCharacter; 
	private int index;

	public FixedIndexStrategy( int index) {
		this.index=index;
	}
	
	public void setCharacterParserStrategy(LinkedList<String> listofString) {
		
		listofCharacter = new LinkedList <Character>(); /// serve per poter distingure le liste qundo uno stessa istanza di fixedindex visita prima Blank strategy e poi comma.
		 
				for(int i=0; i<listofString.size(); i++){

						if(listofString.get(i).length() > index) { //la lunghezza  della parola deve essre maggiore dell'index
							
							listofCharacter.add(listofString.get(i).charAt(index));
							
						}		
				}			
	}

	public LinkedList<Character> getCharacterParserList() {
		// TODO Auto-generated method stub
		return listofCharacter;
	}
		
	
	
}
	
	
	


