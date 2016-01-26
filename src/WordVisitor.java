
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class WordVisitor implements TreeVisitor{
	LinkedList <Character> inputStream = new LinkedList <Character>();
	List<Stack<Character>> stacks;
	//Map <Integer,List<Character>> outputStream = new HashMap <Integer,List<Character>>();
	private AlfabeticTree rootref;
	public WordVisitor() {
		
		
	}
	public WordVisitor(LinkedList <Character> inputStream, List<Stack<Character>> stacks){
		this.inputStream=inputStream;
		this.stacks=stacks;
		
	}
	
	@Override
	public boolean matchLetters(AlfabeticTree index){ 
		this.rootref=index;
		
		
		
		
		boolean found = false;
		
		/*
		 * FSM receives an input list of letters inputStream and search for sequences of letters 
		 * that match keyword represented in the tree structure index.    
		 * If one or many words are found it print a success message and print those words.
		 */
		int status=0;
		int indexStream=0;
		int countedWord=0;
		//outputStream.put(countedWord, new Stack());
		//List<Stack<Character>> stacks = new ArrayList<Stack<Character>>();
		stacks.add(countedWord, new Stack<Character>());
		while(indexStream < inputStream.size()) 
		{
			
		switch (status){
		
				case 0: 
					
					/* When you reach the last character of a word you find an endLetter character on the tree structure*
					 */
					
					if(true==index.hasLetter(AlfabeticTree.endLetter)){
						
						status = 2; //sequences of characters has match an full word on the tree	
						
						
					}
					else {
						
					/* If the current character isn't found between children of current index tree, 
					 * Pick another character (incrementing indexStream), restore the index to the root of the tree 
					 * and restart from state zero to search new words.
					 */
							if(false==index.hasLetter(inputStream.get(indexStream).charValue())){
							++indexStream; 
							index=this.rootref;
							status = 0; //no character matches, restart.
							} 
							
					/* If the current character is found between children of current index tree,
					 * set the status to one.
					 */
							else {
							
							status = 1; //sequences of characters has match a the first part of a word, but it's still incomplete
							
							stacks.get(countedWord).add(inputStream.get(indexStream));
							
							}
					}
					break;	
					
				case 1:	
					
					/* When a character is found, the index move down on this character. 
					 * Then a new character is picked and the process restart from state zero with the new index
					 */	
						index = (AlfabeticLetter) index.findChild(inputStream.get(indexStream).charValue());
						++indexStream;
						status = 0;
						
					break;
					
					/* When a sequence of a character matches a word notify the success.
					 * Then restore the index to the root of the tree and continue searching others words.
					 */
					
				case 2:
						
						
						index=rootref;
						status=0;
						stacks.add(++countedWord, new Stack<Character>());
						
						System.out.println("Found "+countedWord+" words.");
						found=true;
						break;
				    
			}
		
		}	 
		
		return found;
		
	}
	

}
