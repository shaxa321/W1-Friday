import java.util.Scanner; 


public class runnable {
	 static Scanner scanner= new Scanner(System.in);
	
	
	private static String insideSwtich(String type) {
		System.out.println("OTTIMO"+" Hai Scelto "+ type);
		System.out.println("Scegli un titolo / il resto dei parametri sarà default per semplicità");
		String responseSwitch = scanner.nextLine();
		return responseSwitch;
		 
		

		//System.out.println("Vuoi inserire un titolo?/Altrimenti tutti i parametri saranno default");
		//System.out.println("Y/N");
		
	
		

	}
	
	
	final public static int LUNGHEZZA=5;
	 public static void main(String[] args) {
		 boolean finish=false;
		 int y=0; int n=0;
		 String name="";
		 
		 
		
		 ElementoMultimediale[] arrayElements=new ElementoMultimediale[LUNGHEZZA];
	     	System.out.println("//Regole:");
	     	System.out.println("Si puo dichiarare un audio con titolo,durata e volume con i parametri rigorosamente in questo oridne");
	     	System.out.println("Si puo omettere uno o piu, o tutti i  parametri, il sistema le prenderà di default");
	        
	     while(y<5) {
	     		
	     		System.out.println("Elemento numero :"+(y+1)+"   Cosa Vuoi Scannerizzare?");
	     		System.out.println("Scegli tra audio,video,immagine");
	     		String response= scanner.nextLine().toUpperCase();
	     		 
	     		switch(response) {
	     		  case "AUDIO":
	     			  name=insideSwtich("AudioReg");
	     			 
	     			  arrayElements[y]= new AudioReg(name);
	     		
	     			 
	     			  System.out.println("Done");
	     			  y=y+1;
	     			  
	     		    break;
	     		  case "IMMAGINE":
 
	     			  name=insideSwtich("Image");
	     			  arrayElements[y]= new Image(name);
	     			  y=y+1;
	     			 break;
	     		  case "VIDEO":
	     			  name=insideSwtich("Video");
	     			  arrayElements[y]=new Video(name);
	     			  y=y+1;
	     			  break;
	     			 
	     		  default:
	     		    System.out.println("HAI SCRITTO MALE RIPROVA");
	     		}
	     		
	     		
	     			
	     		}
	     	while(finish==false) {
     			System.out.println("quale Elemento vuoi vedere?/pigiare 100 per finire");
     			 n = Integer.parseInt(scanner.nextLine());
     			 if(n==100) {
     				 finish=true;
     			 } else {
     			 arrayElements[n].show}
     			
	     	}
	 
	       
	    }
	 
}
