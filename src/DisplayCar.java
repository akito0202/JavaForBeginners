
public class DisplayCar extends MyFrame{
	public void run() {
		Car face1=new Car(50,50,10,0);
				
		Car face2=new Car(250,150,-10,0);
		for(int i=0;i<30;i++) {
			clear();
		
		face1.draw(this);
		face2.draw(this);
		
		face1.move();
		face2.move();
		sleep(0.1);

}
	}
	}
