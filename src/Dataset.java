import java.util.LinkedList;

public class Dataset{
	
	
    AlfabeticTree root=null;
	
	DatasetBuilder datasetbuilder;
	public Dataset(DatasetBuilder datasetbuilder){
		this.datasetbuilder = datasetbuilder;
	}
	public void setDataset(){
		this.datasetbuilder.setDatasetBuilder();
	}
	public LinkedList <String> getDataset(){
		return this.datasetbuilder.getDatasetBuilder();
	}
	public AlfabeticTree getDatasetTree(){
		if(root == null) {
		root =  new AlfabeticLetter('0');
		}
		return root;
	}
	public void visit(){
		root.scan();
	}
	public AlfabeticTree getTreeRootElement(){
		if(root != null) {
			return root;
		}
		else
			
			throw new Error("AlfabeticTree not created. ");
	}

	public void buildDatasetTree(LinkedList <String> dataset, AlfabeticTree index) {
		
		
		
		
		
		char c;
		for(int i=0; i < dataset.size(); i++){
			for(int k=0; k<=dataset.get(i).length(); k++){
				//prendi ciascuna lettera di ogni Stringa.
				
				//aggiungi in fondo a ogni parola un volora di end word. Questo è il Leaf dell albero.
				if(k==dataset.get(i).length()){
				c = AlfabeticTree.endLetter; //todo: mettere valore in una variabile
				index.add(new CarriageReturn(c));
				}
				else {
				c = dataset.get(i).charAt(k);
				}
				//Se la lettera non è già stata inserita nell'albero, va creata e aggiunta.
				if(index.hasLetter(c)==false){
					
					index.add(new AlfabeticLetter(c));
					///node.letter=c;
					index = index.findChild(c);
				}
				// altrimenti il riferimento si sposta propio sull'oggetto contenete quella lettera
				else {
					
					index = index.findChild(c);
							
				}
				
					
			}
			index = this.root; //TODO non so questo ripristina il riferimento al root
		}
		
	}

}
