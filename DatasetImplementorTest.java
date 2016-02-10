import java.util.LinkedList;
/*
 * @DatasetImplementorTest	is a proof of concept instance that aims to 
 * 							demonstrate the dump of a dataset.
 * 							The dataset could be implemented as MySQL or csv file or whatever.
 * @datasetImplementor	is a method that dump a set of words and add those words in the list dataset.
 * 
 * @Note DatasetImplementor act as the 'ConcreteImplementation' on the bridge patter.
 */
public class DatasetImplementorTest implements DatasetImplementor{
	
	LinkedList <String> dataset = new LinkedList <String>();
	
	public DatasetImplementorTest() {
	}

	@Override
	public LinkedList<String> datasetImplementor() {
	
		dataset.add("attentato");
		dataset.add("attaccare");
		dataset.add("attivista");
		dataset.add("allah");
		dataset.add("spacciare");
		dataset.add("uccidere");
		dataset.add("bomba");
		dataset.add("roma");
		dataset.add("ingegneria");
		dataset.add("del");
		dataset.add("software");
		
		dataset.add("dog");
		dataset.add("cat");
		return dataset;
	}

}
