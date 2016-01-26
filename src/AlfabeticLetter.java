import java.util.LinkedList;

public class AlfabeticLetter extends AlfabeticTree{
	
	
	private LinkedList <AlfabeticTree> children = new LinkedList <AlfabeticTree> ();
	
	public AlfabeticLetter(char letter) {
			
		this.letter=letter;
		
		}

	@Override 
	public AlfabeticTree getNext(int i){
				
				AlfabeticTree tmp = children.get(i);
				
				return tmp;
				
				
	
	}
		
	@Override
	public boolean hasLetter(char c){
		
		/*  
		 */
		if(children.isEmpty()) {
			
			return false;
		}
		
		for(int i=0; i<children.size(); i++){
			
			if(c == children.get(i).letter){
				
				
				return true; // NB: così ti fermi appena trovi la lettera, migliori efficenza.
				
			};
		}
		
		return false;
		
	}
	
	@Override
	public AlfabeticTree findChild(char c){
		for(int i=0; i<children.size(); i++){
			if( c == children.get(i).letter) {
				return children.get(i);
			}
		}
		return null;
	}
	@Override
	public void scan() {
		System.out.println(this.letter);
		
		for(int i=0; i<children.size(); i++){
			children.get(i).scan();
		}
	}
	@Override
	public void add(AlfabeticTree node){
		
		
		children.add(node);
		
	}
	@Override
	public boolean accept(TreeVisitor visitor){ 
		
		return visitor.matchLetters(this);
		
	}
	
}
