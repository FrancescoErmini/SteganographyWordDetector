import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Client {
	
	public static void main(String[] args) {
		
		/** Dataset is responsible of get a predefined dataset of keywords
		 * and generate a tree structure that represent those words.
		 * 
		 * @Note Dataset is build according to the Builder Pattern.
		 * This allows different ways of get the dataset e.g using MySQL, csv, xml.
		 */
		Dataset d = new Dataset(new DatasetBuilderTest());		
		d.setDataset();	
		d.buildDatasetTree(d.getDataset(), d.getDatasetTree());
		
		/**
		 * StringParser is responsible of get the path of the text file
		 * then apply  a parsing strategy that generate a list of String
		 * 
		 * @Note StringParser is build according to the Strategy Pattern
		 */
		System.out.println("Apply Blank Spaces Strategy");
		StringParser p = new StringParser(new BlankSpaceStrategy());
		p.useStringParser("/Users/Francesco/Desktop/Annuncio.txt");
		System.out.println("Parsed list of string" + p.strategy.getParsedList()); 
		/**
		 * CharacterParser is responsible of get the list of String 
		 * then apply a parsing strategy that generate a list of Character.
		 */
		System.out.println("Apply Fixed Index Strategy");
		CharacterParser c = new CharacterParser(new FixedIndexStrategy(1));
		c.useCharacterParser(p.strategy.getParsedList());
		System.out.println("Parsed list of character" + c.getParsedChar() ); 
		System.out.println("\n");
		
		/**
		 * use an array of stack to store character that matches words 
		 */
		List<Stack<Character>> outputStacks = new ArrayList<Stack<Character>>();
		
		/**
		 * WordVisitor is responsible of search the characters parsed from text in the dataset tree.
		 * 
		 * @Note WordVisitor is implemented as finite state machine. 
		 * It's the concrete object of the Visitor pattern.
		 */
		if(true==d.getDatasetTree().accept(new WordVisitor(c.getParsedChar(),outputStacks))){
			System.out.println("Stop.");
		};
		
		System.out.println(outputStacks);
		
	}

}
