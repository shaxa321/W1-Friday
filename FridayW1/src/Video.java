
public class Video extends ElementoMultimediale implements Playble,Shwoble {

	Video(){
		super("Video");
	}
	
	Video(String title) {
		super("Video",title);
		// TODO Auto-generated constructor stub
	}
	private int volume;
	private int life;
	private int luminosità;
	
	
	@Override
	public void show() {
		this.play();
		
	}
	@Override
	public void play() {
		for(int i=0;i<life;i++) {
			System.out.print(i+1);
			
			System.out.print(" ");
			for(int j=0;j<volume;j++) {
			System.out.print("!");
			}
			
			for(int k=0;k<luminosità;k++) {
			System.out.print("*");

			}
			printTitle();
		}
		
	}
	@Override
	public void increaseLuminosità() {
		luminosità=luminosità+1;
		
	}
	@Override
	public void reduceLuminosità() {
		luminosità=luminosità-1;
		
	}
	@Override
	public void setLuminosità(int Luminosità) {
		this.luminosità=Luminosità;
		
	}
	@Override
	public void increaseVolume() {
		volume=volume+1;
		
	}
	@Override
	public void reduceVolume() {
		volume=volume-1;
		
	}
	@Override
	public void setVolume(int volume) {
		this.volume=volume;		
	}
}
