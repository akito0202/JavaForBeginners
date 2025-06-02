
public class Animation extends MyFrame{
	public void run() {
		int y=10;
		int x=10;
		while(x<=250) {
			clear();
			setColor(0,128,0);
			fillRect(x,y+100,10,100);
			x+=5;
			y+=3;
			
			sleep(0.1);
			
			}
			
		
		while(x>=30) {
			clear();
			setColor(0,128,0);
			fillRect(x,y+100,10,100);
			
			x-=3;
			
			sleep(0.1);
			
			}
		while(y>=0) {
			clear();
			setColor(0,128,0);
			fillRect(x,y+100,10,100);
			
			x+=3;
			y-=3;
			
			sleep(0.1);
		
			
	}

}
}

