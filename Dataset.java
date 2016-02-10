import java.util.LinkedList;
/*
 * @Dataset	has two responsibility , first dump the list of string hosted somewhere 
 * 						second, build a composite tree structure using letter found on text.
 *@getDatasetTree		ritorna la radice dell'albero creato
 *@Visita	
 */
public class Dataset{

	DatasetImplementor datasetImplementor;
	DatasetBuilder datasetBuilder;
	public Dataset(DatasetImplementor datasetImplementor, DatasetBuilder datasetBuilder){
		this.datasetImplementor = datasetImplementor;
		this.datasetBuilder=datasetBuilder;
	}
	
	public LinkedList <String> getDataset(){
		return this.datasetImplementor.datasetImplementor();
	}
	
	public AlfabeticTree getDatasetTree(){
		return this.datasetBuilder.getDatasetTreeRoot();
	}
	
	public void visit(){
		
		if(this.datasetBuilder.getDatasetTreeRoot()==null){
			throw new Error("Albero non creato. ");
		}
		this.datasetBuilder.getDatasetTreeRoot().scan();	
	}

	public void buildDatasetTree(LinkedList <String> dataset) {
		
		this.datasetBuilder.datasetBuilderTree(dataset);
		
	}

}
