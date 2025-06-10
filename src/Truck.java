
public class Truck extends Vehicle{
	
		public Truck(int x, int y, int vx, int vy) {
			super(x, y, vx, vy);
		}

		public void draw(MyFrame frame) {
			frame.fillOval(x+5,y+55,15,15);
			frame.fillOval(x+75, y+55, 15, 15);
			frame.fillOval(x+20, y+55, 15,15);
			frame.fillRect(x+70, y, 30,50 );
			frame.fillRect(x, y+25, 100, 30);
			// TODO 自動生成されたメソッド・スタブ
			
		}
		public void move() {
			x+=vx;
			y+=vy;

	}
	}
