
public class LeafCharacter extends AlfabeticTree{
	char c;
	public LeafCharacter(char c) {
		
		this.c=c;
	}

	@Override
	public void scan() {
		
	}

	@Override
	public boolean hasLetter(char in){
		
		if(this.c==in){
			return true;
		}
		
		return false;
	}

	

}
