
public class Car extends Vehicle{
	public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//int x,y,vx,vy;
	//public Car(int x,int y,int vx,int vy) {
		//this.x=x;
		//this.y=y;
		//this.vx=vx;
		//this.vy=vy;
	//}
	public void draw(MyFrame frame) {
		frame.fillOval(x+10,y+25,15,15);
		frame.fillOval(x+35, y+25, 15, 15);
		
		frame.fillRect(x, y+15, 60, 15);
		frame.fillRect(x+10, y, 40, 20);
			
		
	}
	
	//public void move() {
		//x+=vx;
		//y+=vy;
		//if(x>450) {
			//x-=500;
		//}
	//}

}
