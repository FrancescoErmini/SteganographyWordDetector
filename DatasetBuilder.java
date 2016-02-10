import java.util.LinkedList;

public class DatasetBuilder {
	private AlfabeticTree root;
	
	public DatasetBuilder() {
		
		root=null;
	}
	public AlfabeticTree getDatasetTreeRoot(){
		return this.root;
	}
	public void datasetBuilderTree(LinkedList <String> dataset){
		this.root= new AlfabeticLetter('0');
		AlfabeticTree index=root;
		char c;
		for(int i=0; i < dataset.size(); i++){
			for(int k=0; k<=dataset.get(i).length(); k++){
				/*prendi ciascuna lettera di ogni Stringa*/
				
				/*aggiungi in fondo a ogni parola un volore di end word. Questo e il Leaf dell albero */
				if(k==dataset.get(i).length()){
				c = AlfabeticTree.endLetter; 
				index.add(new LeafCharacter(c));
				}
				else {/* prendi la i-esima lettera della k-esima parola del dataset */
				c = dataset.get(i).charAt(k);
				}
				/* Se la lettera non e gia stata inserita nell albero va creata e aggiunta */
				if(index.hasLetter(c)==false){
					index.add(new AlfabeticLetter(c));
					index = index.findChildLetter(c);
				}
				/* altrimenti il riferimento si sposta propio sull oggetto contenete quella lettera*/
				else {
					index = index.findChildLetter(c);			
				}
				
					
			}
			index = this.root; 
		}
		
	
	}
}
