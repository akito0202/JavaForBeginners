
public class RectIf extends MyFrame {
	public void run() {
		int x=30;
		
		setColor(0,128,0);
		int i;
		int rgb=0;
		for ( i=0; i<9;i++) {
			
			setColor(rgb,rgb,rgb);
			fillRect(x,80,10,100);
			
			x+=20;
			rgb+=20;			
			
		}
		for( i=0;i<10;i++) {
			setColor(rgb,rgb,rgb);
			fillRect(x,80,10,100);
			
			x+=20;
			rgb-=20;
		}
	}

}
