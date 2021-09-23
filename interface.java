interface Transportation{
    public int getWheel();
    public void setWheel(int wheel);
    public int getCC();
    public void setCC(int cc);
    public void drive();
}
class Car implements Transportation{
    private int wheel = 4;
    private int cc;
    
    public int getWheel() {return wheel;}
    public void setWheel(int wheel) {this.wheel = wheel;}
    public int getCC() {return cc;}
    public void setCC(int cc) {this.cc = cc;}
    public void drive(){
        System.out.println("driving car");
    }
    public void openDoor(){
        System.out.println("open door");
    }
}
class Scooter implements Transportation{
    private int wheel = 2;
    private int cc;
    
    public int getWheel() {return wheel;}
    public void setWheel(int wheel) {this.wheel = wheel;}
    public int getCC() {return cc;}
    public void setCC(int cc) {this.cc = cc;}
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
