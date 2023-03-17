
public class AudioReg  extends ElementoMultimediale implements Playble  {

	private int volume;
	private int life;
	final static int VOLUME_DEFAULT=5;
	final static int LIFE_DEFAULT=10;
	

public AudioReg(){
		
	super("Audio");
	life=LIFE_DEFAULT;
	volume=VOLUME_DEFAULT;
	
}

public AudioReg(String title){
	super("AUDIO",title);
	life=LIFE_DEFAULT;
	volume=VOLUME_DEFAULT;
}

public AudioReg(String title,int life){
	this(title);
	this.life=life;
}

AudioReg(String title,int life,int volume){
	this(title,life);
	setVolume(volume);
}

public void setVolume(int volume) {
	this.volume=volume;
}

public void reduceVolume() {
	volume=volume-1;
}
public void increaseVolume() {
	volume=volume+1;
}
public void increaseVolume(int increaser) {
	volume=volume+increaser;
	
}
public void reduceVolume(int reducer) {
	volume=volume-reducer;
	
}

public void play() {
	for(int i=0;i<life;i++) {
		System.out.print(i+1);
		
		System.out.print(" ");
		for(int j=0;j<volume;j++) {
		System.out.print("!");
		}
		printTitle();
	}
	
}





}
