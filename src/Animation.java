
public class Animation extends MyFrame{
	public void run() {
		int y=100;
		int x=30;
		while(y>=10) {
			clear();
			setColor(0,128,0);
			fillRect(x,y+100,10,100);
			y-=5;
			
			sleep(0.1);
			
			}
		while(x<=300) {
			clear();
			setColor(0,128,0);
			fillRect(x,y+100,10,100);
			
			x+=5;
			sleep(0.1);
			
	}

}
}
