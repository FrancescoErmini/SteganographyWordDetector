import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoIterator {

	public DemoIterator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/** Dataset is responsible of get a predefined dataset of keywords
		 * and generate a tree structure that represent those words.
		 * 
		 * @Note Dataset is build according to the Bridge Pattern.
		 * This allows different ways of get the dataset e.g using MySQL, csv, xml.
		 * 
		 * Dataset play both the role of Abstraction in the bridge pattern (faced to DatasetImplementor as Implementor)
		 * and the role of Director in the builder pattern (faced to DatasetBuilder as Builder of Composite Tree)
		 */
		Dataset d = new Dataset(new DatasetImplementorTest(), new DatasetBuilder());		
			
		d.buildDatasetTree(d.getDataset());
		
		//System.out.println("Visit dataset tree.");
		d.getDatasetTree().scan();
		
		/**
		 * StringParser is responsible of get the path of the text file
		 * then apply  a parsing strategy that generate a list of String
		 * 
		 * @Note StringParser is build according to the Strategy Pattern
		 */
		String paths[]={ "/Users/Francesco/Desktop/Annuncio.txt",
				"/Users/Francesco/Desktop/Annuncio2.txt",
				"/Users/Francesco/Desktop/Annuncio3.txt",
				"/Users/Francesco/Desktop/Annuncio4.txt",
				"/Users/Francesco/Desktop/Annuncio5.txt",
				"/Users/Francesco/Desktop/Annuncio6.txt",
				"/Users/Francesco/Desktop/Annuncio7.txt"
		};
		
		
		StringParser stringParser=new StringParser();
		
		stringParser.setSourcePath(paths[0]);
		
		stringParser.buildAll();
		
		CharacterParser  characterParser=new CharacterParser();
		characterParser.buildAll(stringParser.getParsedString());
		
		List<Stack<Character>> stack;
		
		for(int q=0;q<characterParser.getParsedCharacter().size();q++){
		//System.out.println("\n" + characterParser.getParsedCharacter().get(q));
		
		stack=new ArrayList<Stack<Character>>();
		if(true==d.getDatasetTree().accept(new WordVisitor(characterParser.getParsedCharacter().get(q) , stack))){
			
			/*System.out.println("Success "+"with StringParserStrategy n°"
			+stringParser.getCurrentStringStrategy()+" and CharacterParserStrategy n°"+characterParser.getCurrentCharacterStrategy()+
			" and fonund words " + stack);*/
			System.out.println("Match found on sentence parsed with strategy "+q+". \n Found words: " +stack);
		}
		else
			{
			System.out.println("No match found on sentence parsed with strategy " + q+". ");
			}
	
		
		}
	
		}
			
		
		
		
	

}
