
public class Animation extends MyFrame{
	public void run() {
		int y=10;
		int x=10;
		
		int count=0;
		
		for(count=0;count<=3;count++) {
		while(x<300) {
			clear();
			setColor(0,128,0);
			fillRect(x,y+100,10,100);
			
			x+=10;
			
			
			sleep(0.1);
			
			}
		while(x>=10) {
			clear();
			setColor(0,128,0);
			fillRect(x,y+100,10,100);
			
			x-=10;
			
			
			sleep(0.1);
			
			}
		
		
			
		
		
}
}
}

