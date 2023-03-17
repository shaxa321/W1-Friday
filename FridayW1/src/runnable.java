import java.util.Scanner; 


public class runnable {
	 static Scanner scanner= new Scanner(System.in);
	
	
	private static void insideSwtich(String type) {
		System.out.println("OTTIMO"+" Hai Scelto "+ type);
		//System.out.println("Vuoi inserire un titolo?/Altrimenti tutti i parametri saranno default");
		//System.out.println("Y/N");
		
	
		

	}
	
	
	final public static int LUNGHEZZA=5;
	 public static void main(String[] args) {
		 boolean finish=false;
		
		 ElementoMultimediale[] arrayElements=new ElementoMultimediale[LUNGHEZZA];
	     	System.out.println("//Regole:");
	     	System.out.println("Si puo dichiarare un audio con titolo,durata e volume con i parametri rigorosamente in questo oridne");
	     	System.out.println("Si puo omettere uno o piu, o tutti i  parametri, il sistema le prenderà di default");
	        
	     	for(int i=0;i<arrayElements.length;i++) {
	     		
	     		System.out.println("Elemento numero :"+(i+1)+"   Cosa Vuoi Scannerizzare?");
	     		System.out.println("Scegli tra audio,video,immagine");
	     		String response= scanner.nextLine().toUpperCase();
	     		 
	     		switch(response) {
	     		  case "AUDIO":
	     			  insideSwtich("AudioReg");
	     			  arrayElements[i]= new AudioReg();
	     			  System.out.println("Done");
	     			  
	     		    break;
	     		  case "IMMAGINE":
	     			  insideSwtich("Image");
	     			  arrayElements[i]= new Image();
	     			 break;
	     		  case "VIDEO":
	     			  insideSwtich("Video");
	     			  arrayElements[i]=new Video();
	     			 
	     		  default:
	     		    // code block
	     		}
	     		
	     		while(finish==false) {
	     			System.out.println("quale Elemento vuoi vedere?");
	     			response=scanner.nextLine();
	     			switch(response) {
	     			case "1":
	     			break;
	     			}
	     			
	     		}
	     	}
	 
	       
	    }
	 
}
