import java.util.Vector;

public class DisplayFaceVector extends MyFrame{
	public void run() {
		Vector<Car>car=new Vector<Car>();
		car.add(new Car(50,50,1,0));
		car.add(new Car(50,150,2,0));
		car.add(new Car(50,250,3,0));
		car.add(new Car(50,350,4,0));
		car.add(new Car(50,450,5,0));
		for(int i=0;i<30;i++) {
			clear();
			for(int j=0;j<car.size();j++) {
				car.get(j).draw(this);
				car.get(j).move();
			}
			sleep(0.1);
		}
	}

}
