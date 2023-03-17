
public class ElementoMultimediale {

	protected String title;
	private static int ID=0;
	
	
	
	ElementoMultimediale(String type){
		ID=ID+1;
		title=type+"_GLOBALID_"+Integer.toString(ID);
	}	

	ElementoMultimediale(String type,String title){
	this(type);
	this.title=title;
	}
	
	protected void printTitle() {
		System.out.println(" title:"+title);
	}
	
	protected void printID() {
		System.out.println(ID);
	}

}
