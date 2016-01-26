import java.util.LinkedList;

public class DatasetBuilderTest implements DatasetBuilder{

	LinkedList <String> dataset = new LinkedList <String>();
	
	public DatasetBuilderTest() {
		
		
		
	}

	@Override
	public void setDatasetBuilder() {
		

		dataset.add("bomba");
		dataset.add("roma");
		dataset.add("attentato");
		dataset.add("attentatore");
		dataset.add("attaccare");
		dataset.add("ak-47");
		dataset.add("allah");
		dataset.add("akbar");
		dataset.add("strage");
		dataset.add("uccidere");
	}

	@Override
	public LinkedList<String> getDatasetBuilder() {
		
		return dataset;
	}

}
