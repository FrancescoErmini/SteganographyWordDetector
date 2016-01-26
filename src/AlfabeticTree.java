

public abstract class AlfabeticTree {
	char letter;
	static protected char rootLetter = '0';
	static protected char endLetter = ';';
	
	public abstract boolean accept(TreeVisitor visitor);
	public abstract void scan();
	public AlfabeticTree getNext(int i){
		throw new UnsupportedOperationException("Operation not supported");
	}
	public AlfabeticTree findChild(char c){
		throw new UnsupportedOperationException("Operation not supported");
	}
	public boolean hasLetter(char c){
		throw new UnsupportedOperationException("Operation not supported");
	}
	public void add(AlfabeticTree node){
		throw new UnsupportedOperationException("Operation not supported");
	};
	public void remove(AlfabeticTree node){
		throw new UnsupportedOperationException("Operation not supported");
	};
	
}
