
public class Image extends ElementoMultimediale implements Shwoble{
	public final static int LUMINOSIT_DEFAULT=5;
	private int luminosità;
	
public Image() {
	super("Img");
	luminosità=LUMINOSIT_DEFAULT;
}

public Image(String title) {
	super("img",title);
	luminosità=LUMINOSIT_DEFAULT;
}

public Image(String title,int luminosità) {
	this(title);
	this.luminosità=luminosità;
}

public void show() {
	
		
		
		for(int i=0;i<luminosità;i++) {
		System.out.print("*");

		}
		printTitle();
	}

@Override
public void increaseLuminosità() {
	// TODO Auto-generated method stub
	luminosità=luminosità+1;
}

@Override
public void reduceLuminosità() {
	// TODO Auto-generated method stub
	luminosità=luminosità-1;
	
}

@Override
public void setLuminosità(int luminosità) {
	this.luminosità=luminosità;
	
}
}

