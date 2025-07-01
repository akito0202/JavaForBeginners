import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener{
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
//キーから文字が入力された時
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
//キーが押された時
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-10;
			
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vy=-10;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vy=10;
		}
		// TODO 自動生成されたメソッド・スタブ
		//System.out.println("キーは押されました");
	}
//押されていたキーが離された時
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=0;
			
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vy=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vy=0;
		}

	//public void move() {
		//x+=vx;
		//y+=vy;
		//if(x>450) {
			//x-=500;
		//}
	//}

}
}