import java.util.Scanner;

public class CommaStrategy extends StringParserStrategy{

	public CommaStrategy() {
		
	}

	@Override
	public void stringSeparatorElement(Scanner scanner) {
		
		 scanner.useDelimiter("\\s*,\\s*");
	}

}
