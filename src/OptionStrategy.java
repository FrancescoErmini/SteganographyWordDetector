import java.util.Scanner;

public class OptionStrategy extends StringParserStrategy{

	public OptionStrategy() {
		
	}

	@Override
	public void stringSeparatorElement(Scanner scanner) {
		
		 scanner.useDelimiter("\\s*,|.|;\\s*"); //TODO: ??? check regex syntax
	}

}
