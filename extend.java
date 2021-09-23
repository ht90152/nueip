class Transportation{
    private int wheel;
    private int cc;
    
    public Transportation() {wheel = 0; cc = 0;}
    public Transportation(int wheel, int cc) {this.wheel = wheel; this.cc = cc;} 
    public int getWheel() {return wheel;}
    public void setWheel(int wheel) {this.wheel = wheel;}
    public int getCC() {return cc;}
    public void setCC(int cc) {this.cc = cc;}
    public void drive(){
        System.out.println("drive");
    }
}
class Car extends Transportation{
    public Car() {setWheel(4);}
    @Override
    public void drive(){
        System.out.println("driving car");
    }
    public void openDoor(){
        System.out.println("open door");
    }
}
class Scooter extends Transportation{
    public Scooter() {setWheel(2);}
    @Override
    public void drive(){
        System.out.println("driving scooter");
    }
    public void openStorage(){
        System.out.println("open storage");
    }
}

public class Main
{
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("wheel:"+car.getWheel());
		car.drive();
		car.openDoor();
		
		Scooter scooter = new Scooter();
		System.out.println("wheel:"+scooter.getWheel());
		scooter.drive();
		scooter.openStorage();
		
	}
	
}