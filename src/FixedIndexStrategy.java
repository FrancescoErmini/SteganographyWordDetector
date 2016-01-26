import java.util.LinkedList;

public class FixedIndexStrategy extends CharacterParserStrategy{
	private int index;
	public FixedIndexStrategy(int index ) {
		this.index=index;
	}

	@Override
	public void setCharacterParserStrategy(LinkedList<String> listofString) {
		
		
			for(int i=0; i<listofString.size(); i++){
			
					if(listofString.get(i).length() > 1) {
						
						listofCharacter.add(listofString.get(i).charAt(this.index));
						
					}
					
				}
	
		}
		
	
	
	}
	
	
	


