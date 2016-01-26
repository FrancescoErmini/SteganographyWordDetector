

public class CarriageReturn extends AlfabeticTree{
	char c;
	public CarriageReturn(char c) {
		
		this.c=c;
	}

	@Override
	public void scan() {
		System.out.println(this.c);
	}

	@Override
	public boolean hasLetter(char in){
		
		if(this.c==in){
			return true;
		}
		
		return false;
	}

	@Override
	public boolean accept(TreeVisitor visitor) {
		
		return visitor.matchLetters(this);
	}

	

}
