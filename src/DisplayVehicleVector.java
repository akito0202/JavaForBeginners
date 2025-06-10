import java.util.Vector;


	public class DisplayVehicleVector extends MyFrame{
		public void run() {
			Vector<Vehicle>vehicles=new Vector<Vehicle>();
			vehicles.add(new Car(10,30,3,0));
			vehicles.add(new Car(250,80,-3,0));
			vehicles.add(new Train(200,120,5,0));
			vehicles.add(new Train(100,200,-5,0));
			vehicles.add(new Truck(10,250,7,0));
			vehicles.add(new Truck(100,330,7,0));
			
			for(int i=0;i<100;i++) {
				clear();
				for(int j=0;j<vehicles.size();j++) {
					vehicles.get(j).draw(this);
					vehicles.get(j).move();
				}
				sleep(0.1);
				
					
				}
			}
			

}
