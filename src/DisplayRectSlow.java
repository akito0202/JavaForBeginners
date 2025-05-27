
public class DisplayRectSlow extends MyFrame{
	public void run() {
	setColor(0,128,0);
	
	int x=30;
	int y=0;
	while(x<=170) {
		fillRect(x,y+80,10,100);
		x+=20;
		y+=20;
		sleep(1);
	}

}
}
