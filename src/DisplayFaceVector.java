import java.util.Vector;

public class DisplayFaceVector extends MyFrame{
	public void run() {
		Vector<Car>car=new Vector<Car>();
		car.add(new Car(50,50,10,0));
		car.add(new Car(50,150,15,0));
		car.add(new Car(50,250,20,0));
		car.add(new Car(50,350,25,0));
		car.add(new Car(50,450,30,0));
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
