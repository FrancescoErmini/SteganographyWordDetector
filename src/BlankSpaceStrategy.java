import java.util.Scanner;

public class BlankSpaceStrategy extends StringParserStrategy{

	public BlankSpaceStrategy() {
		
	}

	@Override
	protected void stringSeparatorElement(Scanner scanner) {
		
		// scanner.useDelimiter("[A]+");
		  scanner.useDelimiter("\\p{javaWhitespace}+");
	}

}
